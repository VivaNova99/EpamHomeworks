package task02_classes_and_objects;

public class Erasure extends Stationery {

    private int price;
    private String owner;

    public Erasure(int price, String owner){
        this.price = price;
        this.owner = owner;
    }

    public int getPrice(){
        return price;
    }

    public String getOwner(){
        return owner;
    }
}
