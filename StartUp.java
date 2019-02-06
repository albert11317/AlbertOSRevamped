import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.awt.Image;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class StartUp extends JPanel {

	private static final long serialVersionUID = 1L;
	private boolean playMusic = false;
	private AudioInputStream firstTone;
	private Clip music;
	private int i = 0;
	private Image backGround;
	public LogIn login;
	public JFrame fr;
	private int height;
	private int width;

	// Constructor
	public StartUp(int w, int h, JFrame f) {
		super.setOpaque(true);
		super.setPreferredSize(new Dimension(w, h));
		super.setBackground(Color.BLACK);
		fr = f;
		width = w;
		height = h;
	}

	public void start() {
		for (i = 0; i <= 2000; i+=2) // initial i = 0
		{
			//System.out.println(i);
			repaint();
			try {
				Thread.sleep(25); // should be 25
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		fr.remove(this);
		login = new LogIn(width, height, fr);
		fr.add(login);
		fr.pack();
		fr.revalidate();
		login.start();
	}

	// Perform any custom painting (if necessary) in this method
	@Override
	public void paintComponent(Graphics g) {
		//System.out.println(i);
		String Line1 = "Welcome Friends...";
		String Line2 = "...To the Future";
		String Line3 = "AlbertOS";
		String Line4 = "Loading...";
		String Line5 = "Done Loading. With Quality.";

		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.white);
		if (i == 100) {
			playMusic = true;
		}
		if (i > 0 && i < 255) {
			g.setColor(new Color(i, i, i));
			Font StartFont = new Font("Edwardian Script ITC", Font.ITALIC, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 200 + (i), 200);
		}
		
		if (i > 255 && i < 510) {
			//System.out.println(i);
			g.setColor(new Color(255 - (i - 255), 255 - (i - 255),255 - (i - 255)));
			Font StartFont = new Font("Edwardian Script ITC", Font.ITALIC, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 200 + (i), 200);
		}
		
		if (i > 510 && i < 765) {
			g.setColor(new Color((i - 510), (i - 510), (i - 510)));
			Font StartFont = new Font("Edwardian Script ITC", Font.ITALIC, 48);
			g.setFont(StartFont);
			g.drawString(Line2, 1300 - (i), 500);
		}
		
		if (i > 765 && i < 990) {
			g.setColor(new Color(255 - (i - 765), 255 - (i - 765), 255 - (i - 765)));
			Font StartFont = new Font("Edwardian Script ITC", Font.ITALIC, 48);
			g.setFont(StartFont);
			g.drawString(Line2, 1300 - (i), 500);
		}
		
		if (i > 1050 && i < 2000) {
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Comic Sans MS", Font.PLAIN, 180);
			g.setFont(StartFont);
			g.drawString(Line3, 250, 400);
		}
		
		if (i > 1500 && i < 1755) {
			g.setColor(new Color((i - 1500), (i - 1500), (i - 1500)));
			Font StartFont = new Font("Algerian", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line4, 600, 600);
		}
		
		if (i > 1755 && i < 1900) {
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Algerian", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line4, 600, 600);
		}

		if (i > 1901 && i < 2000) {
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Comic Sans MS", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line5, 300, 500);
		}
		
		if (i == 2000) {
			music.stop();
			music.close();
		}


		// ---------------------------------------MUSIC---------------------------------------//

		if (playMusic == true) {
			playMusic = false;
			try {
				// System.out.println("help");
				music = AudioSystem.getClip();
				firstTone = AudioSystem.getAudioInputStream(getClass()
						.getResource("John_Cena.wav"));
				music.open(firstTone);
				music.start();
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}