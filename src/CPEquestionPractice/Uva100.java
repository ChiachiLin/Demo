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
		while(scanner.hasNextInt()) { //多次輸入
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int min = (num1<num2)?num1:num2; 
			int max = (num1>num2)?num1:num2; 
			int maxtimes = 0;   //設立最大次數
				for(int i =min;i<max;i++) {   //3n+1迴圈
					int count = 1;
						for(int j = i;j!=1;) {
							if(j%2==0)             
								j=j/2;
							else
								j=j*3+1;
							count++;
						}
						if (count>maxtimes)  //每當有計算次數超過maxtimes時,便把該數值設定成maxtimes
							maxtimes = count;
				}
				System.out.println(num1+" "+num2+" "+maxtimes); //Output
			}
	} 
}
