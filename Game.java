import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JFrame implements ActionListener{
	JFrame fen = new JFrame();
	JPanel FirstW1 = new JPanel();
	Icon AIcon = new ImageIcon("C:\\Users\\MSI\\Downloads\\ezgif.com-gif-maker (3).gif");
	JButton Alpha = new JButton("GAME OF LETTERS", AIcon);
	Icon NIcon = new ImageIcon("C:\\Users\\MSI\\Downloads\\ezgif.com-gif-maker.gif");
	JButton Numba = new JButton("GAME OF NUMBERS", NIcon);
	Icon icon = new ImageIcon(this.getClass().getResource("/x1.gif"));
	JLabel x1 = new JLabel();
	public Game()
	{
		
		fen.setTitle("THE GAME");
		fen.setSize(1000,870);
		fen.setLocationRelativeTo(null);
		x1  = new JLabel(icon);
		FirstW1.add(x1);
		FirstW1.add(Alpha);
		FirstW1.add(Numba);
		x1.add(Alpha);
		x1.add(Numba);
		Alpha.setBounds(450,600,220,80);
		Numba.setBounds(700,600,220,80);
		//affichage
		fen.setContentPane(FirstW1);
		//exit procedure
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//visible
		fen.setVisible(true);
		Alpha.addActionListener(this);
		Numba.addActionListener(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==Alpha)
		{
			fen.dispose();
			new LettersLogin();
			
		}
		if (arg0.getSource()==Numba)
		{
			fen.dispose();
			new NumbersLogin();
			
		}
		
		
	}
	

	
}

