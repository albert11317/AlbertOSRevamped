import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class LogInAnimation extends JPanel{

	private static final long serialVersionUID = 1L;
	private boolean playMusic = false;
	private String UserName = "";
	private AudioInputStream firstTone;
	private Clip music;
	private int i = 0;
	private int width;
	private int height;
	private JFrame fr;
	public Windows windows;
	
	// Constructor
	public LogInAnimation(int w, int h, String userName, JFrame f)
	{
		UserName = userName;
		super.setOpaque(true);
		super.setBackground(Color.BLACK);
		super.setPreferredSize(new Dimension(w, h));
		width = w;
		height = h;
		fr = f;
	}
	
	public void start()
	{
		for (i = 0; i<300; i+=2) //initial i = 0
		{
			repaint();
			try
			{
				Thread.sleep(25);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		//System.out.print("Windows about to start...");
		fr.remove(this);
		windows = new Windows(width, height, fr);
		fr.add(windows);
		fr.pack();
		fr.revalidate();
		windows.start();
	}

	// Perform any custom painting (if necessary) in this method
	@Override
	public void paintComponent(Graphics g)
	{
		//System.out.append("asfdg");
		String Line1 ="Welcome " + UserName + "...";
		g.setColor(Color.black);
		g.fillRect(0,0, width, height);
		g.setColor(Color.white);

		if (i == 0)
		{
				playMusic = true;
		}
		if (i>0&&i<10)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 550, 350);
		}
		if (i == 10)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);
		}
		if (i>10&&i<20)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 256);
			g.setFont(StartFont);
			g.drawString(Line1, 0, 350);
		}
		if (i == 20)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);
		}
		if (i>20&&i<30)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 550, 350);
		}
		if (i == 30)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);
		}		
		if (i>30&&i<40)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 256);
			g.setFont(StartFont);
			g.drawString(Line1, 550, 350);
		}
		if (i == 40)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);
		}
		if (i>50&&i<70)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 256);
			g.setFont(StartFont);
			g.drawString(Line1, 0, 350);
		}
		if (i == 70)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);
		}		
		if (i>80&&i<90)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 550, 350);
		}
		if (i == 90)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);
		}
		if (i>90&&i<100)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 256);
			g.setFont(StartFont);
			g.drawString(Line1, 0, 350);
		}		
		if (i>100&&i<110)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 550, 350);
		}
		if (i == 110)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);
		}
		if (i>110&&i<120)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 256);
			g.setFont(StartFont);
			g.drawString(Line1, 0, 350);
		}		
		if (i>120&&i<130)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 550, 350);
		}
		if (i == 130)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);
		}
		if (i>140&&i<150)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 256);
			g.setFont(StartFont);
			g.drawString(Line1, 0, 600);
		}		
		if (i>160&&i<170)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 750, 350);
		}
		if (i>180&&i<190)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 550, 350);
		}
		if (i == 190)
		{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);
		}
		if (i>190&&i<200)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 256);
			g.setFont(StartFont);
			g.drawString(Line1, 0, 350);
		}		
		if (i>200&&i<300)
		{
			g.setColor(Color.WHITE);
			Font StartFont = new Font("Edwardian Script ITC", Font.PLAIN, 48);
			g.setFont(StartFont);
			g.drawString(Line1, 550, 350);
		}
		//---------------------------------------MUSIC---------------------------------------//
		if (playMusic==true)
		{
			playMusic=false;
		try {
			music = AudioSystem.getClip();
			firstTone = AudioSystem.getAudioInputStream(getClass().getResource("Airhorn.wav"));
			music.open(firstTone);
			music.start();
			}
			catch (LineUnavailableException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (UnsupportedAudioFileException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}