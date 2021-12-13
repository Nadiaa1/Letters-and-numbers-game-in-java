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

public class LettersLogin implements ActionListener{
	JPanel SecondW3 = new JPanel();
	Icon icon2 = new ImageIcon(this.getClass().getResource("/cute (1).gif"));
	JLabel x3 = new JLabel();
	JButton startl = new JButton("START");
	JButton conceptl = new JButton("CONCEPT");
	JButton exitl = new JButton("EXIT");
	public LettersLogin()
	{
		JFrame fen2 = new JFrame();
		fen2.setTitle("THE GAME OF LETTERS ");
		fen2.setSize(1000,870);
		fen2.setLocationRelativeTo(null);
		x3  = new JLabel(icon2);
		SecondW3.add(x3);
		SecondW3.add(startl);
		SecondW3.add(conceptl);
		SecondW3.add(exitl);
		x3.add(startl);
		x3.add(conceptl);
		x3.add(exitl);
		startl.setBounds(400,300,220,80);
		startl.setBackground(Color.pink);
		startl.setBorder(BorderFactory.createEtchedBorder());
		startl.setFont(new Font("Arial", Font.PLAIN, 40));
		startl.setForeground(Color.white);
		exitl.setBounds(400,500,220,80);
		exitl.setBackground(Color.pink);
		exitl.setBorder(BorderFactory.createEtchedBorder());
		exitl.setFont(new Font("Arial", Font.PLAIN, 40));
		exitl.setForeground(Color.white);
		conceptl.setBounds(400,400,220,80);
		conceptl.setBackground(Color.pink);
		conceptl.setBorder(BorderFactory.createEtchedBorder());
		conceptl.setFont(new Font("Arial", Font.PLAIN, 40));
		conceptl.setForeground(Color.white);
		//affichage
		fen2.setContentPane(SecondW3);
		//exit procedure
		fen2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//visible
		fen2.setVisible(true);
		exitl.addActionListener(this);
		conceptl.addActionListener(this);
		startl.addActionListener(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==exitl)
		{
			System.exit(0);
		}
		if (arg0.getSource()==conceptl)
		{
			String text ="The Player should make a correct word using the letters given above";
			JOptionPane.showMessageDialog(null, text);
		}
		if (arg0.getSource()==startl)
		{
			new Letters();
			
		}

	}
}
