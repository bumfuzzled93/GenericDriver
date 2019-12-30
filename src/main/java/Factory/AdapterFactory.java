package Factory;

import AbstractComponent.AbstractAdapter;
import AdapaterProdTypOne.AdapterProdTypOne;
import AdapterProdTypTwo.AdapterProdTypTwo;

import java.rmi.UnexpectedException;

public class AdapterFactory {
    private AbstractAdapter currentAdapter;

    public void createAdapter(String prodType) throws UnexpectedException {
        if (currentAdapter != null)
            throw new UnexpectedException("Adapter has been initialised.");
        switch (prodType.toLowerCase()) {
            case "type1":
                currentAdapter = AdapterProdTypOne.getInstance();
                break;
            case "type2":
                currentAdapter = AdapterProdTypTwo.getInstance();
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public AbstractAdapter getAdapter() {
        return currentAdapter;
    }

    // TODO make thread safe
    public boolean unSetAdapter(){
        currentAdapter = null;
        return true;
    }
}
