package DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Task;

public class App {
    public static void main(String[] args) {
        CsvParser machine = new MachineLearningDataParser();
        CsvParser real = new RealEstateDataParser();
        CsvParser xml = new XmlToCsvAdapter(new StackMarketDataParser());

        machine.parse();
        real.parse();
        xml.parse();
    }
}
