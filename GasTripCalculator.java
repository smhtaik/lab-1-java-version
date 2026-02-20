import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        int miles;
        int mgp;
        double cost;
        double totalCost;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter the miles: ");
        miles = scanner.nextInt();
        System.out.println();


        System.out.print("Please enter miles per gallon: ");
        mgp = scanner.nextInt();
        System.out.println();

        System.out.print("Please enter the cost: ");
        cost = scanner.nextDouble();
        System.out.println();

        totalCost = (miles/mgp) * cost; 

        System.out.println("You will spend $" + totalCost + "for gas on your trip!");
    }
    
}