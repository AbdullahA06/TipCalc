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

    }
}