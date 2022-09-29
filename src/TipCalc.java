import java.util.Scanner;
public class TipCalc {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        double totalBill=s.nextDouble();
        System.out.print("Enter the tip percent (as whole number): ");
        double tipPercent=s.nextDouble();
        System.out.print("Enter party size: ");
        int numPeople=s.nextInt();
        System.out.println();

        double totalTip= (totalBill*tipPercent)/100;
        double finalBill=totalBill+totalTip;
        double soloBill=finalBill/numPeople;
        double tipPerPerson=totalTip/numPeople;

        System.out.print("In total your party has tipped $");
        System.out.format("%.2f%n",totalTip);
        System.out.println();

        System.out.print("Which means your party's total bill including the tip is $");
        System.out.format("%.2f%n",finalBill);
        System.out.println();

        System.out.print("In tips every person in your party has to pay $");
        System.out.format("%.2f%n",tipPerPerson);
        System.out.println();

        System.out.print("And in total every person in your party has to pay $");
        System.out.format("%.2f%n",soloBill);
        System.out.println();


    }
}
