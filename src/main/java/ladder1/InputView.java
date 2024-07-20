package ladder1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

	Scanner sc = new Scanner(System.in);
	
	public List<String> getParticipantNames(){
		System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
		String input = sc.next();
        String[] nameArray = input.split(",");
        List<String> nameList = new ArrayList<>();
        for (String name : nameArray) {
            nameList.add(name);
        }
        return nameList;
	}
}
