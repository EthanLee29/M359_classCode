package U3_Logic.homework.ChevyLab;

public class Chevy {
    // Ethan Lee per 2

    private int year;
    private int mileage;
    private double fuelEff;
    private int price;
    private String model;
    private String color;
    private boolean luxPackStatus;
    private boolean pack4WDStatus;
    private boolean sportsPackStatus;

    private final String MAKE = "Chevrolet";
    private final double TAX_RATE = 0.122;
    private final double LP_PRICE_INC = 0.2;
    private final int PACK_4WD_PRICE_INC = 3500;
    private final double SPORTS_PACK_PRICE_INC = 0.15;
    private final double FUEL_EFF_DEC = 0.20;

    public Chevy() {
        color = "White";

    }
}
