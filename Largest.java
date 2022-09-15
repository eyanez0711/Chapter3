import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n1 = in.nextInt();
        in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n2 = in.nextInt();
        in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n3 = in.nextInt();
        if (n1 > n2 && n1 > n3)
            System.out.println(n1 + " is the largest number");
         else if (n2 > n1 && n2 > n3)
            System.out.println(n2 + " is the largest number");

            else
                System.out.println(n3+" is the largest number");

        }
