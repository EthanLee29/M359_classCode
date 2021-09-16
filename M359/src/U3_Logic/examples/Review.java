package U3_Logic.examples;

public class Review {
    private String reviewer;
    private String business;
    private int rating;

    public Review(String name, String bus, int rate) {
        reviewer = name;
        business = bus;
        rating = rate;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString() {
        String str = "";
        str += reviewer + ", " + business + ", " + rating + "\n";
        if(rating == 5) {
            str += "\t** Highly Recommended\n";
        } else if(rating == 1) {
            str += "\t** Strongly Discouraged\n";
        }
        return str;
    }
}
