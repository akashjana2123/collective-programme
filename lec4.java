import java.util.*;
public class lec4 {
    public static void main(String [] args) {
        int i=0;
        for (i=0;i<3;i++)
        System.out.println("Hello World");
        

        //p1
        
        for(i=0;i<=10;i++)
        System.out.println(i);
        System.out.print(i+" ");
        
        //p2
        
        i=0;
        while (i<11){
            System.out.println(i);
            i++;
        }
        
        //p3
        
        i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<11);
        

        //False statement

        i=12;
        while(i<11){
            System.out.println("Akash");
        }
        do{
            System.out.println("Akash");
            i++;
        }
        while(i<11);
        
        //p5
        
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        s=s+i;
        System.out.println(s);
        
        //p6

        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the no.");
        //int n=sc.nextInt();
        for(i=1;i<11;i++)
        System.out.println(n+" * "+i+" = "+(n*i));
    }
}
