import java.util.Scanner;
public class TestStats {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input your first number: ");
        double x1 = input.nextDouble();

        System.out.print("Input your second number: ");
        double x2 = input.nextDouble();

        System.out.print("Input your third number: ");
        double x3 = input.nextDouble();

        double mean =((x1+x2+x3) / 3);
        System.out.println("The mean of this data is " + mean);

        double variance =(((x1 - mean)*(x1 - mean)) + ((x2-mean)*(x2-mean)) + ((x3 - mean)*(x3 - mean)))/ 3; 
        System.out.println("The Variance of the data is " + variance);
        
        double deviation=Math.sqrt(variance);
	    System.out.println("The standard deviation is "+deviation);
    }
}