package ladder1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeLadder {
	
	private int weight;
    private int height;
    private String[] ladderArr;
    private String[][] completeladder;

    public MakeLadder(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.completeladder = new String[height][weight];
    }

    public void randomLadder(String[] arr, int idx) {
        Random random = new Random();
        if (arr[idx - 1].equals("0")) {
            int num = random.nextInt(2);
            changeString(arr, idx, num);
        }
        if (arr[idx - 1].equals("1")) {
            changeString(arr, idx, 0);
        }
    }

    public void changeString(String[] arr, int idx, int num) {
        if (num == 0) {
            arr[idx] = "0";
        }
        if (num == 1) {
            arr[idx] = "1";
        }
    }

    public String[] combination() {
        ladderArr = new String[weight];
        Random random = new Random();
        int rd = random.nextInt(2);
        changeString(ladderArr, 0, rd);
        for (int i = 1; i < weight; i++) {
            randomLadder(ladderArr, i);
        }

        return ladderArr;
    }

    public void complete(int step) {
        completeladder[step] = combination();
    }

    public void change(int n) {
        if (ladderArr[n].equals("0")) {
            ladderArr[n] = "     ";
        }
        if (ladderArr[n].equals("1")) {
            ladderArr[n] = "-----";
        }
    }

    public String showWeight() {
        String result = "     |";
        for (int i = 0; i < weight; i++) {
            change(i);
            result += ladderArr[i] + "|";
        }
        return result;
    }
}
