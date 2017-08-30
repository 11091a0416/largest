import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of i");
		i=sc.nextInt();
		System.out.println("enter the value of j");
		j=sc.nextInt();
		if(i>j)
		{
			System.out.println("i is greater: "+i);
		}
		else
		{
			System.out.println("j is greater: "+j);
		}

	}

}
