import java.util.Scanner;
public class conditions{
    public static void main(String[] args) {
        //adult or not 
        System.out.println("whats your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("you are an adult");
        }
        else{
            System.out.println("you are not an adult");
        }

        //even or odd 
        System.out.println("enter a number");
        
        int num =sc.nextInt();

        if(num%2==0){
            System.out.println("even number entered");
        }
        else{
            System.out.println("odd number entered");
        } 

        //compare different num 
        System.out.println("enter num1 to compare");
        int a = sc.nextInt();
        System.out.println("enter num2 to compare");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("both are equal numbers");
        }
        else if(a>b){
                System.out.println("num1 is greater then num2");
        }
        else{
                System.out.println("num1 is lesser then num2");
            
        }

        // switch condition 
        System.out.println("enter 1 for hindi\n enter 2 for english\n enter 3 for french");
        int button = sc.nextInt();
        switch(button){
            case 1 -> System.out.println("NAMASTE");
            case 2 -> System.out.println("HELLO!!");
            case 3 -> System.out.println("BONJOUR");
            default -> System.out.println("INVALID");

        }
    }

}