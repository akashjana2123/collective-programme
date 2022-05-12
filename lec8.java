import java.util.*;

class lec8 {

    /*
     * p1
     * public static int FindAverage(int a, int b, int c) {
     * int average = (a + b + c) / 3;
     * return average;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter 3 no.");
     * int a, b, c;
     * a = sc.nextInt();
     * b = sc.nextInt();
     * c = sc.nextInt();
     * System.out.println("Average = " + FindAverage(a, b, c));
     * }
     */

    /*
     * p2
     * public static void SumOfOddNumbers(int n) {
     * int sum = 0;
     * for (int i = 1; i <= n; i += 2)
     * sum = sum + i;
     * System.out.println("Sum of all odd no. = " + sum);
     * return;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter a no.");
     * int n = sc.nextInt();
     * SumOfOddNumbers(n);
     * }
     */

    /*
     * p3
     * public static void FindMax(int a, int b) {
     * if (a > b)
     * System.out.println("greater no. = " + a);
     * else
     * System.out.println("greater no. = " + b);
     * return;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter 2 no.");
     * int a, b;
     * a = sc.nextInt();
     * b = sc.nextInt();
     * FindMax(a, b);
     * }
     */

    /*
     * p4
     * public static void CalculateCircumference(double r) {
     * double circumference = 44 * r / 7;
     * System.out.println(circumference);
     * return;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter radius");
     * double r = sc.nextDouble();
     * CalculateCircumference(r);
     * }
     */

    /*
     * p5
     * public static void CheckEligible(int age) {
     * if (age >= 18)
     * System.out.println("eligible to vote");
     * else
     * System.out.println("not eligible to vote");
     * return;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter your age.");
     * int age = sc.nextInt();
     * CheckEligible(age);
     * }
     */

    /*
     * p6
     * public static void main(String[] args) {
     * int n = 1;
     * do {
     * System.out.println("virus affected");
     * n++;
     * } while (n > 0);
     * }
     */

    // Is Question meh Runtime error hai so fir se ck=heck kar lena

    /*
     * p7
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter no. of digits you want to enter");
     * int n = sc.nextInt();
     * int a = 0, b = 0, c = 0; // for counting
     * int i;
     * int ar[] = new int[n];
     * System.out.println("Enter " + n + " no.");
     * for (i = 0; i < n; i++)
     * ar[i] = sc.nextInt();
     * 
     * for (int j = 0; j < n; j++) {
     * if (ar[i] > 0)
     * a++;
     * else if (ar[i] < 0)
     * b++;
     * else
     * c++;
     * }
     * System.out.println("+ve no. = " + a);
     * System.out.println("-ve no. = " + b);
     * System.out.println("0s = " + c);
     * }
     */

    /*
     * p8
     * public static void FindValue(int x, int n) {
     * double ans = Math.pow(x, n);
     * System.out.println(ans);
     * return;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("first enter the base then power");
     * int x = sc.nextInt();
     * int n = sc.nextInt();
     * FindValue(x, n);
     * }
     */

}