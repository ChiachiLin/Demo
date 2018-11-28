/* Problem 3n+1
1. input n
2. print n
3. if n = 1 then STOP
4. if n is odd then n <- 3n + 1
5. else n <- n/2
6. GOTO 2
*/


package CPEquestionPractice;
import java.util.*;
public class Uva100 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()) { //�h����J
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int min = (num1<num2)?num1:num2; 
			int max = (num1>num2)?num1:num2; 
			int maxtimes = 0;   //�]�̤߳j����
				for(int i =min;i<max;i++) {   //3n+1�j��
					int count = 1;
						for(int j = i;j!=1;) {
							if(j%2==0)             
								j=j/2;
							else
								j=j*3+1;
							count++;
						}
						if (count>maxtimes)  //�C���p�⦸�ƶW�Lmaxtimes��,�K��Ӽƭȳ]�w��maxtimes
							maxtimes = count;
				}
				System.out.println(num1+" "+num2+" "+maxtimes); //Output
			}
	} 
}
