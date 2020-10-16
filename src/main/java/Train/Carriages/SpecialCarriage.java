package Train.Carriages;

public class SpecialCarriage extends Carriage {

    public SpecialCarriage(int carriageNumber) {
        super(carriageNumber);
        this.numberOfSeats = 10;
        this.numberOfBaggage = 30;
        this.carriageType = CarriageTypes.SPECIAL;
    }
}
