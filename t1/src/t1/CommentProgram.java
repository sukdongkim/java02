package t1;
import java.util.Scanner;      // Scanner Ŭ������ ����
public class CommentProgram {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// ���� ������ �ܼ� â���� �Է��� ��û�ϴ� �����Դϴ�
		System.out.print("�̸��� ����, �����Ը� ����(space)���� �����Ͽ� �Է� : "); 
		/* ǥ�� �Է����� ���ڿ��� ����, 
		 * �Ǽ��� �Է¹޾� ������ ���� ������ ���� ����   */
		String name = stdIn.next();
		int i = stdIn.nextInt();
		double d = stdIn.nextDouble();
		System.out.println(name + "���� ���̴� " + i + "���̰�"); 
		System.out.println("�����Դ� " + d + "Kg �Դϴ�");   // ����� ���� ���
	}
}
