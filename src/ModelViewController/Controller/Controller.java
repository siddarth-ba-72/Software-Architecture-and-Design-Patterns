package ModelViewController.Controller;


import ModelViewController.Model.Database;
import ModelViewController.Model.Person;
import ModelViewController.View.MainFrame;

import java.util.List;

public class Controller {

    private Database database;
    private MainFrame mainFrame;

    public Controller(MainFrame mainFrame){
        this.database = new Database();
        this.mainFrame = mainFrame;
    }

    public void addPerson(String personName, String personOccupation){
        Person person = new Person(personName, personOccupation);
        this.database.addPerson(person);
    }

    public void removePerson(Person person){
        this.database.removePerson(person);
    }

    public List<Person> getPeopleDatabase(){
        return this.database.getPeopleDatabase();
    }

    public void refreshScreen() {
        List<Person> people = getPeopleDatabase();
        this.mainFrame.clearText();

        for(Person person : people){
            this.mainFrame.refreshTextArea(person.getName(), person.getOccupation());
        }
    }
}