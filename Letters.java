import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;

public class Letters extends JFrame implements ActionListener{

JPanel contentPane;
int d1=0;
int d2=0;
int comp1=0;
int comp2=0;
boolean s1=false;
boolean s2=false;
int index,index1;
int  Q,Q1=0;
Icon icon1 = new ImageIcon(this.getClass().getResource("/cute (4).gif"));
JLabel x2 = new JLabel();

ArrayList<String> L=new ArrayList<String>();
ArrayList<String> B=new ArrayList<String>();




ArrayList<Character> r=new GenerateRandoms().GenerateRandomLetters();


JFrame fen2 = new JFrame();
JButton btnNewButton = new JButton(String.valueOf(r.get(0)));
JButton btnNewButton_1 = new JButton(String.valueOf(r.get(1)));
JButton btnNewButton_2 = new JButton(String.valueOf(r.get(2)));
JButton btnNewButton_3 = new JButton(String.valueOf(r.get(3)));
JButton btnNewButton_4 = new JButton(String.valueOf(r.get(4)));
JButton btnNewButton_5 = new JButton(String.valueOf(r.get(5)));
JButton btnNewButton_6 = new JButton(String.valueOf(r.get(6)));
JButton btnNewButton_7 = new JButton(String.valueOf(r.get(7)));
JButton btnNewButton_8 = new JButton(String.valueOf(r.get(8)));

JButton btnNewButton_9 = new JButton(String.valueOf(r.get(0)));
JButton btnNewButton_1_1 = new JButton(String.valueOf(r.get(1)));
JButton btnNewButton_2_1 = new JButton(String.valueOf(r.get(2)));
JButton btnNewButton_3_1 = new JButton(String.valueOf(r.get(3)));
JButton btnNewButton_4_1 = new JButton(String.valueOf(r.get(4)));
JButton btnNewButton_5_1 = new JButton(String.valueOf(r.get(5)));
JButton btnNewButton_6_1 = new JButton(String.valueOf(r.get(6)));
JButton btnNewButton_7_1 = new JButton(String.valueOf(r.get(7)));
JButton btnNewButton_8_1 = new JButton(String.valueOf(r.get(8)));

JButton btnNewButton_10 = new JButton();
JButton btnNewButton_1_2 = new JButton();
JButton btnNewButton_2_2 = new JButton();
JButton btnNewButton_3_2 = new JButton();
JButton btnNewButton_4_2 = new JButton();
JButton btnNewButton_5_2 = new JButton();
JButton btnNewButton_6_2 = new JButton();
JButton btnNewButton_7_2 = new JButton();
JButton btnNewButton_8_2 = new JButton();

JButton btnNewButton_11 = new JButton();
JButton btnNewButton_1_3 = new JButton();
JButton btnNewButton_2_3 = new JButton();
JButton btnNewButton_3_3 = new JButton();
JButton btnNewButton_4_3 = new JButton();
JButton btnNewButton_5_3 = new JButton();
JButton btnNewButton_6_3 = new JButton();
JButton btnNewButton_7_3 = new JButton();
JButton btnNewButton_8_3 = new JButton();

JCheckBox chckbxNewCheckBox = new JCheckBox("Correct word");
JCheckBox chckbxCorrectWord = new JCheckBox("Correct word");

JButton btnNewButton_4_2_1 = new JButton("Result");
JButton REJOUER = new JButton("PLAY AGAIN");


public Letters() {
fen2.setTitle("THE GAME OF LETTERS ");
fen2.setSize(1000,900);
fen2.setLocationRelativeTo(null);
contentPane = new JPanel();
x2  = new JLabel(icon1);
contentPane.add(x2);
for(int i=0;i<9;i++)
L.add(i,"");
for(int j=0;j<9;j++)
B.add(j,"");

btnNewButton.setBounds(10, 100, 49, 40);
contentPane.add(btnNewButton);
x2.add(btnNewButton);

btnNewButton_1.setBounds(58, 100, 49, 40);
contentPane.add(btnNewButton_1);
x2.add(btnNewButton_1);

btnNewButton_2.setBounds(107, 100, 49, 40);
contentPane.add(btnNewButton_2);
x2.add(btnNewButton_2);

btnNewButton_3.setBounds(156, 100, 49, 40);
contentPane.add(btnNewButton_3);
x2.add(btnNewButton_3);

btnNewButton_4.setBounds(204, 100, 49, 40);
contentPane.add(btnNewButton_4);
x2.add(btnNewButton_4);

btnNewButton_5.setBounds(252, 100, 49, 40);
contentPane.add(btnNewButton_5);
x2.add(btnNewButton_5);

btnNewButton_6.setBounds(300, 100, 49, 40);
contentPane.add(btnNewButton_6);
x2.add(btnNewButton_6);

btnNewButton_7.setBounds(348, 100, 49, 40);
contentPane.add(btnNewButton_7);
x2.add(btnNewButton_7);

btnNewButton_8.setBounds(396, 100, 49, 40);
contentPane.add(btnNewButton_8);
x2.add(btnNewButton_8);

btnNewButton_9.setBounds(524, 100, 49, 40);
contentPane.add(btnNewButton_9);
x2.add(btnNewButton_9);

btnNewButton_1_1.setBounds(572, 100, 49, 40);
contentPane.add(btnNewButton_1_1);
x2.add(btnNewButton_1_1);

btnNewButton_2_1.setBounds(621, 100, 49, 40);
contentPane.add(btnNewButton_2_1);
x2.add(btnNewButton_2_1);

btnNewButton_3_1.setBounds(670, 100, 49, 40);
contentPane.add(btnNewButton_3_1);
x2.add(btnNewButton_3_1);

btnNewButton_4_1.setBounds(718, 100, 49, 40);
contentPane.add(btnNewButton_4_1);
x2.add(btnNewButton_4_1);

btnNewButton_5_1.setBounds(766, 100, 49, 40);
contentPane.add(btnNewButton_5_1);
x2.add(btnNewButton_5_1);

btnNewButton_6_1.setBounds(814, 100, 49, 40);
contentPane.add(btnNewButton_6_1);
x2.add(btnNewButton_6_1);

btnNewButton_7_1.setBounds(862, 100, 49, 40);
contentPane.add(btnNewButton_7_1);
x2.add(btnNewButton_7_1);

btnNewButton_8_1.setBounds(910, 100, 49, 40);
contentPane.add(btnNewButton_8_1);
x2.add(btnNewButton_8_1);

btnNewButton_10.setBounds(10, 150, 49, 40);
contentPane.add(btnNewButton_10);
x2.add(btnNewButton_10);

btnNewButton_1_2.setBounds(58, 150, 49, 40);
contentPane.add(btnNewButton_1_2);
x2.add(btnNewButton_1_2);

btnNewButton_2_2.setBounds(107, 150, 49, 40);
contentPane.add(btnNewButton_2_2);
x2.add(btnNewButton_2_2);

btnNewButton_3_2.setBounds(156, 150, 49, 40);
contentPane.add(btnNewButton_3_2);
x2.add(btnNewButton_3_2);

btnNewButton_4_2.setBounds(204, 150, 49, 40);
contentPane.add(btnNewButton_4_2);
x2.add(btnNewButton_4_2);

btnNewButton_5_2.setBounds(252, 150, 49, 40);
contentPane.add(btnNewButton_5_2);
x2.add(btnNewButton_5_2);

btnNewButton_6_2.setBounds(300, 150, 49, 40);
contentPane.add(btnNewButton_6_2);
x2.add(btnNewButton_6_2);

btnNewButton_7_2.setBounds(348, 150, 49, 40);
contentPane.add(btnNewButton_7_2);
x2.add(btnNewButton_7_2);

btnNewButton_8_2.setBounds(396, 150, 49, 40);
contentPane.add(btnNewButton_8_2);
x2.add(btnNewButton_8_2);

btnNewButton_11.setBounds(524, 150, 49, 40);
contentPane.add(btnNewButton_11);
x2.add(btnNewButton_11);

btnNewButton_1_3.setBounds(572, 150, 49, 40);
contentPane.add(btnNewButton_1_3);
x2.add(btnNewButton_1_3);

btnNewButton_2_3.setBounds(621, 150, 49, 40);
contentPane.add(btnNewButton_2_3);
x2.add(btnNewButton_2_3);

btnNewButton_3_3.setBounds(670, 150, 49, 40);
contentPane.add(btnNewButton_3_3);
x2.add(btnNewButton_3_3);

btnNewButton_4_3.setBounds(718, 150, 49, 40);
contentPane.add(btnNewButton_4_3);
x2.add(btnNewButton_4_3);

btnNewButton_5_3.setBounds(766, 150, 49, 40);
contentPane.add(btnNewButton_5_3);
x2.add(btnNewButton_5_3);

btnNewButton_6_3.setBounds(814, 150, 49, 40);
contentPane.add(btnNewButton_6_3);
x2.add(btnNewButton_6_3);

btnNewButton_7_3.setBounds(862, 150, 49, 40);
contentPane.add(btnNewButton_7_3);
x2.add(btnNewButton_7_3);

btnNewButton_8_3.setBounds(910, 150, 49, 40);
contentPane.add(btnNewButton_8_3);
x2.add(btnNewButton_8_3);


chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
chckbxNewCheckBox.setBounds(14, 235, 123, 21);
contentPane.add(chckbxNewCheckBox);
x2.add(chckbxNewCheckBox);

chckbxCorrectWord.setFont(new Font("Tahoma", Font.PLAIN, 15));
chckbxCorrectWord.setBounds(836, 235, 123, 21);
contentPane.add(chckbxCorrectWord);
x2.add(chckbxCorrectWord);

btnNewButton_4_2_1.setForeground(Color.PINK);
btnNewButton_4_2_1.setBounds(424, 303, 123, 40);
contentPane.add(btnNewButton_4_2_1);
x2.add(btnNewButton_4_2_1);

REJOUER.setForeground(Color.blue);
REJOUER.setBounds(424, 250, 123, 40);
contentPane.add(REJOUER);
x2.add(REJOUER);
REJOUER.addActionListener(this);
btnNewButton_4_2_1.addActionListener(this);
btnNewButton.addActionListener(this);
btnNewButton_1.addActionListener(this);
btnNewButton_2.addActionListener(this);
btnNewButton_3.addActionListener(this);
btnNewButton_4.addActionListener(this);
btnNewButton_5.addActionListener(this);
btnNewButton_6.addActionListener(this);
btnNewButton_7.addActionListener(this);
btnNewButton_8.addActionListener(this);
chckbxCorrectWord.addActionListener(this);
chckbxNewCheckBox.addActionListener(this);
btnNewButton_10.addActionListener(this);
btnNewButton_1_2.addActionListener(this);
btnNewButton_2_2.addActionListener(this);
btnNewButton_3_2.addActionListener(this);
btnNewButton_4_2.addActionListener(this);
btnNewButton_5_2.addActionListener(this);
btnNewButton_6_2.addActionListener(this);
btnNewButton_7_2.addActionListener(this);
btnNewButton_8_2.addActionListener(this);
btnNewButton_9.addActionListener(this);
btnNewButton_2_1.addActionListener(this);
btnNewButton_3_1.addActionListener(this);
btnNewButton_4_1.addActionListener(this);
btnNewButton_5_1.addActionListener(this);
btnNewButton_6_1.addActionListener(this);
btnNewButton_7_1.addActionListener(this);
btnNewButton_8_1.addActionListener(this);
btnNewButton_1_1.addActionListener(this);

//affichage
fen2.setContentPane(contentPane);
//exit procedure
fen2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//visible
fen2.setVisible(true);

}

public void actionPerformed(ActionEvent arg0)
{
if(arg0.getSource()==REJOUER)
{
Letters let =new Letters();
fen2.dispose();
}

if(chckbxNewCheckBox.isSelected()==true)
   {
	s1=true;
    }

   if(chckbxCorrectWord.isSelected()==true)
   {
	s2=true;}

   if(arg0.getSource()==btnNewButton)
{
	   Q++;
index=L.indexOf("");
if(index==0)
{btnNewButton_10.setText(btnNewButton.getText());
   L.set(0,btnNewButton.getText());
   }
if(index==1)
{btnNewButton_1_2.setText(btnNewButton.getText());
L.set(1,btnNewButton.getText());
}
if(index==2)
{
btnNewButton_2_2.setText(btnNewButton.getText());
L.set(2,btnNewButton.getText());
}
if(index==3)
{
btnNewButton_3_2.setText(btnNewButton.getText());
L.set(3,btnNewButton.getText());
}
if(index==4)
{
btnNewButton_4_2.setText(btnNewButton.getText());
L.set(4,btnNewButton.getText());
}
if(index==5)
{
btnNewButton_5_2.setText(btnNewButton.getText());
L.set(5,btnNewButton.getText());
}
if(index==6)
{
btnNewButton_6_2.setText(btnNewButton.getText());
L.set(6,btnNewButton.getText());
}
if(index==7)
{
btnNewButton_7_2.setText(btnNewButton.getText());
L.set(7,btnNewButton.getText());
}
if(index==8)
{
btnNewButton_8_2.setText(btnNewButton.getText());
L.set(8,btnNewButton.getText());
}

}
   if(arg0.getSource()==btnNewButton_1)
{
	   Q++;
index=L.indexOf("");
if(index==0)
{btnNewButton_10.setText(btnNewButton_1.getText());
   L.set(0,btnNewButton_1.getText());
   }
if(index==1)
{btnNewButton_1_2.setText(btnNewButton_1.getText());
L.set(1,btnNewButton_1.getText());
}
if(index==2)
{
btnNewButton_2_2.setText(btnNewButton_1.getText());
L.set(2,btnNewButton_1.getText());
}
if(index==3)
{
btnNewButton_3_2.setText(btnNewButton_1.getText());
L.set(3,btnNewButton_1.getText());
}
if(index==4)
{
btnNewButton_4_2.setText(btnNewButton_1.getText());
L.set(4,btnNewButton_1.getText());
}
if(index==5)
{
btnNewButton_5_2.setText(btnNewButton_1.getText());
L.set(5,btnNewButton_1.getText());
}
if(index==6)
{
btnNewButton_6_2.setText(btnNewButton_1.getText());
L.set(6,btnNewButton_1.getText());
}
if(index==7)
{
btnNewButton_7_2.setText(btnNewButton_1.getText());
L.set(7,btnNewButton_1.getText());
}
if(index==8)
{
btnNewButton_8_2.setText(btnNewButton_1.getText());
L.set(8,btnNewButton_1.getText());
}

}
   
if(arg0.getSource()==btnNewButton_2)
{
	Q++;
index=L.indexOf("");
if(index==0)
{btnNewButton_10.setText(btnNewButton_2.getText());
   L.set(0,btnNewButton_2.getText());
   }
if(index==1)
{btnNewButton_1_2.setText(btnNewButton_2.getText());
L.set(1,btnNewButton_2.getText());
}
if(index==2)
{
btnNewButton_2_2.setText(btnNewButton_2.getText());
L.set(2,btnNewButton_2.getText());
}
if(index==3)
{
btnNewButton_3_2.setText(btnNewButton_2.getText());
L.set(3,btnNewButton_2.getText());
}
if(index==4)
{
btnNewButton_4_2.setText(btnNewButton_2.getText());
L.set(4,btnNewButton_2.getText());
}
if(index==5)
{
btnNewButton_5_2.setText(btnNewButton_2.getText());
L.set(5,btnNewButton_2.getText());
}
if(index==6)
{
btnNewButton_6_2.setText(btnNewButton_2.getText());
L.set(6,btnNewButton_2.getText());
}
if(index==7)
{
btnNewButton_7_2.setText(btnNewButton_2.getText());
L.set(7,btnNewButton_2.getText());
}
if(index==8)
{
btnNewButton_8_2.setText(btnNewButton_2.getText());
L.set(8,btnNewButton_2.getText());
}

}
   if(arg0.getSource()==btnNewButton_3)
{
	   Q++;
index=L.indexOf("");
if(index==0)
{btnNewButton_10.setText(btnNewButton_3.getText());
   L.set(0,btnNewButton_3.getText());
   }
if(index==1)
{btnNewButton_1_2.setText(btnNewButton_3.getText());
L.set(1,btnNewButton_3.getText());
}
if(index==2)
{
btnNewButton_2_2.setText(btnNewButton_3.getText());
L.set(2,btnNewButton_3.getText());
}
if(index==3)
{
btnNewButton_3_2.setText(btnNewButton_3.getText());
L.set(3,btnNewButton_3.getText());
}
if(index==4)
{
btnNewButton_4_2.setText(btnNewButton_3.getText());
L.set(4,btnNewButton_3.getText());
}
if(index==5)
{
btnNewButton_5_2.setText(btnNewButton_3.getText());
L.set(5,btnNewButton_3.getText());
}
if(index==6)
{
btnNewButton_6_2.setText(btnNewButton_3.getText());
L.set(6,btnNewButton_3.getText());
}
if(index==7)
{
btnNewButton_7_2.setText(btnNewButton_3.getText());
L.set(7,btnNewButton_3.getText());
}
if(index==8)
{
btnNewButton_8_2.setText(btnNewButton_3.getText());
L.set(8,btnNewButton_3.getText());
}

}
   if(arg0.getSource()==btnNewButton_4)
{
	   Q++;
index=L.indexOf("");
if(index==0)
{btnNewButton_10.setText(btnNewButton_4.getText());
   L.set(0,btnNewButton_4.getText());
   }
if(index==1)
{btnNewButton_1_2.setText(btnNewButton_4.getText());
L.set(1,btnNewButton_4.getText());
}
if(index==2)
{
btnNewButton_2_2.setText(btnNewButton_4.getText());
L.set(2,btnNewButton_4.getText());
}
if(index==3)
{
btnNewButton_3_2.setText(btnNewButton_4.getText());
L.set(3,btnNewButton_4.getText());
}
if(index==4)
{
btnNewButton_4_2.setText(btnNewButton_4.getText());
L.set(4,btnNewButton_4.getText());
}
if(index==5)
{
btnNewButton_5_2.setText(btnNewButton_4.getText());
L.set(5,btnNewButton_4.getText());
}
if(index==6)
{
btnNewButton_6_2.setText(btnNewButton_4.getText());
L.set(6,btnNewButton_4.getText());
}
if(index==7)
{
btnNewButton_7_2.setText(btnNewButton_4.getText());
L.set(7,btnNewButton_4.getText());
}
if(index==8)
{
btnNewButton_8_2.setText(btnNewButton_4.getText());
L.set(8,btnNewButton_4.getText());
}

}
   if(arg0.getSource()==btnNewButton_5)
{
	   Q++;
index=L.indexOf("");
if(index==0)
{btnNewButton_10.setText(btnNewButton_5.getText());
   L.set(0,btnNewButton_5.getText());
   }
if(index==1)
{btnNewButton_1_2.setText(btnNewButton_5.getText());
L.set(1,btnNewButton_5.getText());
}
if(index==2)
{
btnNewButton_2_2.setText(btnNewButton_5.getText());
L.set(2,btnNewButton_5.getText());
}
if(index==3)
{
btnNewButton_3_2.setText(btnNewButton_5.getText());
L.set(3,btnNewButton_5.getText());
}
if(index==4)
{
btnNewButton_4_2.setText(btnNewButton_5.getText());
L.set(4,btnNewButton_5.getText());
}
if(index==5)
{
btnNewButton_5_2.setText(btnNewButton_5.getText());
L.set(5,btnNewButton_5.getText());
}
if(index==6)
{
btnNewButton_6_2.setText(btnNewButton_5.getText());
L.set(6,btnNewButton_5.getText());
}
if(index==7)
{
btnNewButton_7_2.setText(btnNewButton_5.getText());
L.set(7,btnNewButton_5.getText());
}
if(index==8)
{
btnNewButton_8_2.setText(btnNewButton_5.getText());
L.set(8,btnNewButton_5.getText());
}

}
   if(arg0.getSource()==btnNewButton_6)
{
	   Q++;
index=L.indexOf("");
if(index==0)
{btnNewButton_10.setText(btnNewButton_6.getText());
   L.set(0,btnNewButton_6.getText());
   }
if(index==1)
{btnNewButton_1_2.setText(btnNewButton_6.getText());
L.set(1,btnNewButton_6.getText());
}
if(index==2)
{
btnNewButton_2_2.setText(btnNewButton_6.getText());
L.set(2,btnNewButton_6.getText());
}
if(index==3)
{
btnNewButton_3_2.setText(btnNewButton_6.getText());
L.set(3,btnNewButton_6.getText());
}
if(index==4)
{
btnNewButton_4_2.setText(btnNewButton_6.getText());
L.set(4,btnNewButton_6.getText());
}
if(index==5)
{
btnNewButton_5_2.setText(btnNewButton_6.getText());
L.set(5,btnNewButton_6.getText());
}
if(index==6)
{
btnNewButton_6_2.setText(btnNewButton_6.getText());
L.set(6,btnNewButton_6.getText());
}
if(index==7)
{
btnNewButton_7_2.setText(btnNewButton_6.getText());
L.set(7,btnNewButton_6.getText());
}
if(index==8)
{
btnNewButton_8_2.setText(btnNewButton_6.getText());
L.set(8,btnNewButton_6.getText());
}

}
   if(arg0.getSource()==btnNewButton_7)
{
	   Q++;
index=L.indexOf("");
if(index==0)
{btnNewButton_10.setText(btnNewButton_7.getText());
   L.set(0,btnNewButton_7.getText());
   }
if(index==1)
{btnNewButton_1_2.setText(btnNewButton_7.getText());
L.set(1,btnNewButton_7.getText());
}
if(index==2)
{
btnNewButton_2_2.setText(btnNewButton_7.getText());
L.set(2,btnNewButton_7.getText());
}
if(index==3)
{
btnNewButton_3_2.setText(btnNewButton_7.getText());
L.set(3,btnNewButton_7.getText());
}
if(index==4)
{
btnNewButton_4_2.setText(btnNewButton_7.getText());
L.set(4,btnNewButton_7.getText());
}
if(index==5)
{
btnNewButton_5_2.setText(btnNewButton_7.getText());
L.set(5,btnNewButton_7.getText());
}
if(index==6)
{
btnNewButton_6_2.setText(btnNewButton_7.getText());
L.set(6,btnNewButton_7.getText());
}
if(index==7)
{
btnNewButton_7_2.setText(btnNewButton_7.getText());
L.set(7,btnNewButton_7.getText());
}
if(index==8)
{
btnNewButton_8_2.setText(btnNewButton_7.getText());
L.set(8,btnNewButton_7.getText());
}

}
   if(arg0.getSource()==btnNewButton_8)
{
	   Q++;
index=L.indexOf(""); if(index==0)
{btnNewButton_10.setText(btnNewButton_8.getText());
   L.set(0,btnNewButton_8.getText()); 
   }
if(index==1)
{btnNewButton_1_2.setText(btnNewButton_8.getText());
L.set(1,btnNewButton_8.getText());
}
if(index==2)
{
btnNewButton_2_2.setText(btnNewButton_8.getText());
L.set(2,btnNewButton_8.getText());
}
if(index==3)
{
btnNewButton_3_2.setText(btnNewButton_8.getText());
L.set(3,btnNewButton_8.getText());
}
if(index==4)
{
btnNewButton_4_2.setText(btnNewButton_8.getText());
L.set(4,btnNewButton_8.getText());
}
if(index==5)
{
btnNewButton_5_2.setText(btnNewButton_8.getText());
L.set(5,btnNewButton_8.getText());
}
if(index==6)
{
btnNewButton_6_2.setText(btnNewButton_8.getText());
L.set(6,btnNewButton_8.getText());
}
if(index==7)
{
btnNewButton_7_2.setText(btnNewButton_8.getText());
L.set(7,btnNewButton_8.getText());
}
if(index==8)
{
btnNewButton_8_2.setText(btnNewButton_8.getText());
L.set(8,btnNewButton_8.getText());
}

}
   
   
/////////////////////////////////////////////////////////////
   
   if(arg0.getSource()==btnNewButton_9)
{
	   Q1++;
index=B.indexOf(""); 
if(index==0)
{btnNewButton_11.setText(btnNewButton_9.getText());
   B.set(0,btnNewButton_9.getText()); 
   }
if(index==1)
{btnNewButton_1_3.setText(btnNewButton_9.getText());
B.set(1,btnNewButton_9.getText());
}
if(index==2)
{
btnNewButton_2_3.setText(btnNewButton_9.getText());
B.set(2,btnNewButton_9.getText());
}
if(index==3)
{
btnNewButton_3_3.setText(btnNewButton_9.getText());
B.set(3,btnNewButton_9.getText());
}
if(index==4)
{
btnNewButton_4_3.setText(btnNewButton_9.getText());
B.set(4,btnNewButton_9.getText());
}
if(index==5)
{
btnNewButton_5_3.setText(btnNewButton_9.getText());
B.set(5,btnNewButton_9.getText());
}
if(index==6)
{
btnNewButton_6_3.setText(btnNewButton_9.getText());
B.set(6,btnNewButton_9.getText());
}
if(index==7)
{
btnNewButton_7_3.setText(btnNewButton_9.getText());
B.set(7,btnNewButton_9.getText());
}
if(index==8)
{
btnNewButton_8_3.setText(btnNewButton_9.getText());
B.set(8,btnNewButton_9.getText());
}

}
   
   if(arg0.getSource()==btnNewButton_1_1)
{
	   Q1++;
index=B.indexOf("");
if(index==0)
{btnNewButton_11.setText(btnNewButton_1_1.getText());
   B.set(0,btnNewButton_1_1.getText()); 
   }
if(index==1)
{btnNewButton_1_3.setText(btnNewButton_1_1.getText());
B.set(1,btnNewButton_1_1.getText());
}
if(index==2)
{
btnNewButton_2_3.setText(btnNewButton_1_1.getText());
B.set(2,btnNewButton_1_1.getText());
}
if(index==3)
{
btnNewButton_3_3.setText(btnNewButton_1_1.getText());
B.set(3,btnNewButton_1_1.getText());
}
if(index==4)
{
btnNewButton_4_3.setText(btnNewButton_1_1.getText());
B.set(4,btnNewButton_1_1.getText());
}
if(index==5)
{
btnNewButton_5_3.setText(btnNewButton_1_1.getText());
B.set(5,btnNewButton_1_1.getText());
}
if(index==6)
{
btnNewButton_6_3.setText(btnNewButton_1_1.getText());
B.set(6,btnNewButton_1_1.getText());
}
if(index==7)
{
btnNewButton_7_3.setText(btnNewButton_1_1.getText());
B.set(7,btnNewButton_1_1.getText());
}
if(index==8)
{
btnNewButton_8_3.setText(btnNewButton_1_1.getText());
B.set(8,btnNewButton_1_1.getText());
}

}

   if(arg0.getSource()==btnNewButton_2_1)
{
	   Q1++;
index=B.indexOf(""); 
if(index==0)
{btnNewButton_11.setText(btnNewButton_2_1.getText());
   B.set(0,btnNewButton_2_1.getText()); 
   }
if(index==1)
{btnNewButton_1_3.setText(btnNewButton_2_1.getText());
B.set(1,btnNewButton_2_1.getText());
}
if(index==2)
{
btnNewButton_2_3.setText(btnNewButton_2_1.getText());
B.set(2,btnNewButton_2_1.getText());
}
if(index==3)
{
btnNewButton_3_3.setText(btnNewButton_2_1.getText());
B.set(3,btnNewButton_2_1.getText());
}
if(index==4)
{
btnNewButton_4_3.setText(btnNewButton_2_1.getText());
B.set(4,btnNewButton_2_1.getText());
}
if(index==5)
{
btnNewButton_5_3.setText(btnNewButton_2_1.getText());
B.set(5,btnNewButton_2_1.getText());
}
if(index==6)
{
btnNewButton_6_3.setText(btnNewButton_2_1.getText());
B.set(6,btnNewButton_2_1.getText());
}
if(index==7)
{
btnNewButton_7_3.setText(btnNewButton_2_1.getText());
B.set(7,btnNewButton_2_1.getText());
}
if(index==8)
{
btnNewButton_8_3.setText(btnNewButton_2_1.getText());
B.set(8,btnNewButton_2_1.getText());
}

}
   
   if(arg0.getSource()==btnNewButton_3_1)
{
	   Q1++;
index=B.indexOf(""); 
if(index==0)
{btnNewButton_11.setText(btnNewButton_3_1.getText());
   B.set(0,btnNewButton_3_1.getText()); 
   }
if(index==1)
{btnNewButton_1_3.setText(btnNewButton_3_1.getText());
B.set(1,btnNewButton_3_1.getText());
}
if(index==2)
{
btnNewButton_2_3.setText(btnNewButton_3_1.getText());
B.set(2,btnNewButton_3_1.getText());
}
if(index==3)
{
btnNewButton_3_3.setText(btnNewButton_3_1.getText());
B.set(3,btnNewButton_3_1.getText());
}
if(index==4)
{
btnNewButton_4_3.setText(btnNewButton_3_1.getText());
B.set(4,btnNewButton_3_1.getText());
}
if(index==5)
{
btnNewButton_5_3.setText(btnNewButton_3_1.getText());
B.set(5,btnNewButton_3_1.getText());
}
if(index==6)
{
btnNewButton_6_3.setText(btnNewButton_3_1.getText());
B.set(6,btnNewButton_3_1.getText());
}
if(index==7)
{
btnNewButton_7_3.setText(btnNewButton_3_1.getText());
B.set(7,btnNewButton_3_1.getText());
}
if(index==8)
{
btnNewButton_8_3.setText(btnNewButton_3_1.getText());
B.set(8,btnNewButton_3_1.getText());
}

}
   
   if(arg0.getSource()==btnNewButton_4_1)
{
	   Q1++;
index=B.indexOf(""); 
if(index==0)
{btnNewButton_11.setText(btnNewButton_4_1.getText());
   B.set(0,btnNewButton_4_1.getText()); 
   }
if(index==1)
{btnNewButton_1_3.setText(btnNewButton_4_1.getText());
B.set(1,btnNewButton_4_1.getText());
}
if(index==2)
{
btnNewButton_2_3.setText(btnNewButton_4_1.getText());
B.set(2,btnNewButton_4_1.getText());
}
if(index==3)
{
btnNewButton_3_3.setText(btnNewButton_4_1.getText());
B.set(3,btnNewButton_4_1.getText());
}
if(index==4)
{
btnNewButton_4_3.setText(btnNewButton_4_1.getText());
B.set(4,btnNewButton_4_1.getText());
}
if(index==5)
{
btnNewButton_5_3.setText(btnNewButton_4_1.getText());
B.set(5,btnNewButton_4_1.getText());
}
if(index==6)
{
btnNewButton_6_3.setText(btnNewButton_4_1.getText());
B.set(6,btnNewButton_4_1.getText());
}
if(index==7)
{
btnNewButton_7_3.setText(btnNewButton_4_1.getText());
B.set(7,btnNewButton_4_1.getText());
}
if(index==8)
{
btnNewButton_8_3.setText(btnNewButton_4_1.getText());
B.set(8,btnNewButton_4_1.getText());
}

}
   if(arg0.getSource()==btnNewButton_5_1)
{
	   Q1++;
index=B.indexOf(""); 
if(index==0)
{btnNewButton_11.setText(btnNewButton_5_1.getText());
   B.set(0,btnNewButton_5_1.getText()); 
   }
if(index==1)
{btnNewButton_1_3.setText(btnNewButton_5_1.getText());
B.set(1,btnNewButton_5_1.getText());
}
if(index==2)
{
btnNewButton_2_3.setText(btnNewButton_5_1.getText());
B.set(2,btnNewButton_5_1.getText());
}
if(index==3)
{
btnNewButton_3_3.setText(btnNewButton_5_1.getText());
B.set(3,btnNewButton_5_1.getText());
}
if(index==4)
{
btnNewButton_4_3.setText(btnNewButton_5_1.getText());
B.set(4,btnNewButton_5_1.getText());
}
if(index==5)
{
btnNewButton_5_3.setText(btnNewButton_5_1.getText());
B.set(5,btnNewButton_5_1.getText());
}
if(index==6)
{
btnNewButton_6_3.setText(btnNewButton_5_1.getText());
B.set(6,btnNewButton_5_1.getText());
}
if(index==7)
{
btnNewButton_7_3.setText(btnNewButton_5_1.getText());
B.set(7,btnNewButton_5_1.getText());
}
if(index==8)
{
btnNewButton_8_3.setText(btnNewButton_5_1.getText());
B.set(8,btnNewButton_5_1.getText());
}

}
   
   if(arg0.getSource()==btnNewButton_6_1)
{
	   Q1++;
index=B.indexOf("");
if(index==0)
{btnNewButton_11.setText(btnNewButton_6_1.getText());
   B.set(0,btnNewButton_6_1.getText());
   }
if(index==1)
{btnNewButton_1_3.setText(btnNewButton_6_1.getText());
B.set(1,btnNewButton_6_1.getText());
}
if(index==2)
{
btnNewButton_2_3.setText(btnNewButton_6_1.getText());
B.set(2,btnNewButton_6_1.getText());
}
if(index==3)
{
btnNewButton_3_3.setText(btnNewButton_6_1.getText());
B.set(3,btnNewButton_6_1.getText());
}
if(index==4)
{
btnNewButton_4_3.setText(btnNewButton_6_1.getText());
B.set(4,btnNewButton_6_1.getText());
}
if(index==5)
{
btnNewButton_5_3.setText(btnNewButton_6_1.getText());
B.set(5,btnNewButton_6_1.getText());
}
if(index==6)
{
btnNewButton_6_3.setText(btnNewButton_6_1.getText());
B.set(6,btnNewButton_6_1.getText());
}
if(index==7)
{
btnNewButton_7_3.setText(btnNewButton_6_1.getText());
B.set(7,btnNewButton_6_1.getText());
}
if(index==8)
{
btnNewButton_8_3.setText(btnNewButton_6_1.getText());
B.set(8,btnNewButton_6_1.getText());
}

}if(arg0.getSource()==btnNewButton_7_1)
{
	Q1++;
index=B.indexOf(""); 
if(index==0)
{btnNewButton_11.setText(btnNewButton_7_1.getText());
   B.set(0,btnNewButton_7_1.getText()); 
   }
if(index==1)
{btnNewButton_1_3.setText(btnNewButton_7_1.getText());
B.set(1,btnNewButton_7_1.getText());
}
if(index==2)
{
btnNewButton_2_3.setText(btnNewButton_7_1.getText());
B.set(2,btnNewButton_7_1.getText());
}
if(index==3)
{
btnNewButton_3_3.setText(btnNewButton_7_1.getText());
B.set(3,btnNewButton_7_1.getText());
}
if(index==4)
{
btnNewButton_4_3.setText(btnNewButton_7_1.getText());
B.set(4,btnNewButton_7_1.getText());
}
if(index==5)
{
btnNewButton_5_3.setText(btnNewButton_7_1.getText());
B.set(5,btnNewButton_7_1.getText());
}
if(index==6)
{
btnNewButton_6_3.setText(btnNewButton_7_1.getText());
B.set(6,btnNewButton_7_1.getText());
}
if(index==7)
{
btnNewButton_7_3.setText(btnNewButton_7_1.getText());
B.set(7,btnNewButton_7_1.getText());
}
if(index==8)
{
btnNewButton_8_3.setText(btnNewButton_7_1.getText());
B.set(8,btnNewButton_7_1.getText());
}

}
   
if(arg0.getSource()==btnNewButton_8_1)
{
	Q1++;
index=B.indexOf(""); 
if(index==0)
{btnNewButton_11.setText(btnNewButton_8_1.getText());
   B.set(0,btnNewButton_8_1.getText()); 
   }
if(index==1)
{btnNewButton_1_3.setText(btnNewButton_8_1.getText());
B.set(1,btnNewButton_8_1.getText());
}
if(index==2)
{
btnNewButton_2_3.setText(btnNewButton_8_1.getText());
B.set(2,btnNewButton_8_1.getText());
}
if(index==3)
{
btnNewButton_3_3.setText(btnNewButton_8_1.getText());
B.set(3,btnNewButton_8_1.getText());
}
if(index==4)
{
btnNewButton_4_3.setText(btnNewButton_8_1.getText());
B.set(4,btnNewButton_8_1.getText());
}
if(index==5)
{
btnNewButton_5_3.setText(btnNewButton_8_1.getText());
B.set(5,btnNewButton_8_1.getText());
}
if(index==6)
{
btnNewButton_6_3.setText(btnNewButton_8_1.getText());
B.set(6,btnNewButton_8_1.getText());
}
if(index==7)
{
btnNewButton_7_3.setText(btnNewButton_8_1.getText());
B.set(7,btnNewButton_8_1.getText());
}
if(index==8)
{
btnNewButton_8_3.setText(btnNewButton_8_1.getText());
B.set(8,btnNewButton_8_1.getText());
}

}
   
   
/////////////////////////////////////////////////////////////////
if(arg0.getSource()==btnNewButton_4_2_1)
{
 if(Q1==Q && s1==true && s2==false)
 {
 JOptionPane.showMessageDialog(null,"Player 1 WIN !! ");
 }
 
 if(Q1==Q && s2==true && s1==false)
 {
 JOptionPane.showMessageDialog(null,"Player 1 WIN !! ");
 }
 if(Q1==Q && s1==true && s2==true)
 {
 JOptionPane.showMessageDialog(null,"Both words are correct and have the same length , PLAY AGAIN !! ");
 }
 else if (s1==false && s2==false)
 {
	 JOptionPane.showMessageDialog(null,"Both words are incorrect , PLAY AGAIN !!");
 }
 else if(Q>Q1 && s1==true && s2==true)
 {
 JOptionPane.showMessageDialog(null,"The winner is Player 1 ");}
 else if(Q<Q1 && s1==true && s2==true)
 {
 JOptionPane.showMessageDialog(null,"The winner is Player 2 ");
}

}}}