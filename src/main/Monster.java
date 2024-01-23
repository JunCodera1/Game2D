package main;

import java.awt.Component;
import java.util.Random;

import javax.swing.JLabel;

public class Monster {
    private GameManager gm;
    public int hpBoss;
    public int hpSlime;
    public int maxDamage;
    public int slimeDamage;
    Random randomDie = new Random();

    public Monster(GameManager gm) {
        this.gm = gm;

        setMonsterStatus();
    }
    

    public void setMonsterStatus() {
        hpBoss = 165;
        hpSlime = 60;
        maxDamage = 3;
        slimeDamage = 2;
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
	public void hideMonsterImage(int bgNum, String monsterURL) {
        for (Component component : gm.ui.bgPanel[bgNum].getComponents()) {
            if (component instanceof JLabel) {
                JLabel label = (JLabel) component;
                if (label.getIcon() != null && label.getIcon().toString().contains(monsterURL)) {
                    label.setIcon(null);  
                }
            }
        }
        gm.ui.bgPanel[bgNum].repaint(); 
    }
	
	public void bossCounterAttack(int currentNum) {
	    int bossDamage = randomDie.nextInt(gm.bossMonster.maxDamage);

	    if (gm.bossMonster.hpBoss > 0 && gm.player.conSongKhong()) {
	        if (gm.player.hasShield == 1 && gm.player.shieldPoint > 0 && gm.player.hasShield > 0) {
	            gm.player.shieldPoint -= bossDamage*2 + 1;
	        }
	        else {
	        	if(gm.player.hasShield > 0) {
	        	gm.ui.messageText.setText("The shield was broken..");
	            gm.player.anHanh(currentNum, bossDamage);
	            gm.player.updatePlayerStatus();
	        	}
	        	else {
	        		gm.player.shieldPoint = 0;
	        		gm.player.anHanh(currentNum, bossDamage);
	        		gm.player.updatePlayerStatus();
	        	}
	        }
	    }
	}
}
