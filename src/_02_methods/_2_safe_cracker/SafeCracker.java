//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _02_methods._2_safe_cracker;

import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SafeCracker {

	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;
	
	
	public static void main(String[] args) {
		new SafeCracker().crackTheSafe();
	}

	void crackTheSafe() {
		/*
		 * Your mission: use the tryCode method to crack the safe by trying all possible
		 * combinations
		 */		

	}

	 void tryCode(int guess) {
		System.out.println("trying " + guess);

		int secretCode = 9999999 - wekncrzpasfdkjhcfjse;

		if (guess == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			System.exit(0);
		}
	}

	private void playTheSoundOfSuccess() {
		
		String path = "src/_02_methods/_2_safe_cracker/";
		if (canPlaySounds) {	
			File sound = new File(path+"me-gusta.wav");
			if (sound.exists()) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}
		}
	}

	final int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
}
