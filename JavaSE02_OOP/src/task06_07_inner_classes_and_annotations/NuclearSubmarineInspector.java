package task06_07_inner_classes_and_annotations;

@MyAnnotationForClass
public class NuclearSubmarineInspector {
    public static void main(String[] args) {
        NuclearSubmarine nuclearSubmarine = new NuclearSubmarine();
        nuclearSubmarine.startNuclearSubmarine();

        NuclearSubmarine.annotationDemo();
    }
}
