package targetheartrate;
import java.util.Scanner;

public class TargetHeartRates{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //User input
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter DOB (MM/DD/YYYY): ");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
        
        //Heart rate calculation
        HeartRates myHeartRate = new HeartRates(firstName, lastName, month, day, year);
        System.out.print("Name: " + firstName + " " + lastName + "\n");
        System.out.print("Age: " + myHeartRate.getAge() + "\n");
        System.out.print("Maximum Heart Rate: " + myHeartRate.maxHeartRate() + "\n");
        myHeartRate.targetHeartRate();
        System.out.print("\n");
        
        
        
    }
}