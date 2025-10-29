package tp3;
import java.util.Scanner;

public class Tab4 {
	public static void maxmin(int[]t,int n){
		int i=0;
		int max=t[0];
		int min=t[0];
		for(i=1;i<n;i++) {
			if(t[i]>max) max=t[i];
			 if(t[i]<min) min=t[i];
			
			
		}
		System.out.println("la valeur maximal " +max);
		System.out.println("la valeur minimal " +min);
		
	}
	static int somme(int[]t,int n) {
		int s=0;
		for(int i=0;i<n;i++) {
			s=t[i]+s;
		}
		return s;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		int s;
		int []t=new int[20];
		System.out.println("donner la taille du tableau");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("t["+i+"]=\t");
			t[i]=sc.nextInt();
			
		}
		maxmin(t,n);
		s=somme(t,n);
		System.out.println("la somme des cases du tableau = "+s);
		
	}
	

}
