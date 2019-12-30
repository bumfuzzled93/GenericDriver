package AdapaterProdTypOne;

import AbstractComponent.AbstractAdapter;
import AbstractComponent.AbstractPart;
import AbstractComponent.FixedPartA;
import AbstractComponent.FixedPartB;

import java.util.ArrayList;
import java.util.Arrays;

public class AdapterProdTypOne extends AbstractAdapter {
    private volatile static AdapterProdTypOne adapterProdTypOne;

    public AdapterProdTypOne(FixedPartA a, FixedPartB b, ArrayList<AbstractPart> otherParts) {
        super(a, b, otherParts);
    }

    public static AdapterProdTypOne getInstance() {
        return adapterProdTypOne != null ? adapterProdTypOne :
                new AdapterProdTypOne(new FixedPartA(), new FixedPartB(),
                        new ArrayList<AbstractPart>(Arrays.asList(new PartC(), new PartD())));
    }
}
