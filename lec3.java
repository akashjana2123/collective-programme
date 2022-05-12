import java.util.*;

public class lec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter case");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: {
                System.out.println("Enter age");
                int age = sc.nextInt();
                if (age >= 18) {
                    System.out.println("Adult");
                } else {
                    System.out.println("Child");
                }
            }
                break;
            case 2: {
                System.out.println("enter a no.");
                int k = sc.nextInt();
                if (k % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
                break;
            case 3: {
                System.out.println("enter values of a ");
                int a = sc.nextInt();
                System.out.println("enter the value of b");
                int b = sc.nextInt();
                if (a == b) {
                    System.out.println("Equal");
                } else if (a > b) {
                    System.out.println("a is greater");
                } else {
                    System.out.println("a is lesser");
                }
            }
                break;
            case 4: {
                int ch1 = sc.nextInt();
                switch (ch1) {
                    case 1:
                        System.out.println("hello");
                        break;
                    case 2:
                        System.out.println("namaste");
                        break;
                    case 3:
                        System.out.println("bonjour");
                        break;
                    default:
                        System.out.println("Wrong choise");
                }
            }
                break;
            default:
                System.out.println("Wrong choise");
        }
    }
}
