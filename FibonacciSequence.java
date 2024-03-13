import java.util.Scanner;

public class FibonacciSequence {
    public static long numOfWaysToClimb(long usrInput) {
        if (usrInput <= 1){
            return 1;
        }
        return usrInput = (numOfWaysToClimb(usrInput - 1) + numOfWaysToClimb(usrInput -2));
    }

    public static long febSpot(long userInput){
        Integer [] myFibonacciArry = {0,0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};

        int count = 0;
        for(int i = 0; i <= userInput; i++ ){
            count++;
            System.out.println(myFibonacciArry[count]);
        }
        System.out.println();
        System.out.println("count is: ");
        return count-1;
    }

    public static void main(String [] args) {
        System.out.println();
        System.out.println("Calculate your nth Fibonacci number \n" );
        Scanner scInput = new Scanner(System.in);
        long usrInput1 = scInput.nextInt();
        long a = numOfWaysToClimb(usrInput1-1);
        System.out.println("The nth Fibonacci number is :" + a);
        System.out.println();
        System.out.println("Sequence Explanation: ");
        System.out.println(febSpot(usrInput1));

    }
}
