package ladder2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputView2 {

	Scanner sc = new Scanner(System.in);
	
	public List<String> getParticipantNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");

        String input = sc.nextLine();  
        String[] nameArray = input.split(",");  
        List<String> nameList = new ArrayList<>();
        
        for (String name : nameArray) {
            validateNameLength(name);
            nameList.add(name);
        }

        validateNameListLength(nameList);
        
        return nameList;
    }
	
	public List<String> getResult() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");

        String input = sc.nextLine(); 
        String[] resultArray = input.split(","); 
        List<String> resultList = new ArrayList<>();
        
        for (String result : resultArray) {
            validateNameLength(result);
            resultList.add(result);
        }

        validateNameListLength(resultList);
        
        return resultList;
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다: " + name);
        }
    }
    
    private void validateNameListLength(List<String> nameList) {
        if (nameList.size()<=1) {
            throw new IllegalArgumentException("참여자는 2명 이상이어야 합니다.");
        }
    }
	
	
	
	public int getLadderHeight() {
		System.out.println("최대 사다리 높이는 몇 개인가요?");
		int n=0;
		 try {
             n = sc.nextInt();
             validateLadderHeight(n);
             return n;
         } catch (InputMismatchException e) {
        	 throw new InputMismatchException("숫자를 입력해야 합니다.");
         }
	}
	
	
	
	 private void validateLadderHeight(int height) {
	        if (height <= 0) {
	            throw new IllegalArgumentException("사다리 높이는 1 이상의 정수여야 합니다.");
	        }
	  }
	
}
