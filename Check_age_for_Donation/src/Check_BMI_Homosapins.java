import java.util.Scanner;

public class Check_BMI_Homosapins {
    public static void main(String[] args) {
        int age = 0;
        int weight = 0;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter age");
        age = a.nextInt();
        Scanner w = new Scanner(System.in);
        System.out.println("Enter weight");
        weight = w.nextInt();

        if(age >= 18) {
            if (weight > 50) {
                System.out.println("You can Eligible to Donate Blood");
            } else {
                System.out.println("you can not Eligible to Donate Blood");
                   }
                       }else
            {
                System.out.println("You are under age");
            }
        }
    }


