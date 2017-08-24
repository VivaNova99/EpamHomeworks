package task05_generics_enums;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Student {

    private String name;
//    int avgMathMark = 0;
//    int avgPhysicsMark = 0;
//    double avgChemistryMark = 0.0;
//    double avgBiologyMark = 0.0;

    public Student(String name, Disciplines ... disciplines){
        this.name = name;
        System.out.println("Группы, в которые входит студент " + name + ":");
        for (Disciplines d : disciplines){
            System.out.println(d);
        }

        MarksComparator marksComparator = new MarksComparator();
        DisciplinesComparator disciplinesComparator = new DisciplinesComparator();
        Comparator<Marks> compMarksThenDisciplines = marksComparator.thenComparing(disciplinesComparator);
        TreeSet<Marks> marksTreeSet = new TreeSet<>(compMarksThenDisciplines);
//        TreeSet<Marks> marksTreeSet = new TreeSet<>(marksComparator);


        for (Disciplines d : disciplines) {

            Scanner sc = new Scanner(System.in);

            String s = new String("");

            Marks<Integer> integerMarks;
            Marks<Double> doubleMarks;

            switch (d) {
                case MATHEMATICS:
                    System.out.println("Введите оценки по математике через пробел");

                    s = sc.nextLine();
                    String[] s1;
                    s1 = s.split(" ");
                    Integer[] mathMarks = new Integer[s1.length];
                    integerMarks = new Marks<Integer>(mathMarks);
                    for(int i=0; i!=s1.length;i++)
                        System.out.println(mathMarks[i] = Integer.parseInt(s1[i]));
                    System.out.println("Средняя оценка по математике - " + integerMarks.average());
                    Marks<Integer> mathematicsMarks = new Marks<Integer>(Disciplines.MATHEMATICS, mathMarks);
                    marksTreeSet.add(mathematicsMarks);

                    break;

                case PHYSICS:
                    System.out.println("Введите оценки по физике через пробел");

                    s = sc.nextLine();
                    String[] s2;
                    s2 = s.split(" ");
                    Integer[] physMarks = new Integer[s2.length];
                    integerMarks = new Marks<Integer>(physMarks);
                    for(int i=0; i!=s2.length;i++)
                        System.out.println(physMarks[i] = Integer.parseInt(s2[i]));
                    System.out.println("Средняя оценка по физике - " + integerMarks.average());
                    Marks<Integer> physicsMarks = new Marks<Integer>(Disciplines.PHYSICS, physMarks);
                    marksTreeSet.add(physicsMarks);

                    break;

                case CHEMISTRY:
                    System.out.println("Введите оценки по химии через пробел");

                    s = sc.nextLine();
                    String[] s3;
                    s3 = s.split(" ");
                    Double[] chemMarks = new Double[s3.length];
                    doubleMarks = new Marks<>(chemMarks);
                    for(int i=0; i!=s3.length;i++)
                        System.out.println(chemMarks[i] = Double.parseDouble(s3[i]));
                    System.out.println("Средняя оценка по химии - " + doubleMarks.average());
                    Marks<Double> chemistryMarks = new Marks<Double>(Disciplines.CHEMISTRY, chemMarks);
                    marksTreeSet.add(chemistryMarks);

                    break;

                case BIOLOGY:
                    System.out.println("Введите оценки по биологии через пробел");

                    s = sc.nextLine();
                    String[] s4;
                    s4 = s.split(" ");
                    Double[] bioMarks = new Double[s4.length];
                    doubleMarks = new Marks<>(bioMarks);
                    for(int i=0; i!=s4.length;i++)
                        System.out.println(bioMarks[i] = Double.parseDouble(s4[i]));
                    System.out.println("Средняя оценка по биологии - " + doubleMarks.average());
                    Marks<Double> biologyMarks = new Marks<Double>(Disciplines.BIOLOGY, bioMarks);
                    marksTreeSet.add(biologyMarks);

                    break;
            }
        }

        System.out.println("Средняя оценка по возрастанию: ");
        for (Marks marks : marksTreeSet) {
            System.out.println(marks.getDisciplineName() + ": " + marks.average());
        }

    }

}
