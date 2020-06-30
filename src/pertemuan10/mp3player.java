/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Cyber Play
 */
class musik extends Thread {

    public static void main(String[] args) throws JavaLayerException {
        try {
            FileInputStream fileInputStream = new FileInputStream("F://a.mp3");
            Player player = new Player(fileInputStream);
            System.out.println("song is playing");
            player.play();
      } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
