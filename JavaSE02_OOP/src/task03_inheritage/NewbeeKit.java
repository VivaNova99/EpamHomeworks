package task03_inheritage;


public class NewbeeKit {

    private Erasure erasure;
    private Pen pen;
    private Pencil pencil;
    private Notebook notebook;
    private Paper paper;
//
    private Stationery[] newbeeKit;

    public void setNewbeeKit (Erasure erasure, Pen pen, Pencil pencil, Notebook notebook, Paper paper) {
        this.erasure = erasure;
        this.pen = pen;
        this.pencil = pencil;
        this.notebook = notebook;
        this.paper = paper;
        newbeeKit = new Stationery[]{erasure, pen, pencil, notebook, paper};
    }

    public Stationery[] getNewbeeKit(){
        return newbeeKit;
    }



    public static void main(String[] args) {

        Erasure erasure = new Erasure(5, "White", "Koh-I-Noor");
        Pen pen = new Pen(8, "Blue", "BIC");
        Pencil pencil = new Pencil(8, "Black", "Attache");
        Notebook notebook = new Notebook(10, "A5", "Producer");
        Paper paper = new Paper(15, "A4", "Svetogorsk");

        NewbeeKit newbeeKit = new NewbeeKit();

        newbeeKit.setNewbeeKit(erasure, pen, pencil, notebook, paper);

        Stationery[] newbeeKitArray = newbeeKit.getNewbeeKit();

        for (Stationery stationery : newbeeKitArray) {
            System.out.println("Stationery: " + stationery.getClass() + ", price: " + stationery.getPrice() +
                    ", producer name: " + stationery.getProducerName());
        }

    }

}
