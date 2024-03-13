import java.util.Scanner;
public class ReverseaString {

    public static void reverseAstring(String word){
        String revWord = "";
        if (word.length() <= 1){
            System.out.println(word);
        }
        else {
            char a = word.charAt(word.length()-1);
            System.out.print(a);
            reverseAstring(word.substring(0, word.length()-1));
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        reverseAstring(word);

    }
}
