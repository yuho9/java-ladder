package ladder2;

import java.util.ArrayList;
import java.util.List;

public class Game2 {

    public static void main(String[] args) {
        
        InputView2 inputView = new InputView2();
        ResultView2 resultView = new ResultView2();
        
        List<String> participantNames;
        List<String> resultList;
        int ladderHeight;

        try {
            participantNames = inputView.getParticipantNames();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return; // 오류 발생 시 프로그램을 종료
        }
        
        try {
        	resultList = inputView.getResult();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return; // 오류 발생 시 프로그램을 종료
        }
        
        try {
        	ladderHeight = inputView.getLadderHeight();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return; // 오류 발생 시 프로그램을 종료
        }
        
        resultView.printParticipants(participantNames);
        
        List<Ladder2> completeLadder = new ArrayList<>();
        for (int i = 0; i < ladderHeight; i++) {
            Ladder2 l = new Ladder2(participantNames.size(), ladderHeight);
            l.makeLadder();
            completeLadder.add(l);
        }
        
        for (Ladder2 l : completeLadder) {
            resultView.printLadder(l.getLadder());
        }
    }
}

