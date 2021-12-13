import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NumbersLogin implements ActionListener {
	JPanel SecondW1 = new JPanel();
	Icon icon1 = new ImageIcon(this.getClass().getResource("/cute (2).gif"));
	JLabel x2 = new JLabel();
	JButton startn = new JButton("START");
	JButton conceptn = new JButton("CONCEPT");
	JButton exitn = new JButton("EXIT");
	JFrame fen1 = new JFrame();
	public NumbersLogin () {
	JFrame fen1 = new JFrame();
	fen1.setTitle("THE GAME OF NUMBERS ");
	fen1.setSize(1000,870);
	fen1.setLocationRelativeTo(null);
	x2  = new JLabel(icon1);
	SecondW1.add(x2);
	SecondW1.add(startn);
	SecondW1.add(conceptn);
	SecondW1.add(exitn);
	x2.add(startn);
	x2.add(conceptn);
	x2.add(exitn);
	startn.setBounds(400,300,220,80);
	conceptn.setBounds(400,400,220,80);
	exitn.setBounds(400,500,220,80);
	startn.setBounds(400,300,220,80);
	startn.setBackground(Color.pink);
	startn.setBorder(BorderFactory.createEtchedBorder());
	startn.setFont(new Font("Arial", Font.PLAIN, 40));
	startn.setForeground(Color.white);
	exitn.setBounds(400,500,220,80);
	exitn.setBackground(Color.pink);
	exitn.setBorder(BorderFactory.createEtchedBorder());
	exitn.setFont(new Font("Arial", Font.PLAIN, 40));
	exitn.setForeground(Color.white);
	conceptn.setBounds(400,400,220,80);
	conceptn.setBackground(Color.pink);
	conceptn.setBorder(BorderFactory.createEtchedBorder());
	conceptn.setFont(new Font("Arial", Font.PLAIN, 40));
	conceptn.setForeground(Color.white);
	//affichage
	fen1.setContentPane(SecondW1);
	//exit procedure
	fen1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//visible
	fen1.setVisible(true);
	exitn.addActionListener(this);
	conceptn.addActionListener(this);
	startn.addActionListener(this);

}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==exitn)
		{
			System.exit(0);
		}
		if (arg0.getSource()==conceptn)
		{
			String text ="A list of random numbers will generate at the beginning of the game." 
					+ "\nAll players will chose  numbers."+"\nEach player will try to get numbers that equal of close to a random one"+"\nFirst player to reach or exceed the number  wins the game ";
			JOptionPane.showMessageDialog(null, text);
		}
		if (arg0.getSource()==startn)
		{
			
			new NumbersLogin();
			fen1.dispose();
		}
	}
}