package kadai_026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter26 {
    private static final String ROCK = "r";     // グー
    private static final String SCISSORS = "s"; // チョキ
    private static final String PAPER = "p";    // パー
    
    // Scannerをクラス全体で使用する
    private Scanner scanner = new Scanner(System.in);

    // 自分のじゃんけんの手を入力する
    public String getMyChoice() {
        String choice;
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            choice = scanner.nextLine().toLowerCase();

            if (choice.equals(ROCK) || choice.equals(SCISSORS) || choice.equals(PAPER)) {
                break;
            } else {
                System.out.println("正しいじゃんけんの手を入力してください。");
            }
        }
        // scanner.close()は呼ばない
        return choice;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {
        String[] choices = {ROCK, SCISSORS, PAPER};
        int randomIndex = (int) Math.floor(Math.random() * 3);
        return choices[randomIndex];
    }

    // じゃんけんを行う
    public void playGame() {
        Map<String, String> hands = new HashMap<>();
        hands.put(ROCK, "グー");
        hands.put(SCISSORS, "チョキ");
        hands.put(PAPER, "パー");

        String myChoice = getMyChoice();
        String opponentChoice = getRandom();

        System.out.println("自分の手は" + hands.get(myChoice) + ", 対戦相手の手は" + hands.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals(ROCK) && opponentChoice.equals(SCISSORS)) ||
            (myChoice.equals(SCISSORS) && opponentChoice.equals(PAPER)) ||
            (myChoice.equals(PAPER) && opponentChoice.equals(ROCK))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}