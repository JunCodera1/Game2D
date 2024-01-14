package main;

import javax.swing.JProgressBar;

public class Monster {
    private GameManager gm;
    public int hpBoss;
    public int hpSlime;
    public int damage;
    public JProgressBar bossHealthBar;

    public Monster(GameManager gm, JProgressBar bossHealthBar) {
        this.gm = gm;
        this.bossHealthBar = bossHealthBar;
        setMonsterStatus();
    }

    public void setMonsterStatus() {
        hpBoss = 150;
        hpSlime = 60;
        damage = 10;
        updateHealthBar();
    }


    public void updateHealthBar() {
        bossHealthBar.setValue(hpBoss);
        gm.ui.messageText.setText("Boss HP: " + hpBoss);
        if(hpBoss == 0) {
        	gm.ui.messageText.setText("");
        }
    }
}
