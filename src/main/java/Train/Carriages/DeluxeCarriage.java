package Train.Carriages;

public class DeluxeCarriage extends Carriage {

    public DeluxeCarriage(int carriageNumber) {
        super(carriageNumber);
        this.numberOfSeats = 5;
        this.numberOfBaggage = 20;
        this.carriageType = CarriageTypes.DELUXE;
    }
}
