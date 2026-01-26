import java.util.Scanner; 

public class Main {
    int miles;
    int mgp;
    double cost;
    double totalCost;

    Scanner scanner = new Scanner (System.in);

    System.out.print("Please enter the miles: ");
    miles = scanner.nextInt();
    ystem.out.println();


    System.out.print("Please enter miles per gallon: ");
    mgp = scanner.nextInt();
    ystem.out.println();

    System.out.print("Please enter the cost: ");
    cost = scanner.nextDouble();
    ystem.out.println();

    totalCost = (miles/mgp) * cost

    System.out.println("You will spend $" + totalCost + "for gas on your trip!")

}