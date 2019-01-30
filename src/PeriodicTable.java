public class PeriodicTable {
    //instance variables
    private Element[] table;

    //constructors
    public PeriodicTable(int numOfElements) {
        table = new Element[numOfElements];
    }

    //mutators
    public boolean setElement(int i, Element e) {
        if (i < 0 || i >= table.length)
            return false;
        table[i] = e;
        return true;
    }

    //accessors
    public Element getElement(String symbol) {
        for (Element e : table)
            if (e.getSymbol().equals(symbol))
                return e;
        return null;
    }

}
