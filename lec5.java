import java.util.*;
public class lec5 {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int i,j;
        int num=1;

        // rect.

        for(i=1;i<=n;i++){
            for(j=1;j<=(n+1);j++)
            System.out.print("*");
            System.out.println();
        }
        System.out.println();

        // hollow rect.
        
        for(i=1;i<=n;i++){
            for(j=1;j<=(n+1);j++){
                if(i==1 || j==1 || i==n || j==(n+1))
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // half pyramid
        
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // inverted pyramid
        
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++)
            System.out.print(" ");

            for(j=1;j<=i;j++)
            System.out.print("*");

            System.out.println();
        }
        System.out.println();


        // RHS pyramid
        
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
        System.out.println();

        //number pyramid
        
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++)
            System.out.print(j);
            System.out.println();
        }
        System.out.println();

        //Floyd's Triangle
        
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
            System.out.print(num+"\t");
            num++;
            }
            System.out.println();
        }
        System.out.println();

        //01 tri.
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
            if((i+j)%2==0)
            System.out.print(1+" ");
            else
            System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
