import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int numberOfDigits = 5;

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        System.out.println(("Enter " + numberOfDigits + " digits:"));
        Scanner input = new Scanner(System.in);

        int count = 0;
        while (count < numberOfDigits) {
            listOfNumbers.add(input.nextInt());
            count++;
        }
        System.out.println(("Yours digits:" + listOfNumbers));

        for (Integer list : listOfNumbers) {
            sum += list;
        }
        System.out.println(("Sum of yours digits: " + sum));
    }

}