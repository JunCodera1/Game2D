package main;

import java.util.Scanner;

public class BattleManager {
    private GameManager gm;

    public BattleManager(GameManager gm) {
        this.gm = gm;
    }

    public void luot() {
        final int MAX_ROUNDS = 5;

        Scanner scanner = new Scanner(System.in);

        Player player = new Player(gm);
        Monster boss = new Monster(gm);

        for (int round = 1; round <= MAX_ROUNDS; round++) {
            gm.ui.messageText.setText("\nRound " + round);

            takeTurn(player, scanner);
            takeTurn(boss);
        }

        try {
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void takeTurn(Player player, Scanner scanner) {

    }

    private void takeTurn(Monster monster) {
        
    }
}
