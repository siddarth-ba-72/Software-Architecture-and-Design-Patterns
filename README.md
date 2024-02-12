# Design Principles
- High level guidelines to design reusable software
- Pure abstraction - without implementing or programming language
- Applied to any programming language
- Platform independent

## SOLID Design Principles:
### 1. Single Responsibility Principle
- Every single class/method should have only a single reason to change
- Multiple operation: violation
- Loosely couples: Classes are independent of each others
- Interfaces are quite powerful tools to achieve this
- A class should not have too many responsibilities
### 2. Open-Closed Principle
- New functionalities should be added with minimum changes
- Open for extension but closed for modification
- Reuse the components
### 3. Liskov Substitution Principle
- Objects of a super class shall be replaceable with the objects of its subclasses without breaking the application
- Child classes should never break the parent class type definition
- Derived types must be completely suitable fot their base types
- Child classes should behave same as Parent classes
### 4. Interface Segregation Principle
- Software modules should not be forced to depend on upon the interfaces which they do not use
- Not good for interface to have large number of methods
- Break our interfaces into smaller ones
- Satisfy the exact need of the software modules
### 5. Dependency Inversion
- High level modules rely on Low level modules
- We build Low level modules and then build High level modules based on low level modules
- High level modules should not depend on low level modules but depend on abstraction
- Abstractions should not depend on details, details should depend on abstractions
- If we want to change the low level implementations then we also need to change the high level module
- For this reason we need abstractions
- Avoid tightly coupled code

# Design Patterns
- Low level solution of frequent OOP related problems
- Concrete implementations
- Several design principle can be implemented by design patterns
- Design patterns are tested by others - state-of-the-art problem specific solutions

## I. Creation Design Patterns:
In software engineering creational patterns provide various object creation mechanisms which increase flexibility and reuse of existing code.
### 1. Singleton Design Pattern
- Class has only one instance while providing global access point to this instance
- Ensures that a given class has just a single instance
- Provides a global access point to that given instance
- Can control access to a shared resource such as files, databases ot thread pools
- Extremely crucial in logging
### 2. Factory Design Pattern
- Helps create loosely couples OOP design
- Whenever `new` keyword is used we definitely violate this principle
- Trying our code to concrete classes makes the application less flexible and more fragile
- If we program to an interface then code will work fine with any other classes implementing that interface
- Can get rid of `new` keyword
### 3. Builder Design Pattern
- No.1 Design pattern in software engineering
- Large number of variables may be overwhelming
- If we want to add another parameter then we have to change the constructor
- So we create multiple constructors - `Telescoping Constructor`
- Satisfies the  immutable property
- Create object itself at the last step of the process
### 4. Prototype Design Pattern
- Able to copy existing objects without depending on those given classes
- Usually we program to an interface or a `supertype` 
- In this case we have access to the methods and variables that are defined in the interface, This is the drawback of Abstraction
- Delegate the object creation problem to the object itself
- Clone method creates a new instance with all the field values
- An object that supports the cloning operation is a `prototype`
- In Java, we implement `Cloneable` interface and define the `clone()` method
- Eliminate the need of inheritance with protottpe pattern
- Do not bother with configuration issues

## II. Behavioral Design Patterns:
In software engineering behavioral design patterns are design patterns that identify common communication patterns between objects. These patterns increase flexibility in carrying out the communication.
### 1. Strategy Design Pattern
- Enable selecting an algorithm at run-time
- Define a family of algorithms , put each of them into separate class, and make their objects interchangeable
- Encapsulation is an important concept in OOP-Consider the classes and methods that varies and encapsulate it
- Later we can change or update parts of the application that change frequently without affecting the static parts the actual run-time object should not be locked into the code the type of a variable should be abstract (interface or abstract class) – can be of any concrete implementation
- The dependency inversion principle handles this problem
### 2. Observer Design Pattern
- Defines one-to-many dependency between given objects or entities
- So that when one object changes state all of its dependents are notified and update automatically
- `Subject` is the object that is being monitored
- `Observers`(or listeners) are depending on the `Subject`
- Achieve loosely coupled software systems, having little knowledge of each other
- Only thing that the subjects knows about the observer is that it implements a certain interface, we can add observers
- No need to modify the `subject`, independently reuse subjects or observers
### 3. Command Design Pattern
- Aim is to achieve separation of concerns
- Loosely coupled design, the user interface components know nothing about the underlying business logic or the model
- We can change the sender's behaviour during the run-time
- So we can encapsulate requests as objects basically
- Method invoking the computations knows nothing about the implementations
- 4 components of command pattern -> `command`, `receiver`, `invoker`, `client`
  - `Command`: It knows about receiver and invokes a method of the receiver. The values for parameters of the receiver method are stored in the command
  - `Receiver`: It does the work itself
  - `Invoker`: Knows how to execute a command and optionally does bookkeeping about the command execution. The invoker does not know anything about a concrete command it knows only about command interface
  - `Client`: The client decides which command to execute. To execute a command it passes the command object to the invoker object
