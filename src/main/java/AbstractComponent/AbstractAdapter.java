package AbstractComponent;

import java.util.ArrayList;

public abstract class AbstractAdapter {
    private FixedPartA a;
    private FixedPartB b;
    private ArrayList<AbstractPart> otherParts;

    public AbstractAdapter(FixedPartA a, FixedPartB b, ArrayList<AbstractPart> otherParts) {
        this.a = a;
        this.b = b;
        this.otherParts = otherParts;
    }

    // boiler plate code below
    public FixedPartA getA() {
        return a;
    }

    public void setA(FixedPartA a) {
        this.a = a;
    }

    public FixedPartB getB() {
        return b;
    }

    public void setB(FixedPartB b) {
        this.b = b;
    }

    public ArrayList<AbstractPart> getOtherParts() {
        return otherParts;
    }

    public void setOtherParts(ArrayList<AbstractPart> otherParts) {
        this.otherParts = otherParts;
    }
}
