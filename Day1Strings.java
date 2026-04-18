import java.util.*;

public class Day1Strings {
    public static void main(String[]args){
        System.out.println("Enter your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
         System.out.println("Enter your skills ");
        String Skills = sc.nextLine();
            System.out.println("Enter your age ");
        int age = sc.nextInt();
        
            System.out.println("Enter your city ");
        String city = sc.nextLine();
        System.out.println("Enter the number of years you have been learning programming ");
    int Year = sc.nextInt();

        
        System.out.println("Hello my name is " + name  + " and I am " + age + " years old. I am from " + city + " and I have skills in " + Skills + ". I have been learning programming for " + Year + " years.");
     float num1 = 10.5f;
     float num2 = 20.5f;
        float sum = num1 + num2;
        System.out.println("The sum of two numbers is " + sum);
    }

}
