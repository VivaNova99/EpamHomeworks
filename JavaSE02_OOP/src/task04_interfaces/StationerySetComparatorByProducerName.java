package task04_interfaces;


import task03_inheritage.Stationery;

import java.util.Comparator;

public class StationerySetComparatorByProducerName implements Comparator<Stationery> {


    @Override
    public int compare(Stationery o1, Stationery o2) {

        String producerName1 = o1.getProducerName();
        String producerName2 = o2.getProducerName();

        return producerName1.compareTo(producerName2);

    }
}
