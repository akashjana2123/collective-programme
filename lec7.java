import java.util.*;

public class lec7 {
    /*
     * p1
     * public static void PrintName(String name){
     * System.out.println(name);
     * return;
     * }
     * public static void main (String[] args){
     * 
     * Scanner sc=new Scanner (System.in);
     * System.out.println("Enter name.");
     * String name=sc.nextLine();
     * PrintName(name);
     * }
     */

    /*
     * p2
     * public static int calculateSum(int a, int b) {
     * int sum = a + b;
     * return sum;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("ENter 2 no.");
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * 
     * int sum = calculateSum(a, b);
     * System.out.println(sum);
     * }
     */

    /*
     * p3
     * public static int calculateProduct(int a, int b) {
     * int product = a * b;
     * return product;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("ENter 2 no.");
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * 
     * System.out.println(calculateProduct(a, b));
     * }
     */

    public static void calculatefactorial(int n) {
        int fact = 1;
        if (n < 0) {
            System.out.println("Invalid No.");
            return; // function meh return matlab waha prog. stop ho kar hume result dega
        }
        for (int i = n; i >= 1; i--)
            fact = fact * i;
        // while (n > 0) {
        // n = n % 10;
        // d = n / 10;
        // a = a * d;
        // }
        System.out.println(fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        calculatefactorial(n);
    }
}
