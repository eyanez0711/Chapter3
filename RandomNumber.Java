import java.util.Scanner;
public class RandomNumber{
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    int rand=(int)(Math.random()*11);
    System.out.print("Guess the number:  ");
    int guess=in.nextInt();
    if(rand>=0){
      if(rand<=10){
        System.out.println("Horray you guessed the number."):
}        
  }
  else{
  System.print.out.ln(You Lost!!");
  }
 }
} 
