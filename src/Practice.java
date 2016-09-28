import java.util.Scanner;

public class Practice {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int input_a;
		
		System.out.println("1 또는 2를 입력해주세요");
		input_a = input.nextInt();
		
		switch(input_a){
		
		case 0:
		System.out.println("없다");
		
		
		case 1:
		System.out.println("하나");
		break;
		
		case 2:
		System.out.println("둘");
		break;
		
		default:
		System.out.println("많다");
		break;
		
		}
		
		
	}
}
