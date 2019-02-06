import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Calculator extends javax.swing.JPanel
{
	private static final long serialVersionUID = 1L;
	//private boolean done;
	private JFrame frame;
	/** Creates new form NewJPanel */
	private static String a;
	private static String b;
	private static String c;
	public Calculator(JFrame fr)
	{
		setBackground(Color.WHITE);
		frame = fr;	
		initComponents();
		frame.setSize(1366, 768);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CurrentGrade = new javax.swing.JTextField();
        leave = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        WantGrade = new javax.swing.JTextField();
        worth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Answer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tips = new javax.swing.JTextArea();
        jLabel1.setFont(new Font("Comic Sans MS", 3, 16));
        jLabel2.setFont(new Font("Comic Sans MS", 3, 16));
        jLabel3.setFont(new Font("Comic Sans MS", 3, 16));
        jLabel4.setFont(new Font("Comic Sans MS", 3, 16));
        jLabel5.setFont(new Font("Comic Sans MS", 3, 16));
        calculate.setFont(new Font("Comic Sans MS", 3, 72));
        
        jLabel1.setText("Current Grade in Class:");

        jLabel2.setText("Grade you want to have in Class:");

        jLabel3.setText("Percent your Final Exam Grade is Worth:");

    	CurrentGrade.setText(a);

    	WantGrade.setText(b);

    	worth.setText(c);

        leave.setText("Leave");
        leave.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
            	frame.dispose();
            	//done = true;
            	//done();
                leaveActionPerformed(evt);
            }
        });

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 a = CurrentGrade.getText();
            	 b = WantGrade.getText();
            	 c = worth.getText();
            	if(a.equals("")||b.equals("")||c.equals("")) {
            		Tips.setText("You're forgetting something");
            	} 
            	else {
            	double cg = Double.parseDouble(CurrentGrade.getText());
            	double wg = Double.parseDouble(WantGrade.getText());
            	double ew = Double.parseDouble(worth.getText());
            	cg /= 100;
            	wg /= 100;
            	ew /= 100;
            	//System.out.println(cg + "" + wg + "" + ew);
            	double Ans = (((wg-((1.0-ew)*cg))/ew)*100);
            	Answer.setText(String.format("%.2f",Ans));
            	//System.out.println(Ans);
            	if(Ans<0)
            	{
            		Tips.setText("Error 404");
            	}
            	if(Ans==0)
            	{
            		Tips.setText("Bro...");
            	}
            	if(Ans>10)
            	{
            		Tips.setText("Why are you taking the exam?");
            	}
            	if(Ans>20)
            	{
            		Tips.setText("Either your current grade is a bit too high,\nor the grade you are aiming for is a bit too low. \nEither way, you're good.");
            	}
            	if(Ans>30)
            	{
            		Tips.setText("You'll be fine.");
            	}
            	if(Ans>40)
            	{
            		Tips.setText("Check if you have a typo.");
            	}
            	if(Ans>50)
            	{
            		Tips.setText("Tear the test up as soon as you recieve \nit into little pieces and eat them. \nThen play frisbee with a friend at the other \nside of the room. If anything happpens, \n blame it on the Sherman Anit-trust Act of 1890 \nor the lack of Omega-3 in Hippototamus milk.");
            	}
            	if(Ans>60)
            	{
            		Tips.setText("Rip up the test halfway through \nand ask the teacher for another copy.");
            	}
            	if(Ans>70)
            	{
            		Tips.setText("Do the test in crayon just to see what happens.");
            	}
            	if(Ans>80)
            	{
            		Tips.setText("Do you really care about this class?");
            	}
            	if(Ans>90)
            	{
            		Tips.setText("You should crack open the textbook \ninstead of using AlbertOS.");
            	}
            	if(Ans>100)
            	{
            		Tips.setText("You might want to lower your expectations.");
            	}
            	if(Ans>110)
            	{
            		int temp = (int) (Math.random()*5);
            		if (temp == 0)
            			Tips.setText("McDonald's is always hiring.");
            		else if (temp == 1)
            			Tips.setText("Good Looks>Good Grades");
            		else if (temp == 2)
            			Tips.setText("Just Drop the Class.");
            		else if (temp == 3)
            			Tips.setText("Check if you have a typo.");
            		else if (temp == 4)
            			Tips.setText("C's get degrees. Not jobs but degrees.");
            		else
            			Tips.setText("Be Proud. You set the curve.");
            	}
            	}
                calculateActionPerformed(evt);
            }
        });

        jLabel4.setText("You need this Percent on the Final Exam:");

        jLabel5.setText("Tips from Albert:");

        Tips.setColumns(20);
        Tips.setRows(5);
        jScrollPane1.setViewportView(Tips);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(167)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(CurrentGrade)
        						.addComponent(WantGrade)
        						.addComponent(worth, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(167)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(leave, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(calculate, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE)
        							.addGap(180)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel4)
        										.addComponent(jLabel5))
        									.addGap(18)
        									.addComponent(Answer, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
        								.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE))))))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(36)
        			.addComponent(leave, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addGap(158)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(CurrentGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(WantGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        				.addComponent(worth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(38)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        						.addComponent(Answer, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
        				.addComponent(calculate, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

	private void leaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_leaveActionPerformed
	{//GEN-HEADEREND:event_leaveActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_leaveActionPerformed

	private void calculateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calculateActionPerformed
	{//GEN-HEADEREND:event_calculateActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_calculateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JTextField CurrentGrade;
    private javax.swing.JTextArea Tips;
    private javax.swing.JTextField WantGrade;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leave;
    private javax.swing.JTextField worth;
    // End of variables declaration//GEN-END:variables

	/* public boolean done()
	{
		return done;
	}*/
}