package task05_generics_enums;


public class StudentInspector {
    public static void main(String[] args) {

        Student studentIvanPetrov = new Student("Иван Петров", Disciplines.MATHEMATICS, Disciplines.BIOLOGY);
        Student studentKatjaIvanova = new Student("Катя Иванова", Disciplines.PHYSICS, Disciplines.CHEMISTRY, Disciplines.BIOLOGY);

//        System.out.println(Disciplines.MATHEMATICS.getMark1());
//
//        System.out.println(new Student(Disciplines.MATHEMATICS, Disciplines.BIOLOGY));
    }
}
