
public class lec6hw {
    public static void main(String[] args) {

        int n=7;
        
        //hollow butterfly
        
        n=n+1;
        for(int i=1;i<=n-1;i++){
            for(int j=i;j>=1;j--){
                if(i==1 || j==1 || i==n || j==(n+1) || i==j)
        System.out.print("*");
        else{
            System.out.print(" ");
        }
            }
            
                for(int j=1;j<=2*(n-i);j++)
                System.out.print(" ");
                for(int j=i;j>=1;j--)
                if(i==1 || j==1 || i==n || j==(n+1) || i==j)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            System.out.println();
        }
        
        for(int i=n-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                if(i==1 || j==1 || i==n || j==(n+1) || i==j)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
                for(int j=1;j<=2*(n-i);j++)
                System.out.print(" ");
                for(int j=i;j>=1;j--)
                if(i==1 || j==1 || i==n || j==(n+1) || i==j)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            System.out.println();
        }
        
        

        // hollow Rhombus
        
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
            System.out.print(" ");
            for(int j=1;j<=(n+1);j++){
                if(i==1 || j==1 || i==n || j==(n+1))
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        

        // Pascal's Triangle
        
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
            System.out.print(" ");
            int C = 1;
            for (int j=1;j<=i;j++) {
                System.out.print(C+" ");
                C=C*(i-j)/j;
            }
            System.out.println();
        }
        
        
        //half pyramid
        
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
            System.out.print(" ");
            for (int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        

        //inverted Triangle
        
        n=n+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            System.out.print(i+" ");
            System.out.println();
        }
        
    }
}
        
   