package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class App {
    public static void main(String[] args) {
       Person person = new Person.Builder("Ferid","fdquluzade@gmail.com")
               .setAge(10)
               .build();

        System.out.println(person);

        Student student = new Student.Builder("Ferid", "ASOIU")
                .setAge(10)
                .build();

        System.out.println(student);
    }
}
