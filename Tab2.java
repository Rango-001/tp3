package tp3;
import java.util.Scanner;

public class Tab2 {
	public static int occ (int []t,int n,int c) {
		int i;
		int f=0;
		int indice=-1; //si l'indice egal -1 l'entier nest pas trouver
		
		for(i=0;i<=n;i++) {
			if(t[i]==c) {
				f++;
				indice=i;
			}
		}
		System.out.println("la deriniere indice de "+c+"dans le tableau egal "+indice);
		return f;
		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		int d;
		int []t=new int [100];
		System.out.println("donner la taille du tableau=");
		n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.print("t["+i+"]=");
			t[i]=sc.nextInt();
		}
		for(int i=0;i<=n;i++) {
			System.out.println("t["+i+"]="+t[i]);
			
		}
		System.out.println("le nombre qui les recherches =");
		d=sc.nextInt();
		int result=occ(t,n,d);
		System.out.println("le nombre d'occurence="+result);
		

	}

}
