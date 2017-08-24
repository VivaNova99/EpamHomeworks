package task05_generics_enums;


import java.util.Comparator;

public class MarksComparator implements Comparator<Marks> {
    @Override
    public int compare(Marks o1, Marks o2) {

        double avgMark1 = o1.average();
        double avgMark2 = o2.average();

        if (avgMark1 < avgMark2) {
            return -1;
        } else if (avgMark1 == avgMark2) {
            return 0;
        } else {
            return 1;
        }

    }
}
