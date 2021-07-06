import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter Alphabate to Check");
        char ch= s.nextLine().charAt(0);


        switch (ch){
                case 'a':
                System.out.println("VOWEL");
                break;
            case 'e':
                System.out.println("VOWEL");
                break;
            case 'i':
                System.out.println("VOWEL");
                break;
            case 'o':
                System.out.println("VOWEL");
                break;
            case'u':
                System.out.println("VOWEL");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}




