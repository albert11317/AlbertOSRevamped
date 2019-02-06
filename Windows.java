import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Windows extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	private Image backGround;
	private Image logOffIcon;
	private Image shutDownIcon;
	private Image paintIcon;
	private Image notepadIcon;
	private Image calculatorIcon;
	private Image reversi;
	private int width;
	private int height;
	private JFrame fr;
	private Notepad n;
	private Paint p;
	private Calculator c;
	private Othello o;
	public Notification nw;
	private LeaveAnimation leave;
    public boolean hasQuit = false;
	//private LogIn login;
	private boolean hasLogOff;

	// private boolean starts;

	public Windows(int w, int h, JFrame f) {
		super.setOpaque(true);
		super.setPreferredSize(new Dimension(w, h));
		super.setBackground(Color.BLACK);
		super.addMouseListener(this);
		width = w;
		height = h;
		fr = f;
		// starts = true;
		backGround = Toolkit.getDefaultToolkit().getImage(
				super.getClass().getResource("bioshock-wallpaper-2.png"));
		logOffIcon = Toolkit.getDefaultToolkit().getImage(
				super.getClass().getResource("LogOff.png"));
		shutDownIcon = Toolkit.getDefaultToolkit().getImage(
				super.getClass().getResource("Shutdown.png"));
		paintIcon = Toolkit.getDefaultToolkit().getImage(
				super.getClass().getResource("paint.png"));
		notepadIcon = Toolkit.getDefaultToolkit().getImage(
				super.getClass().getResource("notepad.png"));
		calculatorIcon = Toolkit.getDefaultToolkit().getImage(
				super.getClass().getResource("calculator.png"));
		reversi = Toolkit.getDefaultToolkit().getImage(
				super.getClass().getResource("Reversi.png"));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// if (starts)
		{
			g.drawImage(backGround, 0, 0, width, height, this); // I'm trying to make them all match up, but this guy is being a dick
			 g.drawImage(shutDownIcon, 1110, 0, 200, 200, this);
			 g.drawImage(logOffIcon, 1110, 250, 200, 200, this);
			    g.drawImage(reversi, 1110, 500, 200, 200, this);
			     g.drawImage(notepadIcon, 0, 0, 200, 200, this);
			     g.drawImage(paintIcon, 0, 250, 200, 200, this);
			g.drawImage(calculatorIcon, 0, 500, 200, 200, this);
			// ImageObserver observer = null;
			// System.out.println(backGround.getHeight(observer));
			// starts = false;
		}
		
	/*	if (shutdown || logoff)
		{
			g.setColor(Color.yellow);
			g.fillRect(0, 0, width, height);
		}*/
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getX() >= 1110 && e.getX() <= 1310 && e.getY() >= 0 && e.getY() <= 200)
		{
			// System.out.println("Shutdown sequence activated");
			// Shutdown
			JFrame frame = new JFrame("AlbertOS REVAMPED");
			nw = new Notification(342, 192, 384, 683, true, frame);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(nw, BorderLayout.CENTER);
			nw.Yes.addMouseListener(new MouseListener() {
				private int i = 0;
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					if (i==2) {
						OperatingSystem.start.login.animation.windows.hasQuit=true;
					} else {
						i++;
					}
				}});
			frame.pack();
			frame.setVisible(true);
		}
		if (e.getX() >= 1110 && e.getX() <= 1310 && e.getY() >= 250 && e.getY() <= 450)
		{
			// LOGOFF, bitch
			// System.out.println("Logoff sequence activated");
			// fr.remove(this);
			// repaint();
			JFrame frame = new JFrame("AlbertOS");
			nw = new Notification(342, 192, 384, 683, false, frame);
			nw.Yes.addMouseListener(new MouseListener() {
				private int i = 0;
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					if (i==2) {
						//System.out.println("test");
						OperatingSystem.start.login.animation.windows.hasLogOff = true;
						OperatingSystem.start.login.animation.windows.hasQuit = true;
					} else {
						i++;
					}
				}
			});
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(nw, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);
			/*	fr.remove(this);
				login = new LogIn(width, height, fr);
				fr.add(login);
				fr.pack();
				fr.revalidate();
				login.start();*/
				//fr.dispose();
		    
			// draw dialog box making sure it is ok to log off
		}
		if (e.getX() >= 1110 && e.getX() <= 1310 && e.getY() >= 500 && e.getY() <= 700)
		{
			// START MOTHERFUCKING REVERSI BITCHES!!?!?!?!?!
			// System.out.println("Othello sequence activated");
			JFrame frame = new JFrame("Othello (Reversi)");
			o = new Othello(1366, 768, frame);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(o, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);
			// o.newGame();
		}
		if (e.getX() >= 0 && e.getX() <= 250 && e.getY() >= 0 && e.getY() <= 200)
		{
			// run notepad
			// System.out.println("Notepad sequence activated");
			JFrame frame = new JFrame("Notepad");
			n = new Notepad(frame);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(n, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);
		}
		if (e.getX() >= 0 && e.getX() <= 250 && e.getY() >= 250 && e.getY() <= 450)
		{
			// run paint
			// System.out.println("Paint sequence activated");
			// fr.remove(this);
			JFrame frame = new JFrame("Paint");
			p = new Paint(frame);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(p, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);
		}
		if (e.getX() >= 0 && e.getX() <= 250 && e.getY() >= 500 && e.getY() <= 700)
		{
			// run calculator
			// System.out.println("Calculator sequence activated");
			JFrame frame = new JFrame("Calculator");
			c = new Calculator(frame);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(c, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);
			// System.out.println("Starting Calculator");
		}
	}
	
	/*public void leaveAnimation()
	{
		fr.remove(this);
		leave = new LeaveAnimation(1366, 768, true, fr);
		fr.add(leave);
		fr.pack();
		fr.revalidate();
		leave.start();
	}
	*/
	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	public void start() {
		while (!hasQuit) {
			repaint();
		}
		if (hasLogOff) {
			super.removeMouseListener(this);
			nw.frame.setVisible(false);
			fr.remove(this);
			LogIn li = new LogIn(1366, 768, fr);
			OperatingSystem.start.login = li;
			fr.add(li);
			fr.pack();
			fr.revalidate();
			li.start();
		} else {
			super.removeMouseListener(this);
			nw.frame.setVisible(false);
			leave = new LeaveAnimation(1366, 768, true, fr);
			fr.remove(this);
			fr.add(leave);
			fr.pack();
			fr.revalidate();
			leave.start();
		}
	}
	
	public void moveToScreen(Component com) {
		fr.remove(this);
		fr.add(com);
	}
}