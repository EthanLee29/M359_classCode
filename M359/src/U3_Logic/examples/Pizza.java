package U3_Logic.examples;

public class Pizza {
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    public Pizza(String aStore, int numInches, int numTheToppings, boolean deepDish) {
        store = aStore;
        inches = numInches;
        numToppings = numTheToppings;
        isDeepDish = deepDish;
    }
    public Pizza(String theStore, int size, boolean isItDeepDish) {
        store = theStore;
        inches = size;
        numToppings = 0;
        isDeepDish = isItDeepDish;
    }

    /*
    A toString method is helpful because it is called on our behalf by java whenever we
    print an object variable name.

    The method header is always:
        public string toString() {

        }

    Inside this method you will create and return a string that you want to be printed
    whenever this variable is printed.
     */

    public String toString() {
        String str = "";    // the string must be set to "" in order to use +=
        //if it isn't, then the string is null and you can't concatenate with it
        //build up the string using += to keep adding on
        str += "Store: " + store + "\n";
        str += "Size: " + inches + " inches, Num toppings: " + numToppings + "\n";

        if(isDeepDish) {
            str += "Deep dish pizza";
        }
        else {
            str += "Regular crust pizza";
        }

        return str;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }

    // .equals method returns true if both pizzas are equivalent, false otherwise
    // CHEAT FOR RIGHT NOW: if two pizzas are the same size they are equivalent

    public boolean equals(Pizza other) {
    /*  same thing but longer
        if (this.inches == other.inches) {
            return true;
        } else {
            return false;
        }*/

        return (this.inches == other.inches);
    }

    //compareTo method: returns negative if this comes before the other.
    //                  returns positive if this comes after other.
    //                  returns zero if this and other are the same.
    //sort by inches

    public int compareTo(Pizza other) {
        return (this.inches - other.inches);
    }
}
