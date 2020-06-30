/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author Cyber Play
 */
public class wavplayer {

    private static AudioClip musik;

    public void mainmusik(String source) {
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.play();

    }

    public void Stopmusik(String source) {
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.stop();
    }

    public static void main(String[] args) {
        wavplayer sik = new wavplayer();
        sik.mainmusik("main.wav");
    }

}
