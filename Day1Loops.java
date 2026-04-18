// import java.util.*;
// public class Day1IfElse {
//     public static void main(String[] args) {
//        boolean isIdentityCardPresent = false;
//        if (isIdentityCardPresent) {
        
//            System.out.println("You can enter the college.");
//        } else {
//            System.out.println("You cannot enter the college.");
//        }

//     }
// }

// import java.util.*;
// public class Day1IfElse{
//     public static void main(String[]args){
//        String customerUsername = "Trisha_1104";
//         String customerPassword = "Trisha@1104";
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your username ");
//         String username = sc.nextLine();
//         System.out.println("Enter your password ");
//         String password = sc.nextLine();
//          if(username.equals(customerUsername) && password.equals(customerPassword)){
//             System.out.println("Login successful");
//         } else {
//             System.out.println("Login failed");
//          }

//     }
// }

import java.util.*;

public class Day1Loops {
    public static void main(String[] args) {
        int i = 10;

        while (i > 0) {
            System.out.println(i);
            i--;   // update
        }

        System.out.println("Happy New Year");
    }
}

