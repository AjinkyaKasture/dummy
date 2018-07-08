import java.util.*;

class Swap{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Enter The Two Numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Numbers Before Swapping : " );
		System.out.println("Number 1 = " +num1);
		System.out.println("Number 2 = " +num2);
		
//		
//		num3=num1;
//		num1=num2;
//		num2=num3;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("-----------------------------");
		
		System.out.println("Numbers After Swapping : " );
		System.out.println("Number 1 = " +num1);
		System.out.println("Number 2 = " +num2);
		
		
		
	}
}