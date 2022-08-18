import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.print("Enter number of rows:");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
		  for(j=0;j<=n/2;j++)
		  {
			  
		  if(j==0 || j==n/2 && i!=0|| i==0 && j!=n/2 || i==n/2)
            System.out.print("*");
		  else System.out.print(" ");
		  }
		   System.out.println();
		}
		
	
	}	
}


