package InputOutput;
import java.util.*;
public class Circle {
	public static void main(String[] args) {
		double  pi=3.14159;
		System.out.print("Please input the radius(cm) of the circle :");
		Scanner scanner = new Scanner(System.in);
		int radius = scanner.nextInt();
		System.out.printf("The circle's area is : %.3f (cm^2)%n",radius*radius*pi);
		System.out.printf("The circle's circumference is : %.3f (cm^2)",radius*2*pi);
	} 
}
