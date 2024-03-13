import java.util.Scanner;

public class SumofNaturalNumbers {

    public static Integer sumofNaturalNumbers(Integer number){
        Integer count = 0;
        if(number == 0){
             return number;

        }
        return number + sumofNaturalNumbers(number-1);
    }
    public static void main(String [] args) {
        System.out.println("Enter a count of the Natural numbers that you want to sum: ");
        Scanner scInput = new Scanner(System.in);
        Integer number1 = scInput.nextInt();
        System.out.println("Your sum of Natural Numbers is : " + sumofNaturalNumbers(number1));
    }
}
