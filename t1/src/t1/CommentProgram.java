package t1;
import java.util.Scanner;      // Scanner 클래스를 포함
public class CommentProgram {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 다음 문장은 콘솔 창에서 입력을 요청하는 문장입니다
		System.out.print("이름과 나이, 몸무게를 공간(space)으로 구분하여 입력 : "); 
		/* 표준 입력으로 문자열과 정수, 
		 * 실수를 입력받아 적합한 형의 변수에 값을 저장   */
		String name = stdIn.next();
		int i = stdIn.nextInt();
		double d = stdIn.nextDouble();
		System.out.println(name + "씨의 나이는 " + i + "세이고"); 
		System.out.println("몸무게는 " + d + "Kg 입니다");   // 저장된 값을 출력
	}
}
