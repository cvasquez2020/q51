import java.util.Scanner;

public class q51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	
	System.out.print("enter length: ");
        double length = in.nextDouble();
	System.out.print("enter width: ");
	double width = in.nextDouble();
	
	double area = length*width;

	
	
	System.out.print("The area of ");
	System.out.printf("%.1f", length);
	System.out.print("-by-");
	System.out.printf("%.1f", width);
	System.out.print(" rectangle is ");
	System.out.printf("%.1f", area);
	System.out.print(".");
        in.close();
    }
}