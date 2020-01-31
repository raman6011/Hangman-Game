//package game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener
{
	JLabel name;
	JButton option1;
	JButton option2;
	JButton option3;

	public Menu()
	{
		name = new JLabel("HANGMAN GAME");
		option1 = new JButton("Play Game");
		option2 = new JButton("Instructions");
		option3 = new JButton("Exit");

		name.setFont(new Font("serif", Font.BOLD, 24) );
		setTitle("Hangman Game");
		setSize(300,200);
		setVisible(true);

		option1.addActionListener(this);
		option2.addActionListener(this);
		option3.addActionListener(this);
	}
	
	public void addComponent()
	{
		setLayout(new GridBagLayout() );
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		c.weighty = 0.1;
		c.anchor = c.CENTER;
		add(name,c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = c.HORIZONTAL;
		add(option1,c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.fill = c.HORIZONTAL;
		add(option2,c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.fill = c.HORIZONTAL;
		add(option3,c);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == option1)
		{
			GameWindow obj = new GameWindow();
			obj.startGame();
		}
		else if(e.getSource() == option2)
		{
			JOptionPane.showMessageDialog(this, "1. You can guess the word by clicking the character from the virtual keypad. \n2. You can select a maximum of 5 incorrect letters. \n3. The incorrect guess will be highlighted with red color, and the correct one will be highlighted with green color.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getSource() == option3)
		{
			System.exit(0);
		}
	}
}