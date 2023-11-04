package collections.lambdaExpression;

public class mulExample {
	
	public static void main(String [] args) {
	mul m=(a,b)->a * b;
	
	int n1=9;
	int n2=3;
	
	int ans=m.product(n2, n1);
	System.out.println(ans);
	
	}
}
