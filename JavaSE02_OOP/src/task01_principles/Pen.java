package task01_principles;

public class Pen {
    private int price;
    private String producerName;

    public Pen(int price, String producerName){
        this.price = price;
        this.producerName = producerName;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (null == object) {
            return false;
        }

        Pen pen = (Pen) object;
        if (price != pen.price) {
            return false;
        }
        if (null == producerName) {
            return (producerName == pen.producerName);
        } else {
            if (!producerName.equals(pen.producerName)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        return (int) (31 * price + ((null == producerName) ? 0 : producerName.hashCode()));
    }

    public String toString() {
        return getClass().getName() + "@" + "price: " + price + ", producerName: " + producerName;
    }

    public static void main(String[] args) {
        Pen firstPen = new Pen(10, "BIC");
        Pen secondPen = new Pen(10, "BIC");
        Pen thirdPen = new Pen(20, "Pilot");

        System.out.println("Результат сравнения первой и второй ручки: " + firstPen.equals(secondPen));
        System.out.println("Результат сравнения первой и третьей ручки: " + firstPen.equals(thirdPen));
        System.out.println();
        System.out.println("Хеш-код первой ручки: " + firstPen.hashCode());
        System.out.println("Хеш-код второй ручки: " + secondPen.hashCode());
        System.out.println("Хеш-код первой ручки: " + thirdPen.hashCode());
        System.out.println();
        System.out.println("Описание первой ручки: " + firstPen.toString());
        System.out.println("Описание второй ручки: " + secondPen.toString());
        System.out.println("Описание третьей ручки: " + thirdPen.toString());
    }
}
