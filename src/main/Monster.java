package main;

import java.util.Random;

public class Monster {
    private GameManager gm;
    public int hpBoss;
    public int hpSlime;
    public int maxDamage;
    Random randomDie = new Random();

    public Monster(GameManager gm) {
        this.gm = gm;

        setMonsterStatus();
    }

    public void setMonsterStatus() {
        hpBoss = 150;
        hpSlime = 60;
        maxDamage = 1;
        updateHealthBar();
    }


    public void updateHealthBar() {
        gm.ui.messageText.setText("Boss HP: " + hpBoss);
    }

	public String getName() {
		return "Boss";
	}

	public int getHealth() {
		return hpBoss;
	}
	
	public void bossCounterAttack() {
	    int bossDamage = randomDie.nextInt(gm.bossMonster.maxDamage) + 1;

	    if (gm.bossMonster.hpBoss > 0 && gm.player.playerLife > 0) {
	        if (gm.player.hasShield == 1 && gm.player.shieldPoint > 0) {
	            gm.player.shieldPoint -= bossDamage;
	        } else {
	            gm.player.playerLife -= bossDamage;
	            gm.player.updatePlayerStatus();
	        }

	        if (gm.player.playerLife <= 0) {
	            gm.sChanger.showGameOverScene(4); // Game over if player's life is 0 or less
	            gm.ui.messageText.setText("Dragon: What a fool.");
	        }
	    }
	}
}
