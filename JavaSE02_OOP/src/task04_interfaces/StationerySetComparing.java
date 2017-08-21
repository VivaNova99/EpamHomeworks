package task04_interfaces;

import task03_inheritage.*;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StationerySetComparing {

    public static void main(String[] args) {

        Comparator<Stationery> comparatorByPrice = new StationerySetComparatorByPrice();
        Comparator<Stationery> comparatorByProducerName = new StationerySetComparatorByProducerName();
        Comparator<Stationery> comparatorPriceThenName = comparatorByPrice.thenComparing(comparatorByProducerName);

        Set<Stationery> setByPrice = new TreeSet<Stationery>(comparatorByPrice);

        setByPrice.add(new Erasure(5, "White", "Koh-I-Noor"));
        setByPrice.add(new Pen(8, "Blue", "BIC"));
        setByPrice.add(new Pencil(8, "Black", "Attache"));
        setByPrice.add(new Notebook(12, "A5", "Producer"));
        setByPrice.add(new Paper(10, "A4", "Svetogorsk"));

        System.out.println("Stationaries sorted by price: ");
        for (Stationery stationery : setByPrice){
            System.out.println("Stationery: " + stationery.getClass() + ", price: " + stationery.getPrice() +
                    ", producer name: " + stationery.getProducerName());
        }

        Set<Stationery> setByProducerName = new TreeSet<Stationery>(comparatorByProducerName);

        setByProducerName.add(new Erasure(5, "White", "Koh-I-Noor"));
        setByProducerName.add(new Pen(8, "Blue", "BIC"));
        setByProducerName.add(new Pencil(8, "Black", "Attache"));
        setByProducerName.add(new Notebook(12, "A5", "Producer"));
        setByProducerName.add(new Paper(10, "A4", "Svetogorsk"));

        System.out.println("Stationaries sorted by producer name: ");
        for (Stationery stationery : setByProducerName){
            System.out.println("Stationery: " + stationery.getClass() + ", price: " + stationery.getPrice() +
                    ", producer name: " + stationery.getProducerName());
        }

        Set<Stationery> setByPriceThenByName = new TreeSet<Stationery>(comparatorPriceThenName);

        setByPriceThenByName.add(new Erasure(5, "White", "Koh-I-Noor"));
        setByPriceThenByName.add(new Pen(8, "Blue", "BIC"));
        setByPriceThenByName.add(new Pencil(8, "Black", "Attache"));
        setByPriceThenByName.add(new Notebook(12, "A5", "Producer"));
        setByPriceThenByName.add(new Paper(10, "A4", "Svetogorsk"));

        System.out.println("Stationaries sorted by price then by producer name: ");
        for (Stationery stationery : setByPriceThenByName){
            System.out.println("Stationery: " + stationery.getClass() + ", price: " + stationery.getPrice() +
                    ", producer name: " + stationery.getProducerName());
        }

    }
}
