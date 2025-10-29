package tp3;
import java.util.Scanner;

public class Tab3 {
	public static void main(String args[]) {
		int n;
		int []t=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("donner la taille du tableau");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int s=0;
			for(int j=0;j<=i;j++) {
				s=j+s;
				t[i]=s;
			}
			
		}
		for(int i=0;i<n;i++) {
			System.out.println("t["+i+"] " + t[i]);
		}
	}

}
