package Train.Carriages;

import java.util.Comparator;

public abstract class Carriage {

    private int carriageNumber;
    protected int numberOfSeats;
    protected int numberOfBaggage;
    protected CarriageTypes carriageType;

    public Carriage(int carriageNumber) {
        this.setCarriageNumber(carriageNumber);
    }

    public static class CarriageClassComparator implements Comparator<Carriage> {

        @Override
        public int compare(Carriage firstCarriage, Carriage secondCarriage) {
            return firstCarriage.getCarriageType().compareTo(secondCarriage.getCarriageType());
        }
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public int getNumberOfBaggage() {
        return this.numberOfBaggage;
    }

    public CarriageTypes getCarriageType() {
        return this.carriageType;
    }

    @Override
    public String toString() {
        return "Carriage № " + this.getCarriageNumber()
                + ", carriage type = " + this.carriageType
                + ", number of passenger seats = " + this.numberOfSeats
                + ", number of baggage places = " + this.numberOfBaggage
                + "\n";
    }
}