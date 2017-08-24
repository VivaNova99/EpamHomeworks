package task05_generics_enums;

import java.util.Collection;

public class Marks<T extends Number> {
    private T[] marks;

    private Disciplines discipline;
    private String disciplineName;

    Marks(T[] o){
        marks = o;
    }

    Marks(Disciplines discipline, T[] o){
        this.discipline = discipline;
        this.marks = o;
    }

    double average(){
        double sum = 0.0;
        for (T mark : marks){
            sum += mark.doubleValue();
        }
        return sum / marks.length;
    }

    public String getDisciplineName(){
        disciplineName = discipline.getDisciplineName();
        return disciplineName;
    }

    boolean sameAvg(Marks<?> ob){
//        if(average() == ob.average()){
//            return true;
//        }
//        return false;
        return (average() == ob.average());
    }

//    public void rankingAvgMarks(Collection<Marks<>>)
}
