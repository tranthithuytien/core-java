package javanangcao;

import java.util.Scanner;

public class bai112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		System.out.print("Nhap so: ");
	    int i = in.nextInt(); 
        int i1 = i;
		long ctr = 0;
		while (i != 0) 
		{
			ctr += i / 5;
			i /= 5;
		}
		System.out.printf("So cua giai thua %d is %d ",i1,ctr);
		System.out.printf("\n");      	     
	}

}
