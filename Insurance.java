public class Inurance{
    public static void main(String[] args) {
        System.out.print("base of insurance is $300");
        Scanner in = new Scanner(System.in);
        System.out.println("\nPlease enter age: ");
        int age = in.nextInt();
        in = new Scanner(System.in);
        System.out.println("Please enter number of accidents: ");
        int accidents = in.nextInt();
        if (age <= 27)
            System.out.println(" there is a surcharge of $100");
        if(accidents == 1)
            System.out.println("There is a surcharge of $100");
        else if(accidents==2)
            System.out.println("There is a surcharge of $150");
        else if(accidents==3)
            System.out.println("There is a surcharge of $250");
        else if(accidents>=4)
            System.out.println("There is a surcharge of $1000");


    }
}
