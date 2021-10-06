package U3_Logic.homework.ChevyLab;

public class ChevyDriverStudent {
    public static void main(String[] args)
    {
        // Create objects
        Chevy traxBase = new Chevy();
        Chevy traxLux = new Chevy();
        Chevy corvetteSport = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)",
                "Fire Red", true, false, true);
        Chevy corvetteClassic = new Chevy(1963, 123500, 13.5, 61500,
                "Corvette (Classic)", "Fire Red", true, false, false);
        Chevy bluesilverado = new Chevy(1990, 15000, 16.5, 37850, "Silverado",
                "Blue", true, true, false);
        Chevy corvetteClassic2 = new Chevy(1963, 123500, 13.5, 61500,
                "Corvette (Classic)", "Fire Red", true, false, false);
        Chevy corvetteSport2 = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)",
                "Fire Red", true, false, true);
        Chevy moonTesla = new Chevy(2021, 2000, 0, 69420, "Not a Chevy", "Silver",
                true, true, true);

        // *** UTILIZE SETTER METHODS TO COMPLETE THE FOLLOWING: ***
        // Set traxBase mileage to 15
        traxBase.setMileage(15);
        // Set traxLux mileage to 175 with both a luxury and 4WD package
        traxLux.setMileage(175);
        traxLux.setLuxPackStatus(true);
        traxLux.setPack4WDStatus(true);

        // Printouts
        System.out.println("*** VEHICLE PRINTOUTS ***");
        System.out.println(traxBase);
        System.out.println(traxLux);

        // Display price comparison
        System.out.println("*** COMPARE BY PRICE ***");
        System.out.println("\tClassic Corvette vs. Sport Corvette");
        System.out.print("\tLowest price:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if (corvetteClassic.compareTo(corvetteSport) > 0)
            System.out.println("Classic Corvette at $" + corvetteClassic.getPrice());
        else if (corvetteClassic.compareTo(corvetteSport) < 0)
            System.out.println("Sport Corvette at $" + corvetteSport.getPrice());
        else
            System.out.println("Tie at $" + corvetteClassic.getPrice());

        // Display equality
        System.out.println("\n*** CHECK EQUALITY ***");
        System.out.println("\tBase Trax vs. Luxury Trax");
        System.out.print("\tStatus:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if (traxBase.equals(traxLux))
            System.out.println("Same car");
        else
            System.out.println("Not same car");

        System.out.println(bluesilverado);
        System.out.println(corvetteClassic2);
        System.out.println(corvetteSport2);
        System.out.println(moonTesla);
    }
}
