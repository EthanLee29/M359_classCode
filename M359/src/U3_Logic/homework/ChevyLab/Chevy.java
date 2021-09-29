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
        year = 2021;
        mileage = 0;
        fuelEff = 35;
        price = 16000;
        model = "Trax";
        color = "White";
        luxPackStatus = false;
        pack4WDStatus = false;
        sportsPackStatus = false;
    }

    public Chevy(int year, int mileage, double fuelEff, int price, String model, String color, boolean luxPackStatus,
                 boolean pack4WDStatus, boolean sportsPackStatus) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEff = fuelEff;
        this.price = price;
        this.model = model;
        this.color = color;
        this.luxPackStatus = luxPackStatus;
        this.pack4WDStatus = pack4WDStatus;
        this.sportsPackStatus = sportsPackStatus;
    }

    public int compareTo(Chevy other) {
        return this.price - other.price;
    }

    public boolean equals(Chevy other) {
        if(this.model.equals(other.model) && this.color.equals(other.color)) {
            if((this.mileage < 200) == (other.mileage < 200)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str = "";
        str += year + " " + MAKE + " " + model + " (" + color + ")\n";
        str += "\tPRICE:\t\t\t\t$" + this.calcPrice() + "\n";
        str += "\tMILES:\t\t\t\t" + mileage + "\n";
        str += "\tFUEL EFFICIENCY:\t" + fuelEff + " mpg\n";
        str += "\tPACKAGES:\n";
        if(luxPackStatus) {
            str += "\t\t-Luxury Package\n";
        }
        if(pack4WDStatus) {
            str += "\t\t-4WD Package\n";
        }
        if(sportsPackStatus) {
            str += "\t\t-Sports Package\n";
        }
        if(!luxPackStatus && !pack4WDStatus && !sportsPackStatus) {
            str += "\t\t-None";
        }
        return str;
    }

    public double calcPrice() {
        double pricePreTax = this.price;
        if(luxPackStatus) {
            pricePreTax += this.price * LP_PRICE_INC;
        }
        if(pack4WDStatus) {
            pricePreTax += PACK_4WD_PRICE_INC;
        }
        if(sportsPackStatus) {
            pricePreTax += this.price * SPORTS_PACK_PRICE_INC;
            fuelEff -= fuelEff * FUEL_EFF_DEC;
        }
        return pricePreTax + (pricePreTax * TAX_RATE);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelEff() {
        return fuelEff;
    }

    public void setFuelEff(double fuelEff) {
        this.fuelEff = fuelEff;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxPackStatus() {
        return luxPackStatus;
    }

    public void setLuxPackStatus(boolean luxPackStatus) {
        this.luxPackStatus = luxPackStatus;
    }

    public boolean isPack4WDStatus() {
        return pack4WDStatus;
    }

    public void setPack4WDStatus(boolean pack4WDStatus) {
        this.pack4WDStatus = pack4WDStatus;
    }

    public boolean isSportsPackStatus() {
        return sportsPackStatus;
    }

    public void setSportsPackStatus(boolean sportsPackStatus) {
        this.sportsPackStatus = sportsPackStatus;
    }

    public String getMAKE() {
        return MAKE;
    }

    public double getTAX_RATE() {
        return TAX_RATE;
    }

    public double getLP_PRICE_INC() {
        return LP_PRICE_INC;
    }

    public int getPACK_4WD_PRICE_INC() {
        return PACK_4WD_PRICE_INC;
    }

    public double getSPORTS_PACK_PRICE_INC() {
        return SPORTS_PACK_PRICE_INC;
    }

    public double getFUEL_EFF_DEC() {
        return FUEL_EFF_DEC;
    }
}
