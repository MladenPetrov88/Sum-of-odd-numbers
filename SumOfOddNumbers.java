import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int sumOfOddNumbers = 0;
        int currentNum = 1;
        for (int i = number; i > 0; i--)
        {
            sumOfOddNumbers += currentNum;
            System.out.println(currentNum);
            currentNum += 2;
        }

        System.out.println("Sum: " + sumOfOddNumbers);
    }
}
