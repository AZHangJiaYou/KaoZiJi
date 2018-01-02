package ZJY;

import java.util.Scanner;

public class zjy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入一个数");
    int b=sc.nextInt();
   int[] arr=new int[b];
   for(int i=0;i<arr.length;i++){
	   arr[i]=i+1;
	   System.out.println(arr[b]);
   }
  
	}
	   
}
