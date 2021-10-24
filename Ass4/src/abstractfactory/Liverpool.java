package abstractfactory;

public class Liverpool extends Club{
    private final String name;
    private final int number;
    private final long price;

    public Liverpool(String name , int number , long price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    public String getFootballers() {
        return name + ", that plays as " + number + " priced for " + price + "$";
    }

    @Override
    public String toString() {
        return "Liverpool{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}
