import Exercise1.NumSum;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NumSum numSum = new NumSum();
        Scanner askNumber = new Scanner(System.in);
        System.out.println("Please write first number:");
        Integer num1 = askNumber.nextInt();
        System.out.println("Please write the second number:");
        Integer num2 = askNumber.nextInt();
        numSum.SumNum(num1, num2);
    }
}