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
}
