package ladder2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ladder.result;
import ladder1.MakeLadder;
import ladder1.Person;

public class Game2 {

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
		
		//실행 결과 입력 후 쉽표를 기준으로 분리
		System.out.println("실행 결과를 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        input = sc.nextLine();
        String[] result = input.split(",");
        
     // 결과 리스트 생성
        List<Result> resultList = new ArrayList<>();
        for (String r : result) {
            try {
                resultList.add(new Result(r.trim()));
            } catch (IllegalArgumentException e) {
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
		
		// n <=0 일때 오류처리
		if(n<=0) {
			System.out.println("양수를 입력해야 합니다.");
			return;	//프로그램 종료
		}
		 
		//사다리 생성
		String[][] completeLadder = new String[n][];
		MakeLadder ladder = new MakeLadder(participant.size()-1, n);
		
		//이름 출력
		System.out.print("     ");
		for(int i=0;i<participant.size();i++) {
			String space = participant.get(i).spaceSetting();
			System.out.print(participant.get(i).getName() + space + " ");
		}
		System.out.println();

		//사다리 출력
		for(int i=0;i<n;i++) {
			completeLadder[i] = ladder.combination();
			System.out.println(ladder.showWeight());
		}
		
		
		
		sc.close();

	}

}
