package task06_07_inner_classes_and_annotations;


public class NuclearSubmarine {

    private NuclearEngine nuclearEngine;

    public NuclearSubmarine() {
        System.out.println("Атомная подводная лодка создана");
        nuclearEngine = new NuclearEngine();
    }

    class NuclearEngine {
        public void startEngine(){
            System.out.println("Двигатель подводной лодки запущен");
        }
    }

    public void startNuclearSubmarine(){
        nuclearEngine.startEngine();
        System.out.println("Атомная подводная лодка отправилась в плавание");
    }
}

