package main;

import AbstractComponent.AbstractAdapter;
import AbstractComponent.AbstractPart;
import Factory.AdapterFactory;

import java.rmi.UnexpectedException;

public class MainApp {
    public static void main(String[] args) throws UnexpectedException {
        AdapterFactory adapterFactory = new AdapterFactory();

        System.out.println("Started main app");
        System.out.println("Creating type 1 adapter..");
        adapterFactory.createAdapter("type1");
        runAdapter(adapterFactory.getAdapter());

        System.out.println("Disconnecting type 1 adapter..");
        adapterFactory.unSetAdapter();

        System.out.println("Creating type 2 adapter");
        adapterFactory.createAdapter("type2");
        runAdapter(adapterFactory.getAdapter());

    }

    private static void runAdapter(AbstractAdapter adapter){
        adapter.getA().executeA();
        adapter.getB().executeB();

        for(AbstractPart part : adapter.getOtherParts()){
            part.execute();
        }

    }
}
