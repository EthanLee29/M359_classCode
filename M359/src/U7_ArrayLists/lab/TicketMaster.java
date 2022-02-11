package U7_ArrayLists.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> showList;

    public TicketMaster() {
        showList = new ArrayList<>();
    }

    /**
     * This method will read in all data, make a show object, and add this object to the AL
     * Repeats this until all data is read
     *
     * @throws FileNotFoundException
     */
    public void readData() throws FileNotFoundException {
        Scanner showInfo = new Scanner(new File("showData.txt"));

        while (showInfo.hasNextLine()) {
            String aDate = showInfo.next();
            double aPrice = showInfo.nextDouble();
            int aQty = showInfo.nextInt();

            String str = showInfo.nextLine();
            int loc = str.indexOf(",");
            String name = str.substring(1, loc);

            String aCity = str.substring(loc + 2);

            Show s = new Show(aDate, aPrice, aQty, name, aCity);
            showList.add(s);
        }

        showInfo.close();
    }

    /**
     * This method returns a String containing the TicketMaster object's
     * information in a neatly formatted manner
     * @return
     */
    public String toString() {
        String str = "";

        str += "Date\t\t" + "Price\t\t" + "Qty\t\t" + "Performer\t\t\t" + "City\n";
        for (int i = 0; i < 70; i++) {
            str += "-";
        }

        str += "\n";

        for (Show s : showList) {
            str += s + "\n";
        }

        return str;
    }

    /**
     * This method displays the Ticket Master Menu
     */
    public void display() {
        System.out.println("You may search our shows by city as well as sort the shows by " +
                "performer and ticket price");
        System.out.println("\t\t\tSimply select the correct option corresponding with your choice");
        System.out.println();
        System.out.println("1. Search by City");
        System.out.println("2. Sort by Performer (A-Z)");
        System.out.println("3. Sort by Performer (Z-A)");
        System.out.println("4. Sort by Price (low - high)");
        System.out.println("5. Sort by Price (high - low)");
        System.out.println("6. Quit");
        System.out.println();
    }

    /**
     * This method takes a String city and prints the shows at that city. If the
     * String cannot find a match, it prints "No shows are in that city".
     * @param city String
     * @return Show list
     */
    public ArrayList<Show> byCity(String city) {
        boolean hasCity = false;
        System.out.print("Date\t\t" + "Price\t\t" + "Qty\t\t" + "Performer\t\t\t" + "City\n");
        for (int i = 0; i < 70; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < showList.size(); i++) {
            if (showList.get(i).getCity().equalsIgnoreCase(city)) {
                hasCity = true;
                System.out.println(showList.get(i));
            }
        }

        if (!hasCity)
            System.out.println("No shows are in that city");

        System.out.println();

        return showList;
    }

    /**
     * Sorts the list of Show objects by performer from A to Z
     * @param list ArrayList of Show objects
     */
    public void aToZ(ArrayList<Show> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getArtist().compareTo(list.get(min).getArtist()) < 0) {
                    min = j;
                }
            }

            Show temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }

    /**
     * Sorts the list of Show objects by performer from Z to A
     * @param list ArrayList of Show objects
     */
    public void zToA(ArrayList<Show> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getArtist().compareTo(list.get(min).getArtist()) > 0) {
                    min = j;
                }
            }

            Show temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }

    /**
     * This method sorts the list of Show objects by price from low to high
     * @param list ArrayList of Show objects
     */
    public void byPriceLow(ArrayList<Show> list) {
        for (int i = 1; i < list.size(); i++) {
            Show show = list.get(i);
            double valueToInsert = list.get(i).getPrice();
            int pos = i;

            while (pos > 0 && list.get(pos - 1).getPrice() > valueToInsert) {
                list.set(pos, list.get(pos - 1));
                pos--;
            }

            list.set(pos, show);
        }
    }

    /**
     * This method sorts the list of Show objects by price from low to high
     * @param list ArrayList of Show objects
     */
    public void byPriceHigh(ArrayList<Show> list) {
        for (int i = 1; i < list.size(); i++) {
            Show show = list.get(i);
            double valueToInsert = list.get(i).getPrice();
            int pos = i;

            while (pos > 0 && list.get(pos - 1).getPrice() < valueToInsert) {
                list.set(pos, list.get(pos - 1));
                pos--;
            }

            list.set(pos, show);
        }
    }

    public ArrayList<Show> getShowList() {
        return showList;
    }
}
