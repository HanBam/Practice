import java.util.Scanner;

public class Practice {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int input_a;
		
		System.out.println("1 �Ǵ� 2�� �Է����ּ���");
		input_a = input.nextInt();
		
		switch(input_a){
		
		case 0:
		System.out.println("����");
		
		
		case 1:
		System.out.println("�ϳ�");
		break;
		
		case 2:
		System.out.println("��");
		break;
		
		default:
		System.out.println("����");
		break;
		
		}
		
		
	}
}
