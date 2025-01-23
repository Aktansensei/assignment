import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        arrayStatistics();
        System.out.println("Is palindrome: " + palindrome());
    }
    public static void arrayStatistics() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter a number:");
        numbers[0] = scanner.nextInt();
        int sum = numbers[0];
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            System.out.print("Enter a number:");
            int num = scanner.nextInt();
            numbers[i] = num;
            sum += num;
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }

        System.out.println("\nArray: " + Arrays.toString(numbers));
        System.out.println("Sum:" + sum);
        System.out.println("Average:" + (double) sum/ numbers.length);
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
    }
    public static boolean palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number or a word: ");
        String str = scanner.nextLine().trim();
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}