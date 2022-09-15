import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rand = (int)(Math.random() * 11);
        System.out.print("Guess the number: ");
        int n = in.nextInt();
        if (rand==n) {
                System.out.println("You guessed the number");
            }
            else{
                System.out.println("You lose!");
            }
        }
        }
