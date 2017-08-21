package task03_inheritage;

public abstract class Stationery {

    private int price;
    private String owner;
    private String producerName;

    public int getPrice(){
        return price;
    }

    public String getProducerName(){
        return producerName;
    }

    public String getOwner(){
        return owner;
    }

}