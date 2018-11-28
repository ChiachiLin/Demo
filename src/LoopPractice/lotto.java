package LoopPractice;

public class lotto {
	public static void main(String[] args) {
		        System.out.println("樂透號碼為：");
		        for(int i=0;i<7;i++) {
		        System.out.print((int)(Math.random()*42+1)+" "); //強迫轉型成整數
		        }
		}
	}


