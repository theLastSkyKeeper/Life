import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonAgent extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name, agentName, interests, contact, requirements; 
	static int className;
	static JFrame frame = new JFrame();

	public static void main(String[] args)
	    {
			name = JOptionPane.showInputDialog("What is your name?");  
	    	
		Object[] options = {"Yes", "No"};
		className = JOptionPane.showOptionDialog(frame, "Hello, " + name + ". Would you like to add an agent to your list?",
				"Your List",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		 
		
		switch(className)
			{
			case 0:
				{
				agentName = JOptionPane.showInputDialog(frame, "What is the agent's name?");
				interests = JOptionPane.showInputDialog(frame, "What are the agent's interests?");
				contact = JOptionPane.showInputDialog(frame, "What is the agent's contact?");
				requirements = JOptionPane.showInputDialog(frame, "What are the agent's requirements?");
			
				JOptionPane.showMessageDialog(frame, agentName + " is interested in " + interests + ". Their contact is " + contact + " and they are requesting " + requirements + ".");
				className = JOptionPane.showOptionDialog(frame, "Would you like to add another agent to your list?",
						"Your List",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options[1]);
				break;
				
				}
				
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "Okay.");
				break;
				}
			}

	    }
	}
