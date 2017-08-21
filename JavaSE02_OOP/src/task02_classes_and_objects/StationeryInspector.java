package task02_classes_and_objects;


public class StationeryInspector {

    private int sum = 0;

    public int findSum(String name, Stationery[] stationeries){
        for (Stationery stationery : stationeries) {
            if ((stationery.getOwner()).equals(name)){
                sum = sum + stationery.getPrice();
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Stationery[] stationeries = {
                new Erasure(10, "Petr Petrov"),
                new Erasure(15, "Ivan Ivanov"),
                new Paper(20, "Petr Petrov"),
                new Paper(20, "Katja Semenova"),
                new Pen(5, "Petr Petrov"),
                new Pen(6, "Katja Semenova"),
                new Pencil(8, "Petr Petrov")
        };

        String name = "Petr Petrov";

        StationeryInspector stationeryInspector = new StationeryInspector();

        System.out.println("Сумма стоимости канцтоваров на столе у " + name + " = "
                + stationeryInspector.findSum(name, stationeries));

    }


}
