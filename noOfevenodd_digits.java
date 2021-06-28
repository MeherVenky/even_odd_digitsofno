import java.util.Scanner;

public class noOfevenodd_digits{
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int v=0;
	int c=0;
	int r;
	while(n!=0) {
	  r=n%10;
	if(r%2==1) {
	  c=c+1;	
	}
	else {
	v++;
	}
        n=n/10;
	  }
   System.out.println("odd digits="+c);
   System.out.print("even digits="+v);

}
}