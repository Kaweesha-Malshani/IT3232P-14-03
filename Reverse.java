//3)print the numbers in reverse
import java.util.Scanner;
public class Reverse {
    public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0,reverse=0;
		while(num>0){
			int n=num%10;
			reverse=reverse*10+n;
			num/=10;
		}
		System.out.println(reverse);
	}
}