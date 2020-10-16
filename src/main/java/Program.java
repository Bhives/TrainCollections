import Train.Carriages.*;
import Train.Train;

import java.util.Collections;
import java.util.Scanner;

public class Program {
    //Транспорт.
    // Создать пассажирский поезд.
    // Подсчитать общую численность пассажиров и багажа.
    // Провести сортировку вагонов поезда на основе уровня комфортности.
    // Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String trainNumber;
        int point;
        int numberOfCarriages;
        System.out.println("1. Create a train" + "\n"
                + "2. Exit");
        point = scanner.nextInt();
        switch (point) {
            case 1:
                System.out.print("Train number: ");
                trainNumber = scanner.next();
                Train train = new Train(trainNumber);
                System.out.print("Number of carriages: ");
                numberOfCarriages = scanner.nextInt();
                addTrain(trainNumber, numberOfCarriages, train);
                trainInformationMenu(train);
                break;
            case 2:
                System.exit(0);
        }
    }

    public static void addTrain(String trainNumber, int numberOfCarriages, Train train) {
        Scanner scanner = new Scanner(System.in);
        int switchCarriageType;
        for (int i = 0; i < numberOfCarriages; i++) {
            System.out.println("Choose a class for carriage number " + (i + 1) + " :");
            System.out.println("Carriage type:" + "\n"
                    + "1. Deluxe" + "\n"
                    + "2. Special" + "\n"
                    + "3. Compartment");
            switchCarriageType = scanner.nextInt();
            switch (switchCarriageType) {
                case 1:
                    train.addCarriage(new DeluxeCarriage(i + 1));
                    break;
                case 2:
                    train.addCarriage(new SpecialCarriage(i + 1));
                    break;
                case 3:
                    train.addCarriage(new CompartmentCarriage(i + 1));
                    break;
            }
        }
        System.out.println(train.toString());
    }

    public static void trainInformationMenu(Train train) {
        Scanner scanner = new Scanner(System.in);
        int switchTrainOption;
        int lesserNumber;
        int biggerNumber;
        System.out.println("1. Count total number of passenger seats and baggage places" + "\n"
                + "2. Sort carriages by class" + "\n"
                + "3. Find carriages with given range of passenger seats number" + "\n"
                + "4. Exit");
        switchTrainOption = scanner.nextInt();
        switch (switchTrainOption) {
            case 1:
                System.out.println("Total number of passenger seats: " + train.countTotalNumberOfPassengerSeats());
                System.out.println("Total number of baggage places: " + train.countTotalNumberOfBaggagePlaces() + "\n");
                trainInformationMenu(train);
                break;
            case 2:
                Collections.sort(train.getCarriages(), new Carriage.CarriageClassComparator());
                System.out.println("Train with carriage sorted by class:" + "\n" + train.toString());
                trainInformationMenu(train);
                break;
            case 3:
                System.out.println("Enter range of seat numbers:");
                System.out.print("First number: ");
                lesserNumber = scanner.nextInt();
                System.out.print("Second number: ");
                biggerNumber = scanner.nextInt();
                System.out.println("Carriages with number of seats between " + lesserNumber + " and " + biggerNumber + ":");
                for (Carriage carriage : train.getCarriages()) {
                    train.carriagesWithGivenRangeOfSeatNumbers(carriage, lesserNumber, biggerNumber);
                }
                trainInformationMenu(train);
                break;
            case 4:
                System.exit(0);
        }
    }
}
