package newPackage;
import java.util.Scanner;

public class Keywords {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);   
        System.out.print("Enter first number: ");
        int a = sc.nextInt();   
        System.out.print("Enter second number: ");
        int b = sc.nextInt();   
        int sum = a + b;       
        System.out.println("Sum = " + sum);
        sc.close();   

	}

}
