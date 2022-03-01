import java.util.*;
public class SecondsProblem {
 public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input amount of seconds : ");
        int seconds = input.nextInt(); 
        
        int p1 = seconds % 60;
        
        int p2 = seconds / 60;
        
        int p3 = p2 % 60;
        
        p2 = p2 / 60;
        
        System.out.print( " It translates to " + p2 + " hour(s) " + p3 + " minute(s) " + "and " + p1 + " second(s) ");
		System.out.print("\n");
    }    
 }
