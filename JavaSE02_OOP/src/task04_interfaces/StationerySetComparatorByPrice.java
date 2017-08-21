package task04_interfaces;


import task03_inheritage.Stationery;

import java.util.Comparator;

public class StationerySetComparatorByPrice implements Comparator<Stationery> {


    @Override
    public int compare(Stationery o1, Stationery o2) {

        int price1 = o1.getPrice();
        int price2 = o2.getPrice();

        if (price1 < price2) {
            return -1;
        } else if (price1 == price2) {
            return 0;
        } else {
            return 1;
        }

    }
}
