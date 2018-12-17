package list;

public class Link {
    public int iDdata;
    public double dData;
    public Link next;

    public Link(int iDdata, double dData) {
        this.iDdata = iDdata;
        this.dData = dData;
    }

    @Override
    public String toString() {
        return "{" + iDdata + " , " + dData + "}";
    }
}
