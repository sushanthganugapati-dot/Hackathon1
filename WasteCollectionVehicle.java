import java.util.Scanner;

public class WasteCollectionVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vehicleNumber;
        double wasteCollected;
        int collectionPoints;
        char vehicleStatus;

        System.out.print("Enter Vehicle Number: ");
        vehicleNumber = sc.nextInt();

        System.out.print("Enter Waste Collected (kg): ");
        wasteCollected = sc.nextDouble();

        System.out.print("Enter Number of Collection Points: ");
        collectionPoints = sc.nextInt();

        System.out.print("Enter Vehicle Status (A/I): ");
        vehicleStatus = sc.next().charAt(0);

        System.out.println("\n--- Waste Collection Vehicle Details ---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        sc.close();
    }
}