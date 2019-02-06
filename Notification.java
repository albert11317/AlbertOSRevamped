import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
public class Notification extends javax.swing.JPanel
{
	private static final long serialVersionUID = 1L;
	public JButton Yes;
	private String text;
	private boolean check1 = false;
	private boolean check2 = true;
	public JFrame frame;
	
	public Notification(int x, int y, int height, int width, boolean shutdown, JFrame fr)
	{
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame = fr;
		setPreferredSize(new Dimension(736, 384));
        setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		if (shutdown)
		{
			text = "Shutdown";
		}
		else if (!shutdown)
		{
			text = "Log Off";
		}
		Yes = new JButton("Ye");
		Yes.setHorizontalTextPosition(SwingConstants.CENTER);
		Yes.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 72));
		Yes.setIconTextGap(75);
		Yes.setAlignmentY(0.0f);
		Yes.setBounds(0, 207, 475, 177);
		Yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!check1)
				{
					Yes.setText("Yeeee");
					check1 = true;
					check2 = false;
				}
				else if(!check2)
				{
					Yes.setText(text);
					check2 = true;
				}
				else if ((!check1)&&(!check2))
				{
					frame.dispose();
				}
			}
		});
		setLayout(null);
		add(Yes);
		
		JButton No = new JButton("Nope");
		No.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		No.setActionCommand("No");
		No.setIconTextGap(75);
		No.setHorizontalTextPosition(SwingConstants.CENTER);
		No.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 72));
		No.setAlignmentY(0.0f);
		No.setBounds(471, 207, 266, 177);
		add(No);
		
		JLabel JLabel1 = new JLabel("Are you sure you want to " + text + "?");
		JLabel1.setVerticalAlignment(SwingConstants.TOP);
		JLabel1.setFont(new Font("Algerian", Font.PLAIN, 36));
		JLabel1.setBounds(10, 47, 701, 48);
		add(JLabel1);
		
		JLabel JLabel2 = new JLabel("Doing so will delete all saved data!");
		JLabel2.setVerticalAlignment(SwingConstants.TOP);
		JLabel2.setFont(new Font("Algerian", Font.PLAIN, 36));
		JLabel2.setBounds(10, 95, 716, 48);
		add(JLabel2);
		initComponents();
	}
	
  private void initComponents() {
    }
}