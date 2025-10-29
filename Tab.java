package tp3;
import java.util.Scanner;



public class Tab {
	public static  void tri (int t[],int a,int b) {
		int temps;
		temps=t[a];
		t[a]=t[b];
		t[b]=temps;
	}
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int []t=new int[5];
		int i;
		for(i=0;i<5;i++) {
			System.out.print("t["+i+"]=\t ");
			t[i]=sc.nextInt();
			
			
		}
		for(i=0;i<5;i++) {
			System.out.println("t["+i+"]="+t[i]);
		
		
	}
		for(i=0;i<t.length-1;i++) {
			for(int j=0;j<t.length-1-i;j++) {
			if(t[j]>t[j+1]) {
				tri(t,j,j+1);
			}
		}
		}
		System.out.println("tableau triéé");
		for(i=0;i<5;i++) {
			
			System.out.println("t["+i+"]="+t[i]);
		
		
	}
}
}
