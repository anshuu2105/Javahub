
import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        System.out.println("my name is ....");
        for(int a=0; a<10; a=a+1){
            System.out.println("ANSHI");
        }
        // while loop 
        int i=0;
        while(i<10){
            System.out.println("Anshuuu");
            i++;
        }

        // do while loop
        int j=0;
        do { 
            System.out.println("Anshika");
            j++;
        } while (j<10);

        // sum of first n natural number
        System.out.println("write a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for(int k=1; k<=n; k++){
            sum=sum+k;
        }
        System.out.println(sum+" is the sum of first "+n+" natural numbers");

        // print a table of given number

        System.out.println("write a number to print a table");
        int num = sc.nextInt();

        for(int l=1; l<=10; l++){
            System.out.println(num*l);
        }


    }
}