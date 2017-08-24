package task05_generics_enums;

import java.util.Comparator;

public class DisciplinesComparator implements Comparator<Marks> {

    @Override
    public int compare(Marks o1, Marks o2) {

        String disciplineName1 = o1.getDisciplineName();
        String disciplineName2 = o2.getDisciplineName();

        return disciplineName1.compareTo(disciplineName2);

    }
}
