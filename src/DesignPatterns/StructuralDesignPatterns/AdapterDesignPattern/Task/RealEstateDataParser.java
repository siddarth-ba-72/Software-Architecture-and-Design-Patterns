package DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Task;

public class RealEstateDataParser implements CsvParser {

    @Override
    public void parse() {
        System.out.println("Reas estate data parsing...");
    }
}
