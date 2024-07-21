package ladder2;

import java.util.List;

public class ResultView2 {

    public void printStringList(List<String> StringList) {
    	System.out.print("     ");
        for (String word : StringList) {
            StringList w = new StringList(word);
            System.out.print(w.getFormattedWord() + " ");
        }
        System.out.println();
    }

    public void printLadder(List<String> ladder) {
        System.out.print("     |");
        for (String line : ladder) {
            System.out.print(line + "|");
        }
        System.out.println();
    }
    
    public void printResult(List<Ladder2> completeLadder, int location, List<String> resultList) {
    	FindResult resultindex = new FindResult(completeLadder, location);
        int idx = resultindex.find();
        System.out.println("실행 결과");
        System.out.println(resultList.get(idx));
    }
}
