package main;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;

public class Music {

    private Clip clip;

    public void setFile(URL fileURL) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        AudioInputStream sound = AudioSystem.getAudioInputStream(fileURL);
        clip = AudioSystem.getClip();
        clip.open(sound);
    }

    public void play() {
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public void loop() {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public void stop() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    public void close() {
        if (clip != null) {
            clip.close();
        }
    }

    public void addCompletionListener(CompletionListener listener) {
        if (clip != null) {
            clip.addLineListener(listener);
        }
    }

    public void setVolume(float volume) {
        if (clip != null) {
            if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl.setValue(volume);
            }
        }
    }

    public float getVolume() {
        if (clip != null && clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            return gainControl.getValue();
        }
        return 0.0f;
    }

    public interface CompletionListener extends LineListener {
        void onComplete();
    }
}