- We can decouple classes that invoke the operations and classes that execute these operation
- Add further commands without modifying existing code
- Do not have to execute the commands, we can store these commands in a data structure
### 4. Iterator Design Pattern
- We can access elements of a collection for example in sequential manner without any need to know about the underlying representation
- Essentially it is useful when we want to iterate through elements with different types
- The iterator pattern decouples the algorithms form the containers without the need for the underlying representation
### 5. Template Design Pattern
- Subclasses will override the specific steps and decide the concrete behaviors of the modules
- Bases on inheritance usually
- Operates on class level which means it is static
### 6. Null Object Design Pattern
- References(Objects) in Java may be null - which means empty objects essentially(we cannot do any operations)
- It can be complicates to deal with null references to avoid `NullPointerException` - if-else statements and try-catch blocks
- Good programming practice to avoid null references
### 7. Visitor Design Pattern
- If we would like to do some specific operation on different entities, what if we want to save all the geometric shapes into a file?
- Saving all shapes one-by-one violates single responsibility principle or open/closed principle
- Way of separating an algorithm from an object structure on which it operates

## III. Structural Design Patterns:
In software engineering structural design patterns are about how classes and objects can be composed to form larger structures. The structural design patterns simplifies the structure of software components by identifying the relationships between them.
### 1. Decorator Design Pattern
- We would like to add or more behaviors dynamically
- We can use inheritance but the problem is we cannot change the behaviors at run-time
- In several languages every class must have just a single parent class
- In decorator design patterns we can attach additional responsibilities to an object dynamically
- Provide a flexible alternative to subclassing and for extending functionality
### 2. Facade Design Pattern
- We would like to deal with a complicates library or framework - we have to initialize the framework related classes and handle all the dependencies
- The problem would be classes may become tightly coupled to the implementation of the framework or library
- Facade pattern provides a simple interface to the complicated framework or system
- Has limited functionality but this is exactly the main advantage
### 3. Flyweight Design Pattern
- We would like to minimize the memory usage by sharing as much as data as possible with similar objects
- We create flyweight object and every single character refers to it
- Minimizes memory usage by sharing as much data as possible with other similar objects
- Suggests not to store the features in the given object
- Objects storing the intrinsic states exclusively are called flyweights
### 4. Adapter Design Pattern
- Allows objects with incompatible interfaces to collaborate and work together
- It is often used to make existing classes work with others without modifying their source code
- Legacy code cannot use several features in the exact same way

## IV. Service Locator Design Patterns:
- used for obtaining the processes involved in obtaining a service with a strong abstraction layer
- It is like dependency injection
- We don't have to instantiate the object to update
- We tell the service locator to do this, and it will take care of this
### Advantages
- It is like run-time linker: allows code to be added ar run-time without re-compiling thr source code
- Can make some optimization: the application can detect it has a better library than the default one -> alter the registry accordingly
### Disadvantages
- Black-box: harder to detect and recover from error
- Registry hides the dependencies -> cause run-time error instead of compile-time ones and we do not like it
- Difficult to maintain the registry: dependency injection is more convenient
### Service Locator v/s Dependency Injection:
- Both are just the implementations of the dependency inversion principle
- Depend upon abstraction rather than implementation -> loosely couples
- With service locator the application class asks for it explicitly by a message to the locator
- With injection there is no explicit request, the service appears in the application class - hence the inversion of control
- Easier to test applications with dependency injection
- The choice is not so important, the principle is important -> We sould separate service configuration from the use of services within an application

# Model-View-Controller(MVC) Design Pattern:
- Used for desktop applications with user interface components
- Also, popular for designing web applications
- Easy to test
- Achieve loosely coupled software systems, we can decouple `Model` and `View`
- Provides clear separation of logic

## Model:
- Includes all the data and its related logic
- Data access objects, model classes, databases

## View:
- Handles user interfaces(GUI) and presents the data to the user
- User Interface related components: buttons, text fields etc.

## Controller:
- An abstract layer between the view and model

### Disadvantages of MVC
- Model and View are decoupled but not independent
- When the model frequently we have to update the view as well
- View takes more time to render
- Applications have enormous number of interactions
- That is why `MVVM` architecture is more and more popular(Ex: Angular js)


# Software Architectural Styles

## I. Monolithic Architecture:
- Single application(single `.jar` or `.war` file) and deploy that file on to the server
- There may be independent components of the application but these are handled as a single unit as `monolith`
- There may be independent services within the application but these are just parts of the large application
- It is relatively easy to test so the development is quire fast and suitable for small applications
### Advantages
- It is easier to develop monolithic applications and easier to test them than microservices
### Disadvantages
- The whole application fails if one of its components fail
- You have to recompile the whole project(build) and have to deploy again
- Scalability issues

## II. Microservices:
- Split independent components into independent services
- Ex: Single `.jar` or `.war` file for Shipping service, Inventory service, Login service
- We can deploy every service independently
- We can use `REST API` to communicate
### Advantages
- If one application fails the other services can work fine
- We can deploy just the service
- Services can be implemented in different programming languages
- We can scale the service independently(decouples software architecture)
### Disadvantages
- Hard to test these services

