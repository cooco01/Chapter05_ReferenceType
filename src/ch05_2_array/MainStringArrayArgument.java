package ch05_2_array;

public class MainStringArrayArgument { 
	public static void main(String[] args) {
		
		// 실행 시 특정 조건에 따른 실행을 명령하고 싶을때
		
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다");
//			System.exit(0);
			return;
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
