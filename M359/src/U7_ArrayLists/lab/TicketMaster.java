package U7_ArrayLists.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> showList = new ArrayList<>();

    public void readShow() throws FileNotFoundException {
        Scanner showInfo = new Scanner(new File("showData.txt"));

        String aDate = showInfo.next();
        double aPrice = showInfo.nextDouble();
        int aQty = showInfo.nextInt();

        String name = showInfo.next();
        int indOfComma = name.length() - 1;
        name = name.substring(0, indOfComma);

        String aCity = showInfo.next();

        Show s = new Show(aDate, aPrice, aQty, name, aCity);
        showList.add(s);
    }
}
