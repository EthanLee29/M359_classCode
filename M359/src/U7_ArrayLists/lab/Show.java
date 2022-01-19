package U7_ArrayLists.lab;

public class Show {
    private String date, artist, city;
    private double price;
    private int qty;

    public Show(String date, double price, int qty, String artist, String city) {
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.artist = artist;
        this.city = city;
    }

    public String toString() {
        String str = "";
        str += date + "\t";
        str += "$" + price + "\t";
        str += qty + "\t" + artist;
        str += "\t\t" + city;

        return str;
    }
}
