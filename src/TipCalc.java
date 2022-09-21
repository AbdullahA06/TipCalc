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

        double totalTip= (totalBill*tipPercent)/100;
        double finalBill=totalBill+totalTip;
        double soloBill=finalBill/numPeople;
        double tipPerPerson=totalTip/numPeople;

        System.out.print("For tips every person in your party has to pay $");
        System.out.format("%.2f%n",tipPerPerson);

        System.out.print("In total every person in your party has to pay $");
        System.out.format("%.2f%n",soloBill);


    }
}
