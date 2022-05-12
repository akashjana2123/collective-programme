

public class lec5hw {
    public static void main(String [] args) {

        //prob 1
        
        for(int i=1;i<=5;i++){
            for(int j=5-i;j>=1;j--)
            System.out.print(" ");
            for(int s=1;s<=5;s++)
            System.out.print("*");
            System.out.println();
        }
        

        //prob 2
        
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=5-i;j>=1;j--)
            System.out.print(" ");
            for(int s=1;s<=i;s++)
            System.out.print(num+" ");
            num++;
            System.out.println();
        }
        

        //prob 3
        int k;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
            System.out.print("  ");
            for(int s=i;s>=1;s--)
            System.out.print(s+" ");
            if(i>=2){
                for(k=2;k<=i;k++)
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
    }
}

