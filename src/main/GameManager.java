package main;

import java.net.URL;

import Event.Event01;
import Event.Event02;
import Event.Event3;
import Event.Event4;
import Event.Event5;
import Event.Event6;

public class GameManager {
	
    ActionHandler aHandler = new ActionHandler(this);
    public UI ui = new UI(this);
    public Player player = new Player(this);
    public SceneChanger sChanger = new SceneChanger(this);
	public GameManager gameManager;
    public Monster bossMonster = new Monster(this);
    Music music = new Music();
    SE se  = new SE();

    public Event01 ev1 = new Event01(this);
    public Event02 ev2 = new Event02(this);
    public Event3 ev3 = new Event3(this);
    public Event4 ev4 = new Event4(this);
    public Event5 ev5 = new Event5(this);
    public Event6 ev6 = new Event6(this);
    
    
    public URL fieldMusic1 = getClass().getClassLoader().getResource("audio/fieldSound1.wav");
    public URL fieldMusic2 = getClass().getClassLoader().getResource("audio/fieldSound2.wav");
    public URL fieldMusic3 = getClass().getClassLoader().getResource("audio/fieldSound3.wav");
    public URL fieldMusic4 = getClass().getClassLoader().getResource("audio/fieldSound4.wav");
    public URL fieldMusic5 = getClass().getClassLoader().getResource("audio/fieldSound5.wav");
    public URL fieldMusic6 = getClass().getClassLoader().getResource("audio/fieldSound6.wav");
    public URL bossMusic = getClass().getClassLoader().getResource("audio/Boss1.wav");
    public URL victoryMusic = getClass().getClassLoader().getResource("audio/victorySound.wav");

    public URL findGrass = getClass().getClassLoader().getResource("audio//findGrass.wav");
    public URL gameOver = getClass().getClassLoader().getResource("audio//GameOver.wav");
    public URL hitSound = getClass().getClassLoader().getResource("audio//hitSound.wav");
    public URL healSound = getClass().getClassLoader().getResource("audio//healSound.wav");
    public URL itemSound = getClass().getClassLoader().getResource("audio//FindWeapon.wav");
    public URL enterSound = getClass().getClassLoader().getResource("audio//enterSound.wav");
    
    public URL dragon_01 = getClass().getClassLoader().getResource("audio//talkDragon.wav");
    public URL dragon_02 = getClass().getClassLoader().getResource("audio//dragonLostHP.wav");
    public URL dragon_03 = getClass().getClassLoader().getResource("audio//GoodKitty.wav");
    public URL dragon_04 = getClass().getClassLoader().getResource("audio//dragon4.wav");
    
    public URL cat_01 = getClass().getClassLoader().getResource("");
    public URL cat_02 = getClass().getClassLoader().getResource("");
    public URL cat_03 = getClass().getClassLoader().getResource("");
    public URL currentMusic;

    public static void main(String[] args) { 
     
        new GameManager();
    }

    public GameManager() {
        try {
    	currentMusic = fieldMusic1;
    	playMusic(currentMusic);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        player.setPlayerDefaultStatus();
        sChanger.showScene1();
    }
    
    public void playSE(URL url) {
    	
    	se.setFile(url);
    	se.play(url);
    }
    
    public void playMusic(URL url) {
    	
    	music.setFile(url);
    	music.play(url);
    	music.loop(url);
    }
    
    public void stopMusic(URL url) {
    	
    	music.stop(url);
    }
}
