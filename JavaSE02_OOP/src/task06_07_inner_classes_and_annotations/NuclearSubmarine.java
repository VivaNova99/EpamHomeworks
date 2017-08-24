package task06_07_inner_classes_and_annotations;

import java.lang.reflect.Method;

@MyAnnotationForClass
public class NuclearSubmarine {

    private NuclearEngine nuclearEngine;

    public NuclearSubmarine() {
        System.out.println("Атомная подводная лодка создана");
        nuclearEngine = new NuclearEngine();
    }

    class NuclearEngine {
        @MyAnnotationForMethod
        public void startEngine(){
            System.out.println("Двигатель подводной лодки запущен");
        }
    }

    public void startNuclearSubmarine(){
        nuclearEngine.startEngine();
        System.out.println("Атомная подводная лодка отправилась в плавание");
    }

    @MyAnnotationForMethod
    public static void annotationDemo() {
        //Вывод значений по умолчанию аннотации
        NuclearSubmarine ob = new NuclearSubmarine();

        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("annotationDemo");
            MyAnnotationForMethod annotationForMethod = m.getAnnotation(MyAnnotationForMethod.class);
            System.out.println(annotationForMethod.description());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден");
        }
    }
}

