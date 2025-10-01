import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the no of rows");
        int a = sc.nextInt();
        System.out.println("write the no of column");
        int b = sc.nextInt();

       // solid rectangle 
       System.out.println("here's your solid rectangle");
        for(int i = 1; i<=a; i++){
            for(int j= 1; j<=b; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // hollow rectangle
        System.out.println("here's a hollow rectangle");
         for(int i =1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i==1 || i==a || j==1 || j==b){
                    System.out.print("*");    
                }
                else{     
                    System.out.print(" ");
                }
            }
            System.out.println("");
         }

         // half pyramid
         System.out.println("here's a half pyramid");
         for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
         }

         // inverted half pyramid
         System.out.println("here's a inverrted half pyramid");
         for(int i = a; i>=1; i--){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
         }
             // inverted half pyramid (rotated by 180 degree)
         System.out.println("here's a inverted half pyramid (rotated by 180 degree)");
         for(int i=1; i<=a ; i++){
             for(int j=1; j<i; j++){
                 System.out.print(" ");
             }
             for(int j=1; j<=i; j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}