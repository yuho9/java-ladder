package ladder1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ladder2.person;


public class Game {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		//참여자 이름 입력 후 쉼표를 기준으로 분리
		System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
		String input = sc.nextLine();
		String[] name = input.split(",");
		
		//참여자 리스트 생성
		List<Person> participant = new ArrayList<>();
		for (String n : name) {
			try {
				participant.add(new Person(n));
				} 
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				return; // 프로그램 종료
			}
		}
		
		//횟수 입력
		System.out.println("최대 사다리 높이는 몇 개인가요?");
		int n;
		try {
            n = sc.nextInt();
         } catch (InputMismatchException e) {
             System.out.println("숫자를 입력해야 합니다.");
             return;	//프로로그램 종료
         }
		  
		sc.close();
	}

}
