package U7_ArrayLists.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> showList;

    public TicketMaster() {
        showList  = new ArrayList<>();
    }

    /**
     * This method will read in all data, make a show object, and add this object to the AL
     * Repeats this until all data is read
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
    }

    public String toString() {
        String str = "";

        for (Show s: showList) {
            str += s + "\n";
        }

        return str;
    }

    public void display() {
        System.out.println("\t\t\t\t\t**** Welcome to the Ticket Master Kiosk ****");
        System.out.println("You may search our shows by city as well as sort the shows by " +
                "performer and ticket price");
        System.out.println("\t\t\tSimply select the correct option corresponding with your choice");
        System.out.println();
        System.out.println("1. Search by City");
        System.out.println("2. Sort by Performer (A-Z)");
        System.out.println("3. Sort by Performer (Z-A)");
        System.out.println("4. Sort by Price (low - high");
        System.out.println("5. Sort by Price (high - low)");
        System.out.println("6. Quit");
    }

    public ArrayList<Show> byCity(String city) {
        boolean hasCity = false;
        for (int i = 0; i < showList.size(); i++) {
            if (showList.get(i).getCity().equalsIgnoreCase(city)) {
                hasCity = true;
                System.out.println(showList.get(i));
            }
        }

        if (!hasCity)
            System.out.println("No shows are in that city");

        return showList;
    }

    public ArrayList<Show> getShowList() {
        return showList;
    }
}
