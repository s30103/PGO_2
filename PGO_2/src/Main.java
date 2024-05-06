import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String City = "Warsaw";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Is the person a resident of Warsaw? (yes/no): ");
        String isResident = scanner.next();
        if(isResident.equals("no")) {
            System.out.println("City:");
            City = scanner.next();
        }
        System.out.print("Is today Thursday? (yes/no): ");
        String isThursday = scanner.next();
        double ticketPrice = 40.0;
        double znizka= 1;
        if (age < 10) {
            znizka = 0;
        } else if (age >= 10 && age <= 18) {
            znizka = 0.5;
        }
        if (isResident.equalsIgnoreCase("yes")) {
            znizka= 0.9;
        }
        if (isThursday.equalsIgnoreCase("yes")) {
            znizka = 0;
        }
        ticketPrice=znizka*ticketPrice;
        System.out.println("Data: " + City + "," + " Weekday price is: " + ticketPrice + " wysokosc znizki to: " + (((znizka * 100) ==0) ? 100  : (100 - znizka*100) )+ "%");
        scanner.close();
    }
}