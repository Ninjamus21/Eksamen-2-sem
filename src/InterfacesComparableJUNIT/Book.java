package InterfacesComparableJUNIT;

public class Book implements Comparable<Book> {
private String title;
private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        if (this.getPrice() > o.getPrice()){
            return 1;
        } else if (this.getPrice() < o.getPrice()){
            return -1;
        } else {
            return 0;
        }
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getTitle() + " - " + getPrice() + " kr";
    }
}
