import java.util.Scanner
public class RandomNumber{
public static void main(String[] args){
Scanner in= new Scanner(System.in);
int rand=(int)(Math.random()*11);
System.out.print("Guess the number:  ");
int guess=in.nextInt();
if(rand
