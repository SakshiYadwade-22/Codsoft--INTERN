import java.util.*;
public class RandomNumber{
    public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int a=random.nextInt(100),b=1,s=0; //b = number of attempts s= incorrect guess
        System.out.println("-----Welcome to the Number Game ----- \n----Enjoy the Experience----\nRandom Number Generates From 0 to 99:");
        while(b<=5) 
        {
	        System.out.print("Enter The Number: ");
	        int c=sc.nextInt();
	        if(c>a)
	        {
		        System.out.println("Large value think less than this Number!!");
		        s++;
	        }
	        else if(c<a)
	        {
		        System.out.println("Small value think Greater than this Number!!");
		        s++;
	        }
	        else
	        {
		        System.out.println("Succesful • Yeah!! It is  the Right Answer");
		        break;
	        }
	        b++;
        }
        int f=5-s; // f calculate & store user score
  
        if(s==5)
        {
	    System.out.println("Sorry for the inconvenience • better luck next time!!");
        }
        else
        {
	    System.out.println("Congrats!! You Have Won The Game!!  \nYou are an Cracker  \nPlay Again!!");
	    System.out.println("Your Score is "+f+"/5");
        }
        System.out.println("The Random Number is "+a);
        sc.close();
    }
   
}