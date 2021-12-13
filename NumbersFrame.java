import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class NumbersFrame extends JFrame implements ActionListener{
		
		JPanel contentPane;	
		Icon icon1 = new ImageIcon(this.getClass().getResource("/cute (4).gif"));
		JLabel x2 = new JLabel();
		GenerateRandoms x = new GenerateRandoms();
		List<Integer> cars= x.GenerateRandomNumbers();
		Random rand = new Random();
		JFrame fen1 = new JFrame();
		JLabel lblNewLabel = new JLabel("    RESULT");
		JTextArea t1 = new JTextArea("0");
	    JTextArea t2 = new JTextArea("0");
	    JLabel lblNewLabel_2 = new JLabel("    RESULT");
	    JTextArea t11 = new JTextArea("0");
	    JTextArea t12 = new JTextArea("0");
		JButton btnNewButton_10 = new JButton("+");
		JButton btnNewButton_10_1 = new JButton("-");
		JButton btnNewButton_10_2 = new JButton("*");
		JButton btnNewButton_10_3 = new JButton("/");
		JButton btnNewButton_12 = new JButton("Submit");
		JButton btnNewButton_10_3_2 = new JButton("=");
		JButton btnNewButton_11 = new JButton(String.valueOf(cars.get(1)+rand.nextInt(60)));// the upper one
		JButton btnNewButton = new JButton(String.valueOf(cars.get(0)));
		JButton btnNewButton_1 = new JButton(String.valueOf(cars.get(1)));
		JButton btnNewButton_2 = new JButton(String.valueOf(cars.get(2)));
		JButton btnNewButton_3 = new JButton(String.valueOf(cars.get(3)));
		JButton btnNewButton_4 = new JButton(String.valueOf(cars.get(4)));
		JButton btnNewButton_5 = new JButton(String.valueOf(cars.get(5)));
		JButton btnNewButton_6 = new JButton(String.valueOf(cars.get(6)));
		JButton btnNewButton_7 = new JButton(String.valueOf(cars.get(7)));
		JButton btnNewButton_8 = new JButton(String.valueOf(cars.get(8)));
		JButton btnNewButton_10_4 = new JButton("+");
		JButton btnNewButton_10_1_1 = new JButton("-");
		JButton btnNewButton_10_2_1 = new JButton("*");
		JButton btnNewButton_10_3_1 = new JButton("/");
		
		JButton btnNewButton_9 = new JButton(String.valueOf(cars.get(0)));
		JButton btnNewButton_1_1 = new JButton(String.valueOf(cars.get(1)));
		JButton btnNewButton_2_1 = new JButton(String.valueOf(cars.get(2)));
		JButton btnNewButton_3_1 = new JButton(String.valueOf(cars.get(3)));
		JButton btnNewButton_4_1 = new JButton(String.valueOf(cars.get(4)));
		JButton btnNewButton_5_1 = new JButton(String.valueOf(cars.get(5)));
		JButton btnNewButton_6_1 = new JButton(String.valueOf(cars.get(6)));
		JButton btnNewButton_7_1 = new JButton(String.valueOf(cars.get(7)));
		JButton btnNewButton_8_1 = new JButton(String.valueOf(cars.get(8)));
		JButton btnNewButton_10_3_2_1 = new JButton("=");
		JButton btnNewButton_12_1 = new JButton("Submit");
		
		JButton btnNewButton_13 = new JButton("SCORE");

	   
	    int val,val2;
		int val11,val12;
	    int clicks=0;
	    int clicks1=0;
	    int comp=0;
	    int comp1=0;
	    int j1,j2,d1,d2;
	    int j;
	    
	    
	    List<String> LN=new ArrayList<String>();
	    List<String> LB=new ArrayList<String>();
	    
	    
		public NumbersFrame() {
			fen1.setTitle("THE GAME OF NUMBERS ");
			fen1.setSize(1000,900);
			fen1.setLocationRelativeTo(null);
			x2= new JLabel(icon1);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			contentPane = new JPanel();
			contentPane.add(x2);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
			contentPane.add(btnNewButton);
			x2.add(btnNewButton);
			btnNewButton.setBounds(31, 142, 64, 41);
			btnNewButton_10.setBounds(21, 287, 52, 34);
			contentPane.add(btnNewButton_10);
			x2.add(btnNewButton_10);
			
			btnNewButton_10_1.setBounds(83, 287, 52, 34);
			contentPane.add(btnNewButton_10_1);
			x2.add(btnNewButton_10_1);

			btnNewButton_10_2.setBounds(147, 287, 52, 34);
			contentPane.add(btnNewButton_10_2);
			x2.add(btnNewButton_10_2);

			btnNewButton_10_3.setBounds(216, 287, 52, 34);
			contentPane.add(btnNewButton_10_3);
			x2.add(btnNewButton_10_3);

			btnNewButton_11.setFont(new Font("Arial", Font.PLAIN, 50));
			btnNewButton_11.setBounds(408, 137, 131, 75);
			contentPane.add(btnNewButton_11);
			x2.add(btnNewButton_11);

			btnNewButton_1.setBounds(105, 142, 64, 41);
			contentPane.add(btnNewButton_1);
			x2.add(btnNewButton_1);
			
			btnNewButton_2.setBounds(179, 142, 64, 41);
			contentPane.add(btnNewButton_2);
			x2.add(btnNewButton_2);

			btnNewButton_3.setBounds(31, 190, 64, 41);
			contentPane.add(btnNewButton_3);
			x2.add(btnNewButton_3);

			btnNewButton_4.setBounds(105, 190, 64, 41);
			contentPane.add(btnNewButton_4);
			x2.add(btnNewButton_4);

			btnNewButton_5.setBounds(179, 190, 64, 41);
			contentPane.add(btnNewButton_5);
			x2.add(btnNewButton_5);

			btnNewButton_6.setBounds(31, 235, 64, 41);
			contentPane.add(btnNewButton_6);
			x2.add(btnNewButton_6);

			btnNewButton_7.setBounds(105, 235, 64, 41);
			contentPane.add(btnNewButton_7);
			x2.add(btnNewButton_7);

			btnNewButton_8.setBounds(179, 235, 64, 41);
			contentPane.add(btnNewButton_8);
			x2.add(btnNewButton_8);
			
			btnNewButton_9.setBounds(721, 142, 64, 41);
			contentPane.add(btnNewButton_9);
			x2.add(btnNewButton_9);

			btnNewButton_10_4.setBounds(711, 287, 52, 34);
			contentPane.add(btnNewButton_10_4);
			x2.add(btnNewButton_10_4);

			btnNewButton_10_1_1.setBounds(773, 287, 52, 34);
			contentPane.add(btnNewButton_10_1_1);
			x2.add(btnNewButton_10_1_1);

			btnNewButton_10_2_1.setBounds(837, 287, 52, 34);
			contentPane.add(btnNewButton_10_2_1);
			x2.add(btnNewButton_10_2_1);

			btnNewButton_10_3_1.setBounds(906, 287, 52, 34);
			contentPane.add(btnNewButton_10_3_1);
			x2.add(btnNewButton_10_3_1);

			btnNewButton_1_1.setBounds(795, 142, 64, 41);
			contentPane.add(btnNewButton_1_1);
			x2.add(btnNewButton_1_1);

			btnNewButton_2_1.setBounds(869, 142, 64, 41);
			contentPane.add(btnNewButton_2_1);
			x2.add(btnNewButton_2_1);

			btnNewButton_3_1.setBounds(721, 190, 64, 41);
			contentPane.add(btnNewButton_3_1);
			x2.add(btnNewButton_3_1);

			btnNewButton_4_1.setBounds(795, 190, 64, 41);
			contentPane.add(btnNewButton_4_1);
			x2.add(btnNewButton_4_1);

			btnNewButton_5_1.setBounds(869, 190, 64, 41);
			contentPane.add(btnNewButton_5_1);
			x2.add(btnNewButton_5_1);

			btnNewButton_6_1.setBounds(721, 235, 64, 41);
			contentPane.add(btnNewButton_6_1);
			x2.add(btnNewButton_6_1);

			btnNewButton_7_1.setBounds(795, 235, 64, 41);
			contentPane.add(btnNewButton_7_1);
			x2.add(btnNewButton_7_1);

			btnNewButton_8_1.setBounds(869, 235, 64, 41);
			contentPane.add(btnNewButton_8_1);
			x2.add(btnNewButton_8_1);

			btnNewButton_10_3_2.setBounds(20, 332, 131, 34);
			contentPane.add(btnNewButton_10_3_2);
			x2.add(btnNewButton_10_3_2);

			btnNewButton_10_3_2_1.setBounds(710, 338, 131, 34);
			contentPane.add(btnNewButton_10_3_2_1);
			x2.add(btnNewButton_10_3_2_1);

			btnNewButton_12.setBounds(216, 500, 89, 23);
			contentPane.add(btnNewButton_12);
			x2.add(btnNewButton_12);

			btnNewButton_12_1.setBounds(638, 500, 89, 23);
			contentPane.add(btnNewButton_12_1);
			x2.add(btnNewButton_12_1);

			btnNewButton_13.setBounds(352, 600, 234, 45);
			contentPane.add(btnNewButton_13);
			x2.add(btnNewButton_13);
			
			t1.setFont(new Font("Arial", Font.PLAIN, 25));
			t1.setBounds(170, 332, 70, 50);
			contentPane.add(t1);
			x2.add(t1);
			
			
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
			lblNewLabel.setBounds(200, 400, 134, 38);
			contentPane.add(lblNewLabel);
			x2.add(lblNewLabel);
			
			t2.setFont(new Font("Arial", Font.PLAIN, 50));
			t2.setBounds(200, 438, 90, 50);
			contentPane.add(t2);
			x2.add(t2);
			
			
			lblNewLabel_2.setForeground(Color.RED);
			lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
			lblNewLabel_2.setBounds(650, 400, 134, 38);
			contentPane.add(lblNewLabel_2);
			x2.add(lblNewLabel_2);
			
			
			t11.setFont(new Font("Arial", Font.PLAIN, 24));
			t11.setBounds(860, 332, 70, 35);
			contentPane.add(t11);
			x2.add(t11);
			
			t12.setFont(new Font("Arial", Font.PLAIN, 50));
			t12.setBounds(650, 438, 90, 50);
			contentPane.add(t12);
			x2.add(t12);
			
			//affichage
			fen1.setContentPane(contentPane);
			//exit procedure
			fen1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//visible
			fen1.setVisible(true);
			
			
			//ActionListener
			btnNewButton_10.addActionListener(this);
			btnNewButton_10_1.addActionListener(this);
			btnNewButton_10_2.addActionListener(this);
			btnNewButton_10_3.addActionListener(this);
			btnNewButton_12_1.addActionListener(this);
			btnNewButton_10_3_2_1.addActionListener(this);
			btnNewButton_11.addActionListener(this);
			btnNewButton.addActionListener(this);
			btnNewButton_1.addActionListener(this);
			btnNewButton_2.addActionListener(this);
			btnNewButton_3.addActionListener(this);
			btnNewButton_4.addActionListener(this);
			btnNewButton_5.addActionListener(this);
			btnNewButton_6.addActionListener(this);
			btnNewButton_7.addActionListener(this);
			btnNewButton_8.addActionListener(this);
			btnNewButton_10_4.addActionListener(this);
			btnNewButton_10_1_1.addActionListener(this);
			btnNewButton_10_2_1.addActionListener(this);
			btnNewButton_10_3_1.addActionListener(this);
			btnNewButton_9.addActionListener(this);
			btnNewButton_1_1.addActionListener(this);
			btnNewButton_2_1.addActionListener(this);
			btnNewButton_3_1.addActionListener(this);
			btnNewButton_4_1.addActionListener(this);
			btnNewButton_5_1.addActionListener(this);
			btnNewButton_6_1.addActionListener(this);
			btnNewButton_7_1.addActionListener(this);
			btnNewButton_8_1.addActionListener(this);
			btnNewButton_10_3_2.addActionListener(this);
			btnNewButton_12.addActionListener(this);
			btnNewButton_13.addActionListener(this);
			
			
		}
		
		public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnNewButton_9)
			{ LN.add(btnNewButton_9.getText());
			    comp1++;
			    clicks1++;}
		if(arg0.getSource()==btnNewButton_1_1)
				{LN.add(btnNewButton_1_1.getText());
				comp1++;
				clicks1++;
				}
		if(arg0.getSource()==btnNewButton_2_1)
				{LN.add(btnNewButton_2_1.getText());
				comp1++;
				clicks1++;
				}
		if(arg0.getSource()==btnNewButton_3_1)
				{LN.add(btnNewButton_3_1.getText());
				comp1++;
				clicks1++;
				}
		if(arg0.getSource()==btnNewButton_4_1)
				{LN.add(btnNewButton_4_1.getText());
				comp1++;
				clicks1++;
				}
		if(arg0.getSource()==btnNewButton_5_1)
				{LN.add(btnNewButton_5_1.getText());
				comp1++;
				clicks1++;
				}
		if(arg0.getSource()==btnNewButton_6_1)
				{LN.add(btnNewButton_6_1.getText());
				comp1++;
				clicks1++;
				}
		if(arg0.getSource()==btnNewButton_7_1)
				{LN.add(btnNewButton_7_1.getText());
				comp1++;
				clicks1++;
				}
		if(arg0.getSource()==btnNewButton_8_1)
				{LN.add(btnNewButton_8_1.getText());
				comp1++;
				clicks1++;
				}
		if(arg0.getSource()==btnNewButton_10_4)
			{
				LN.add(btnNewButton_10_4.getText());
				comp1++;
				clicks1++;
			}
		if(arg0.getSource()==btnNewButton_10_1_1)
			{LN.add(btnNewButton_10_1.getText());
			comp1++;
			clicks1++;
			}
		if(arg0.getSource()==btnNewButton_10_2_1)
			{LN.add(btnNewButton_10_2.getText());
			comp1++;
			clicks1++;
			}
		if(arg0.getSource()==btnNewButton_10_3_1)
			{LN.add(btnNewButton_10_3.getText());
			comp1++;
			clicks1++;
			}
		if(arg0.getSource()==btnNewButton_12_1)
			t12.setText(t11.getText());
		if(arg0.getSource()==btnNewButton_10_3_2_1)
			{if(clicks1==2)
				{if(LN.get(comp1-2).equals("+"))
					{val=Integer.parseInt(t11.getText())+Integer.parseInt(LN.get(comp1-1));
		            t11.setText(String.valueOf(val));}
		        if(LN.get(comp1-2).equals("-"))
				    {val=Integer.parseInt(t11.getText())-Integer.parseInt(LN.get(comp1-1));
			        t11.setText(String.valueOf(val));}
			    if(LN.get(comp1-2).equals("*"))
					{val=Integer.parseInt(t11.getText())*Integer.parseInt(LN.get(comp1-1));
			        t11.setText(String.valueOf(val));}
			    if(LN.get(comp1-2).equals("/"))
				    {val=Integer.parseInt(t11.getText())/Integer.parseInt(LN.get(comp1-1));
			        t11.setText(String.valueOf(val));}}
			if(clicks1==3)
			{
				if(LN.get(comp1-2).equals("+"))
					{val=Integer.parseInt(LN.get(comp1-3))+Integer.parseInt(LN.get(comp1-1));
				    t11.setText(String.valueOf(val));}
			    if(LN.get(comp1-2).equals("-"))
			    	{val=Integer.parseInt(LN.get(comp1-3))-Integer.parseInt(LN.get(comp1-1));
			        t11.setText(String.valueOf(val));}
			    if(LN.get(comp1-2).equals("*"))
				  	{val=Integer.parseInt(LN.get(comp1-3))*Integer.parseInt(LN.get(comp1-1));
				    t11.setText(String.valueOf(val));}
		        if(LN.get(comp1-2).equals("/"))
				    {val=Integer.parseInt(LN.get(comp1-3))/Integer.parseInt(LN.get(comp1-1));
				    t11.setText(String.valueOf(val));}
		        					
	
			}
			if(clicks1==4)
			{
				if(LN.get(comp1-2).equals("+"))
				{
					if(LN.get(comp1-4).equals("+"))
						{val=Integer.parseInt(LN.get(comp1-3))+Integer.parseInt(LN.get(comp1-1));
					    val2=Integer.parseInt(t11.getText())+val;
					    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("-"))
					{val=Integer.parseInt(LN.get(comp1-3))+Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())-val;
				    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("*"))
					{val=Integer.parseInt(LN.get(comp1-3))+Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())*val;
				    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("/"))
					{val=Integer.parseInt(LN.get(comp1-3))+Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())/val;
				    t11.setText(String.valueOf(val2));}
					
				}
				if(LN.get(comp1-2).equals("-"))
				{
					if(LN.get(comp1-4).equals("+"))
						{val=Integer.parseInt(LN.get(comp1-3))-Integer.parseInt(LN.get(comp1-1));
					    val2=Integer.parseInt(t11.getText())+val;
					    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("-"))
					{val=Integer.parseInt(LN.get(comp1-3))-Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())-val;
				    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("*"))
					{val=Integer.parseInt(LN.get(comp1-3))-Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())*val;
				    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("/"))
					{val=Integer.parseInt(LN.get(comp1-3))-Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())/val;
				    t11.setText(String.valueOf(val2));}
					
				}
				if(LN.get(comp1-2).equals("*"))
				{
					if(LN.get(comp1-4).equals("+"))
						{val=Integer.parseInt(LN.get(comp1-3))*Integer.parseInt(LN.get(comp1-1));
					    val2=Integer.parseInt(t11.getText())+val;
					    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("-"))
					{val=Integer.parseInt(LN.get(comp1-3))*Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())-val;
				    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("*"))
					{val=Integer.parseInt(LN.get(comp1-3))*Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())*val;
				    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("/"))
					{val=Integer.parseInt(LN.get(comp1-3))*Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())/val;
				    t11.setText(String.valueOf(val2));}
					
				}
				if(LN.get(comp1-2).equals("/"))
				{
					if(LN.get(comp1-4).equals("+"))
						{val=Integer.parseInt(LN.get(comp1-3))/Integer.parseInt(LN.get(comp1-1));
					    val2=Integer.parseInt(t11.getText())+val;
					    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("-"))
					{val=Integer.parseInt(LN.get(comp1-3))/Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())-val;
				    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("*"))
					{val=Integer.parseInt(LN.get(comp1-3))/Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())*val;
				    t11.setText(String.valueOf(val2));}
					if(LN.get(comp1-4).equals("/"))
					{val=Integer.parseInt(LN.get(comp1-3))/Integer.parseInt(LN.get(comp1-1));
				    val2=Integer.parseInt(t11.getText())/val;
				    t11.setText(String.valueOf(val2));}
					
				}
				
				
				
			}
			clicks1=0;	
			}
		 
		//1
		if(arg0.getSource()==btnNewButton)
		{ LB.add(btnNewButton.getText());
		    comp++;
		    clicks++;}
		if(arg0.getSource()==btnNewButton_1)
			{LB.add(btnNewButton_1.getText());
			comp++;
			clicks++;
			}
		if(arg0.getSource()==btnNewButton_2)
			{LB.add(btnNewButton_2.getText());
			comp++;
			clicks++;
			}
		if(arg0.getSource()==btnNewButton_3)
			{LB.add(btnNewButton_3.getText());
			comp++;
			clicks++;
			}
		if(arg0.getSource()==btnNewButton_4)
			{LB.add(btnNewButton_4.getText());
			comp++;
			clicks++;
			}
		if(arg0.getSource()==btnNewButton_5)
			{LB.add(btnNewButton_5.getText());
			comp++;
			clicks++;
			}
		if(arg0.getSource()==btnNewButton_6)
			{LB.add(btnNewButton_6.getText());
			comp++;
			clicks++;
			}
		if(arg0.getSource()==btnNewButton_7)
			{LB.add(btnNewButton_7.getText());
			comp++;
			clicks++;
			}
		if(arg0.getSource()==btnNewButton_8)
			{LB.add(btnNewButton_8.getText());
			comp++;
			clicks++;
			}
		if(arg0.getSource()==btnNewButton_10)
		{
			LB.add(btnNewButton_10.getText());
			comp++;
			clicks++;
		}
	if(arg0.getSource()==btnNewButton_10_1)
		{LB.add(btnNewButton_10_1.getText());
		comp++;
		clicks++;
		}
	if(arg0.getSource()==btnNewButton_10_2)
		{LB.add(btnNewButton_10_2.getText());
		comp++;
		clicks++;
		}
	if(arg0.getSource()==btnNewButton_10_3)
		{LB.add(btnNewButton_10_3.getText());
		comp++;
		clicks++;
		}
		if(arg0.getSource()==btnNewButton_12)
			t2.setText(t1.getText());
		
		if(arg0.getSource()==btnNewButton_10_3_2)
		{if(clicks==2)
			{if(LB.get(comp-2).equals("+"))
				{val11=Integer.parseInt(t1.getText())+Integer.parseInt(LB.get(comp-1));
				t1.setText(String.valueOf(val11));}
	        if(LB.get(comp-2).equals("-"))
			    {val11=Integer.parseInt(t1.getText())-Integer.parseInt(LB.get(comp-1));
			    t1.setText(String.valueOf(val11));}
		    if(LB.get(comp-2).equals("*"))
				{val11=Integer.parseInt(t1.getText())*Integer.parseInt(LB.get(comp-1));
				t1.setText(String.valueOf(val11));}
		    if(LB.get(comp-2).equals("/"))
			    {val11=Integer.parseInt(t1.getText())/Integer.parseInt(LB.get(comp-1));
			    t1.setText(String.valueOf(val11));}}
		if(clicks==3)
		{
			if(LB.get(comp-2).equals("+"))
				{val11=Integer.parseInt(LB.get(comp-3))+Integer.parseInt(LB.get(comp-1));
				t1.setText(String.valueOf(val11));}
		    if(LB.get(comp-2).equals("-"))
		    	{val11=Integer.parseInt(LB.get(comp-3))-Integer.parseInt(LB.get(comp-1));
		    	t1.setText(String.valueOf(val11));}
		    if(LB.get(comp-2).equals("*"))
			  	{val11=Integer.parseInt(LB.get(comp-3))*Integer.parseInt(LB.get(comp-1));
			  	t1.setText(String.valueOf(val11));}
	        if(LB.get(comp-2).equals("/"))
			    {val11=Integer.parseInt(LB.get(comp-3))/Integer.parseInt(LB.get(comp-1));
			    t1.setText(String.valueOf(val11));}
	        					

		}
		if(clicks==4)
		{
			if(LB.get(comp-2).equals("+"))
			{
				if(LB.get(comp-4).equals("+"))
					{val11=Integer.parseInt(LB.get(comp-3))+Integer.parseInt(LB.get(comp-1));
				    val12=Integer.parseInt(t1.getText())+val11;
				    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("-"))
				{val11=Integer.parseInt(LB.get(comp-3))+Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())-val11;
			    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("*"))
				{val11=Integer.parseInt(LB.get(comp-3))+Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())*val11;
			    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("/"))
				{val11=Integer.parseInt(LB.get(comp-3))+Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())/val11;
			    t1.setText(String.valueOf(val12));}
				
			}
			if(LB.get(comp-2).equals("-"))
			{
				if(LB.get(comp-4).equals("+"))
					{val11=Integer.parseInt(LB.get(comp-3))-Integer.parseInt(LB.get(comp-1));
				    val12=Integer.parseInt(t1.getText())+val11;
				    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("-"))
				{val11=Integer.parseInt(LB.get(comp-3))-Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())-val11;
			    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("*"))
				{val11=Integer.parseInt(LB.get(comp-3))-Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())*val11;
			    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("/"))
				{val11=Integer.parseInt(LB.get(comp-3))-Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())/val11;
			    t1.setText(String.valueOf(val12));}
				
			}
			if(LB.get(comp-2).equals("*"))
			{
				if(LB.get(comp-4).equals("+"))
					{val11=Integer.parseInt(LB.get(comp-3))*Integer.parseInt(LB.get(comp-1));
				    val12=Integer.parseInt(t1.getText())+val11;
				    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("-"))
				{val11=Integer.parseInt(LB.get(comp-3))*Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())-val11;
			    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("*"))
				{val11=Integer.parseInt(LB.get(comp-3))*Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())*val11;
			    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("/"))
				{val11=Integer.parseInt(LB.get(comp-3))*Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())/val11;
			    t1.setText(String.valueOf(val12));}
				
			}
			if(LB.get(comp-2).equals("/"))
			{
				if(LB.get(comp-4).equals("+"))
					{val11=Integer.parseInt(LB.get(comp-3))/Integer.parseInt(LB.get(comp-1));
				    val12=Integer.parseInt(t1.getText())+val11;
				    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("-"))
				{val11=Integer.parseInt(LB.get(comp-3))/Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())-val11;
			    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("*"))
				{val11=Integer.parseInt(LB.get(comp-3))/Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())*val11;
			    t1.setText(String.valueOf(val12));}
				if(LB.get(comp-4).equals("/"))
				{val11=Integer.parseInt(LB.get(comp-3))/Integer.parseInt(LB.get(comp-1));
			    val12=Integer.parseInt(t1.getText())/val11;
			    t1.setText(String.valueOf(val12));}
				
			}
			
			
			
		}
		clicks=0;	
		}
		
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(arg0.getSource()==btnNewButton_13)
		{
			j1=Integer.parseInt(t1.getText());
			j2=Integer.parseInt(t12.getText());
			j=Integer.parseInt(btnNewButton_11.getText());
			d1=Math.abs(j1-j);
			d2=Math.abs(j2-j);
			if(d1<d2)
				JOptionPane.showMessageDialog(null,"Player 1 won \n Number Of Player 1 :: "+j1+"\n Number Of Player 2 ::"+j2);
			if(d1>d2)
				JOptionPane.showMessageDialog(null,"Player 2 won \n Number Of Player 2 :: "+j2+"\n Number Of Player 1 ::"+j1);
			
			if(d1==d2)
				{
				JOptionPane.showMessageDialog(null,"There's an equality");
				NumbersFrame Fen=new NumbersFrame();
				Fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Fen.setVisible(true);
				this.dispose();
				}
		}

		}
		
}