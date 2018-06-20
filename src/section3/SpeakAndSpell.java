package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		
		String[] words = new String[6];
		
		words[0] = "conscience";
		words[1] = "handkerchief";
		words[2] = "Caribbean";
		words[3] = "deductible";
		words[4] = "weird";
		words[5] = "rhythm";
		
		speak("Welcome to Lucas's spelling test!");
		 
		
	for (int i = 0; i < words.length; i++)	{
		speak("Spell " + words[i]);
		// 2. Catch the user's answer in a String
		String a = JOptionPane.showInputDialog("Spell it");
		// 3. If the user spelled the word correctly, speak "correct"
if (a.equalsIgnoreCase(words[i])) {
	
	speak("correct");
}
		// 4. Otherwise say "wrong"
else {	speak("wrong");

}
}
	
	speak("Thanks for playing!");
	
	
	}
		// 5. repeat the process for other words
		
	

	 static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


