package ladder1;

import java.util.List;

public class Game {

	public static void main(String[] args) {
		
		 InputView inputView = new InputView();
		 ResultView resultView = new ResultView();
		 
		 List<String> participantNames = inputView.getParticipantNames();
		 
		 int ladderHeight = inputView.getLadderHeight();
		 
		 resultView.printParticipants(participantNames);
	}

}
