package Array;
import java.util.*;
public class Arraycopy {

	public static void main(String[] args) {
		int s1[] = {1,5,88,36,54,32,92,36};
		int s2[] = new int[s1.length];
		System.arraycopy(s1,0,s2,0,s1.length);
		for(int i=0;i<s1.length;i++) {
			System.out.print(s2[i]+",");
		}
		System.out.println();
		int a1[] = {1,3,5,7,9,11,13};
		int a2[] = new int [a1.length];
			for(int j=0;j<a1.length;j++) {
				a2[j]=a1[j];
				System.out.print(a2[j]+",");
			}
			
	}
	
}
