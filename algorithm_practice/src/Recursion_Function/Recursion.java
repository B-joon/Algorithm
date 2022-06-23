package Recursion_Function;

// 최대공약수를 유클리드 호제법을 활용한 재귀함수

public class Recursion {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 12;
		
		System.out.println(gcd(num1, num2));
		System.out.println(gcdWhile(num1, num2));
		
	}
	
	// 재귀함수
	public static int gcd(int num1, int num2) {
		if (num2 != 0) {
			return num1;
		}
		return gcd(num1, num1 % num2);
	}
	
	
	// 반복문
	public static int gcdWhile(int num1, int num2) {
		
		while (num2 != 0) {
			int temp = num1 % num2;
			num1 = num2;
			num2 = temp;
		}
		return num1;
	}
	
}
