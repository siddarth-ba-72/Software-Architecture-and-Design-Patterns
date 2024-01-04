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
### 2. Observer Design Pattern
### 3. Command Design Pattern
### 4. Iterator Design Pattern
### 5. Template Design Pattern
### 6. Null Object Design Pattern
### 7. Visitor Design Pattern

## III. Structural Design Patterns:
### 1. Decorator Design Pattern
### 2. Facade Design Pattern
### 3. Flyweight Design Pattern
### 4. Adapter Design Pattern

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

