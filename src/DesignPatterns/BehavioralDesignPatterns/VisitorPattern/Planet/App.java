package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Planet;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();

        List<Planet> planets = new ArrayList<>();
        planets.add(mars);
        planets.add(saturn);
        planets.add(mercury);

        Explorer explorer = new LifeExplorer();

        for (Planet planet : planets)
            planet.accept(explorer);
    }
}
