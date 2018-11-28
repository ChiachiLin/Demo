package InputOutput;
import java.util.*;
public class RectangleArea {
	public static void main(String[] args) {
	System.out.print("Please input the length(cm) and wide(cm) of the rectangle :");
	Scanner scanner = new Scanner(System.in);
	int length= scanner.nextInt();
	int wide  = scanner.nextInt();
	System.out.printf("The area of the rectangle is :%d (cm^2)", (length*wide));
	}
}
