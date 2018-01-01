import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = sc.next();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }




    }
}