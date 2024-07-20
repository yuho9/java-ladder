package ladder1;

import java.util.List;

public class ResultView {

	public void printParticipants(List<String> participant) {
		for(String person : participant) {
			Person p = new Person(person);
			System.out.print(p.getFormattedName() + " ");
		}
       
    }
}
