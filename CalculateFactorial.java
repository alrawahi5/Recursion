import java.util.Scanner;

public class CalculateFactorial {

//    public static int fact(Integer n){
//        int factorial = 1;
//        for (int i = 1; i <= n; i++){
//            factorial = factorial * i;
//        }
//        return (factorial);
//    }

    public static long fact(Integer userInput2){
        if (userInput2 >= 1){
            return userInput2 * fact(userInput2-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String [] args) {
        System.out.println("Enter a number to get its  factorial: ");
        Scanner scInput = new Scanner(System.in);
        Integer usrInput1 = scInput.nextInt();
        System.out.println("Your factorial is : " + -2
                fact(usrInput1));
    }
}
