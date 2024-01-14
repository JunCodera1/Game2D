package main;

import java.net.URL;

import javax.swing.JProgressBar;

import Event.Event01;
import Event.Event02;
import Event.Event3;
import Event.Event4;

public class GameManager {
    ActionHandler aHandler = new ActionHandler(this);
    public UI ui = new UI(this);
    public Player player = new Player(this);
    public SceneChanger sChanger = new SceneChanger(this);
    JProgressBar bossHealthBar = new JProgressBar();
	public GameManager gameManager;
    public Monster bossMonster = new Monster(this, bossHealthBar);
    Music music = new Music();
    SE se  = new SE();

    public Event01 ev1 = new Event01(this);
    public Event02 ev2 = new Event02(this);
    public Event3 ev3 = new Event3(this);
    public Event4 ev4 = new Event4(this);
    public Event6 ev6 = new Event6(this);
    
    
    public URL fieldMusic1 = getClass().getClassLoader().getResource("audio//bensound-paperplane.mp3");
    public URL fieldMusic2 = getClass().getClassLoader().getResource("audio//bensound-fiddlesticks.mp3");
    public URL fieldMusic3 = getClass().getClassLoader().getResource("audio//bensound-maxthegeese.mp3");
    public URL fieldMusic4 = getClass().getClassLoader().getResource("audio//bensound-cutesttoys.mp3");
    public URL fieldMusic5 = getClass().getClassLoader().getResource("audio//bensound-clevergirl.mp3");
    public URL fieldMusic6 = getClass().getClassLoader().getResource("audio//bensound-jauntywalk.mp3");

    
    public URL deathSound = getClass().getClassLoader().getResource("audio//dragonMinHP.mp3");
    public URL hitSound = getClass().getClassLoader().getResource("audio//dragonLostHP.mp3");
    public URL healSound = getClass().getClassLoader().getResource("audio//heal.mp3");
    public URL itemSound = getClass().getClassLoader().getResource("audio//FindWeapon.mp3");
    public URL enterSound = getClass().getClassLoader().getResource("audio//cavesound.mp3");
    public URL dragon_01 = getClass().getClassLoader().getResource("audio//talkDragon.mp3");
    public URL dragon_02 = getClass().getClassLoader().getResource("audio//");
    public URL dragon_03 = getClass().getClassLoader().getResource("audio//GoodKitty.mp3");
    public URL dragon_04 = getClass().getClassLoader().getResource("audio//");
    public URL cat_01 = getClass().getClassLoader().getResource("");
    public URL cat_02 = getClass().getClassLoader().getResource("");
    public URL cat_03 = getClass().getClassLoader().getResource("");
    public URL currentMusic;

    public static void main(String[] args) {       
        new GameManager();
    }

    public GameManager() {
   
        player.setPlayerDefaultStatus();
        sChanger.showScene1();
    }

    
}
