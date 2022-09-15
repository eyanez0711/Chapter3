import java.util.Scanner;
public class DayOfTheWeek{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a day 1 - 7: ");
        int day = in.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("week day");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }
}
