import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO");
        Scanner ram = new Scanner(System.in);
        String name = ram.nextLine();
        System.out.println("my name is "+ name);
        int a = ram.nextInt();
        int b = ram.nextInt();
        int c = a+b;
        System.out.println(c);

    }
}
