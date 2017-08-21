package task03_inheritage;


public class Notebook extends WritingUtensils {

    private int price;
    private String owner;
    private String producerName;
    private String size;

    public Notebook(int price, String size, String producerName){
        this.price = price;
        this.size = size;
        this.producerName = producerName;
    }

    public String getSize(){
        return size;
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
