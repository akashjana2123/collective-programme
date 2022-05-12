public class lec6 {
    public static void main(String[] args) {
        
        int n=4;
        // butterfly pattern
        
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
                for(int j=1;j<=2*(n-i);j++)
                System.out.print(" ");
                for(int j=i;j>=1;j--)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
                for(int j=1;j<=2*(n-i);j++)
                System.out.print(" ");
                for(int j=i;j>=1;j--)
                System.out.print("*");
            System.out.println();
        }
        
        // p2
        
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
            System.out.print(" ");
            for(int s=1;s<=n;s++)
            System.out.print("*");
            System.out.println();
        }
        
        //p3
        
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
            System.out.print(" ");
            for(int s=i;s>=1;s--)
            System.out.print(s);
            System.out.println();
        }
        
        //p4
        
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
            System.out.print(" ");
            for(int s=i;s>=1;s--)
            System.out.print(s);
            for(int s=2;s<=i;s++)
            System.out.print(s);
            System.out.println();
        }
        
        //p5
        
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" ");
            }
                for(int j=0;j<=2*(n-i);j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(" ");
            }
                for(int j=0;j<=2*(n-i);j++)
                System.out.print("*");
            System.out.println();
        }
        
    }
}