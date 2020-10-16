package Train.Carriages;

public class CompartmentCarriage extends Carriage {

    public CompartmentCarriage(int carriageNumber) {
        super(carriageNumber);
        this.numberOfSeats = 20;
        this.numberOfBaggage = 40;
        this.carriageType = CarriageTypes.COMPARTMENT;
    }
}