package ladder1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Game {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		//참여자 이름 입력 후 쉼표를 기준으로 분리
		System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
		String input = sc.nextLine();
		String[] name = input.split(",");
		
		sc.close();
	}

}
