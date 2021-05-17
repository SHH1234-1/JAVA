package chapter2;

 

import java.util.Scanner;

 

public class StringSc {

 

	public static void main(String[] args) {

		

		/*키보드의 입력을 위한 클래스

		Scanner 클래스 

		라이브러리(API)의 클래스를 사용하기 위해서는

		import를 하여야 한다

		import java util.Scanner;

		자동으로 라이브러리 추가하는 방법>?

		ctrl + shift + o (단축기)*/

		

		//Scanner consol창에 입력을 받기 위한 클래스

		//System.in / out 운영체제 System의 입력과 출력을 의미한다

		//문자열을 입력받는 메소드는?

		//next() 공백허용x 

		//nextLine()공백허용 o

		//String test = "12345";

		//char c ='1';

                         //문제
		//문자열 값을 10000 555 3.14값을 입력하고 10000과 555는 정수형으로 변환하고 3.14는 실수형으로 변환한 후 
                        // 10000 + 555의 값과 (10000+555) * 3.14 의 값을 구하시오


		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 값을 입력하시오");

		String str1 = sc.nextLine(); //10000

		System.out.println("두번째 값을 입력하시오");

		String str2 = sc.nextLine(); //555

		System.out.println("세번째 값을 입력하시오");

		String str3 = sc.nextLine(); //3.14

		

		System.out.println("str1 + str2 = " + (Integer.parseInt(str1) + Integer.parseInt(str2)));

		

		System.out.println("(str1 + str2) * str3 " +((Integer.parseInt(str1) + Integer.parseInt(str2)) * Double.parseDouble(str3)));

		

		

 

	}

 

}
