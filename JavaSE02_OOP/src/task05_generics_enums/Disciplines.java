package task05_generics_enums;


public enum Disciplines {
    MATHEMATICS("Mathematics", 1, 2, 3, 4, 5),
    PHYSICS("Physics", 1, 2, 3, 4, 5),
    CHEMISTRY("Chemistry", 1.0, 2.0, 3.0, 4.0, 5.0),
    BIOLOGY("Biology", 1.0, 2.0, 3.0, 4.0, 5.0);

    private String disciplineName;


//    private int mark1, mark2, mark3, mark4, mark5;
//    private double mark1d, mark2d, mark3d, mark4d, mark5d;


    Disciplines (String name, Integer ... marks){
        this.disciplineName = name;
    }
//    Disciplines(int mark1, int mark2, int mark3, int mark4, int mark5) {
//        this.mark1 = mark1;
//        this.mark2 = mark2;
//        this.mark3 = mark3;
//        this.mark4 = mark4;
//        this.mark5 = mark5;
//    }

    Disciplines (String name, Double ... marks){
        this.disciplineName = name;
    }

    public String getDisciplineName(){
        return disciplineName;
    }

//    Disciplines(double mark1d, double mark2d, double mark3d, double mark4d, double mark5d) {
//        this.mark1d = mark1d;
//        this.mark2d = mark2d;
//        this.mark3d = mark3d;
//        this.mark4d = mark4d;
//        this.mark5d = mark5d;
//    }

//    public int getMark1(){return mark1;}
//    public int getMark2(){return mark2;}
//    public int getMark3(){return mark3;}
//    public int getMark4(){return mark4;}
//    public int getMark5(){return mark5;}
//    public double getMark1d(){return mark1d;}
//    public double getMark2d(){return mark2d;}
//    public double getMark3d(){return mark3d;}
//    public double getMark4d(){return mark4d;}
//    public double getMark5d(){return mark5d;}


//    public int getAvgMarkInteger(){
//        int avg = 0;
//        int sum = 0;
//        if (markInteger.length !=0){
//            for (int i : markInteger ){
//                sum += i;
//            }
//            avg = sum / markInteger.length;
//        }
//        return avg;
//    }

}
