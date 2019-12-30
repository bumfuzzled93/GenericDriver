package AdapterProdTypTwo;

import AbstractComponent.AbstractAdapter;
import AbstractComponent.AbstractPart;
import AbstractComponent.FixedPartA;
import AbstractComponent.FixedPartB;
import AdapaterProdTypOne.PartC;

import java.util.ArrayList;
import java.util.Arrays;

public class AdapterProdTypTwo extends AbstractAdapter {
    private volatile static AdapterProdTypTwo adapterProdTypTwo;

    public AdapterProdTypTwo(FixedPartA a, FixedPartB b, ArrayList<AbstractPart> otherParts) {
        super(a, b, otherParts);
    }

    public static AdapterProdTypTwo getInstance() {
        return adapterProdTypTwo != null ? adapterProdTypTwo :
                new AdapterProdTypTwo(new FixedPartA(), new FixedPartB(),
                        new ArrayList<AbstractPart>(Arrays.asList(new PartC(), new PartE())));
    }
}
