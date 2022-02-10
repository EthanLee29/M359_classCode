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

    /**
     * Returns Show object's info in a formatted String
     * @return String
     */
    public String toString() {
        String str = "";
        str += date + "\t";
        str += "$" + price + "\t\t";
        str += qty + "\t\t" + artist;

        if (artist.length() < 8) {
            str += "\t\t\t\t";
        }else if (artist.length() < 12){
            str += "\t\t\t";
        } else if (artist.length() < 16){
            str += "\t\t";
        } else {
            str += "\t";
        }

        str += city;

        return str;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
