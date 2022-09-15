import java.util.Scanner;
public class Radius{
    public static void main(String[] args) {
        double pi=3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter radius: ");
        int radius = in.nextInt();
        double AREA= pi*radius*radius;
        if (radius >0) {
            System.out.print("The area of a circle with radius "+radius+" is "+AREA);
        }
        else if(radius<0){
            System.out.print("radius should be positive");
        }
    }

}
