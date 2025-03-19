package Task.ParkingSytem;

import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter In-Time (HH MM): ");
        int inHour = scanner.nextInt();
        int inMinute = scanner.nextInt();

        System.out.print("Enter Out-Time (HH MM): ");
        int outHour = scanner.nextInt();
        int outMinute = scanner.nextInt();

        scanner.close();

        if (outHour < inHour || (outHour == inHour && outMinute < inMinute)) {
            System.out.println("Invalid time input. Out-Time must be after In-Time.");
            return;
        }

        int totalMinutes = (outHour * 60 + outMinute) - (inHour * 60 + inMinute);
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        int parkingCharge = (minutes > 0) ? (hours + 1) * 10 : hours * 10;

        System.out.println("Total Parking Fee: " + parkingCharge + " Rupees");
    }
}
