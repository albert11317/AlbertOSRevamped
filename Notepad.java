import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.awt.Rectangle;

public class Notepad extends javax.swing.JPanel
{
	private static final long serialVersionUID = 1L;
	public static String note;
	private JFrame frame;
	
	/** Creates new form NewJPanel */
	public Notepad(JFrame f)
	{
		frame = f;
		initComponents();
		frame.setSize(1366, 768);
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        leaveButton = new javax.swing.JButton();

        jTextArea1.setSize(1366, 700);
        jTextArea1.setText(note);
        jScrollPane1.setViewportView(jTextArea1);

        leaveButton.setText("Leave");
        leaveButton.setActionCommand("leave");
        leaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButtonActionPerformed(evt);
            }
        });
        
        savebutton = new JButton();
        savebutton.setAction(action);
        savebutton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		saveButtonActionPerformed(e);
        	}
        });
        savebutton.setText("Save");
        savebutton.setActionCommand("save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(22, Short.MAX_VALUE)
        			.addComponent(savebutton, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(leaveButton, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(leaveButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(savebutton))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 729, GroupLayout.PREFERRED_SIZE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

	private void leaveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_leaveButtonActionPerformed
	{//GEN-HEADEREND:event_leaveButtonActionPerformed
		// TODO add your handling code here:
    	frame.dispose();
    	note = jTextArea1.getText();
	}//GEN-LAST:event_leaveButtonActionPerformed
	private void saveButtonActionPerformed(java.awt.event.ActionEvent e){
		note = jTextArea1.getText();
		Date now = new Date();
		String Now = now.toString().replaceAll("\\s+","");
		String rightnow = Now.replaceAll(":","");
		try(  PrintWriter out = new PrintWriter(rightnow +".txt")  ){
		    out.print(note);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton leaveButton;
    private JButton savebutton;
    private final Action action = new SwingAction();
    // End of variables declaration//GEN-END:variables

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}