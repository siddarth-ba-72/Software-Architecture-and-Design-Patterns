package DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Task;

public class XmlToCsvAdapter implements CsvParser {

    private StackMarketDataParser stackMarketDataParser;

    public XmlToCsvAdapter(StackMarketDataParser parser) {
        this.stackMarketDataParser = parser;
    }

    @Override
    public void parse() {
        stackMarketDataParser.parseXml();
    }
}
