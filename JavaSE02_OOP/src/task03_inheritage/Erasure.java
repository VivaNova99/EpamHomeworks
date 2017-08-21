package task03_inheritage;

public class Erasure extends WritingUtensils {

    private int price;
    private String owner;
    private String producerName;
    private String color;

    public Erasure(int price, String color, String producerName){
        this.price = price;
        this.color = color;
        this.producerName = producerName;
    }

    public String getColor(){
        return color;
    }

    public int getPrice(){
        return price;
    }

    public String getOwner(){
        return owner;
    }

    public String getProducerName(){
        return producerName;
    }
}
