import java.util.Scanner;
public class CountDigits {
    public static Integer numberOfDigit = 0;
    public static Integer countDigits(Integer number){
    if(number > 0){
        numberOfDigit++;
        countDigits(number/10);
    }
    return numberOfDigit;
    }
    public static void main(String [] args) {
        Scanner scInput = new Scanner(System.in);
        Integer numberOfDigit;
        Integer number;
        System.out.println();
        System.out.println("Enter your number:  \n" );
        number = scInput.nextInt();
        System.out.println();
        System.out.println("Sequence Explanation: ");
        numberOfDigit = countDigits(number);
        String c = "The Number " + number + " has " + numberOfDigit + " Digits";
        System.out.println(c);

    }
}
