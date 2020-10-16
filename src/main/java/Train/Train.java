package Train;

import Train.Carriages.*;

import java.util.ArrayList;


public class Train {

    private String trainNumber;
    private ArrayList<Carriage> carriages;

    public Train(String trainNumber) {
        this.setTrainNumber(trainNumber);
        carriages = new ArrayList<Carriage>();
    }

    public void addCarriage(Carriage carriage) {
        this.carriages.add(carriage);
    }

    public int countTotalNumberOfPassengerSeats() {
        int totalNumberOfPassengerSeats = 0;
        for (Carriage carriage : carriages) {
            totalNumberOfPassengerSeats = totalNumberOfPassengerSeats + carriage.getNumberOfSeats();
        }
        return totalNumberOfPassengerSeats;
    }

    public int countTotalNumberOfBaggagePlaces() {
        int totalNumberOfBaggagePlaces = 0;
        for (Carriage carriage : carriages) {
            totalNumberOfBaggagePlaces = totalNumberOfBaggagePlaces + carriage.getNumberOfBaggage();
        }
        return totalNumberOfBaggagePlaces;
    }

    public void carriagesWithGivenRangeOfSeatNumbers(Carriage carriage, int lesserNumber, int biggerNumber) {
        if (carriage.getNumberOfSeats() > lesserNumber && carriage.getNumberOfSeats() < biggerNumber) {
            System.out.print(carriage.getCarriageNumber() + " ");
        }
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public ArrayList<Carriage> getCarriages() {
        return carriages;
    }

    @Override
    public String toString() {
        return "Train № " + this.trainNumber
                + "\n"
                + this.carriages;
    }
}
