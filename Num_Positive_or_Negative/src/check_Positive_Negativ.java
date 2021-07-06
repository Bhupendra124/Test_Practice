import java.util.Scanner;

public class check_Positive_Negativ {
    public static void main(String[] args) {
        int number=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number to check");
        number=s.nextInt();
        if(number>0) {
            System.out.println("POSITIVE");
        }
            else if (number<0){
                System.out.println("NEGATIVE");

            }
            else{
            System.out.println("ZERO");
        }
    }
}
