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

        for (int i = 0; i < 24; i++) {
            String aDate = showInfo.next();
            double aPrice = showInfo.nextDouble();
            int aQty = showInfo.nextInt();

            String str = showInfo.nextLine();
            int loc = str.indexOf(",");
            String name = str.substring(1, loc);

            String aCity = str.substring(loc + 1);

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
}
