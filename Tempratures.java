import java.util.Scanner;
public class Tempratures {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit =((celsius * 9/5) + 32);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}