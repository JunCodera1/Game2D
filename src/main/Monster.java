package main;


public class Monster {
    private GameManager gm;
    public int hpBoss;
    public int hpSlime;
    public int monsterAttack;
	public int monsterDefense;


    public Monster(GameManager gm) {
        this.gm = gm;

        setMonsterStatus();
    }

    public void setMonsterStatus() {
        hpBoss = 150;
        hpSlime = 60;
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
}
