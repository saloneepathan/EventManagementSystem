/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OnlineTest extends JFrame implements ActionListener
{
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);add(b2);
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);
		jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);
		jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current++;
			set();	
			if(current==9)
			{
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Bookmark"))
		{
			JButton bk=new JButton("Bookmark "+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();	
			if(current==9)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}

		for(int i=0,y=1;i<x;i++,y++)
		{
			if(e.getActionCommand().equals("Bookmark "+y))
			{
				if(check())
					count=count+1;
				now=current;
				current=m[y];
				set();
				((JButton)e.getSource()).setEnabled(false);
				current=now;
			}
		}
	
		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			//System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this,"correct answers = "+count);
			System.exit(0);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: The only Indian bowler to take more than 500 Test Wickets ?");
			jb[0].setText("Kapil Dev");jb[1].setText("Zaheer Khan");jb[2].setText("Anil Kumble");jb[3].setText("Harbhajan Singh");	
		}
		if(current==1)
		{
			l.setText("Que2: What was India's rank in Asian Athletic Championship in 2019 ?");
			jb[0].setText("3rd");jb[1].setText("4th");jb[2].setText("2nd");jb[3].setText("1st");
		}
		if(current==2)
		{
			l.setText("Que3: Ryder Cup is associated with which sport ?");
			jb[0].setText("Horse Race");jb[1].setText("Football");jb[2].setText("Cycling");jb[3].setText("Golf");
		}
		if(current==3)
		{
			l.setText("Que4: The term Corner Kick is related to which game ?");
			jb[0].setText("Hockey");jb[1].setText("Football");jb[2].setText("Baseball");jb[3].setText("Volleyball");
		}
		if(current==4)
		{
			l.setText("Que5: Federation Cup is related to ?");
			jb[0].setText("Football");jb[1].setText("Badminton");jb[2].setText("Basketball");jb[3].setText("Throwball");
		}
		if(current==5)
		{
			l.setText("Que6: Which is the national sport of Japan ?");
			jb[0].setText("Karate");jb[1].setText("Judo");jb[2].setText("Wrestling");jb[3].setText("Taekwondo");
		}
		if(current==6)
		{
			l.setText("Que7: Who started the practice of Polo game in India ? ");
			jb[0].setText("Turks");jb[1].setText("Portuguese");jb[2].setText("Greek");jb[3].setText("British");
		}
		if(current==7)
		{
			l.setText("Que8: Which country is the originator of cricket game ?");
			jb[0].setText("India");jb[1].setText("Australia");jb[2].setText("England");jb[3].setText("America");		
		}
		if(current==8)
		{
			l.setText("Que9: What is the number of players in one slide in water polo ?");
			jb[0].setText("9");jb[1].setText("5");jb[2].setText("10");jb[3].setText("7");
		}
		if(current==9)
		{
			l.setText("Que10: Deepika Kumari is associated with ______.");
			jb[0].setText("Archery");jb[1].setText("Boxing");jb[2].setText("Swimming");jb[3].setText("Athletics");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[0].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[1].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[3].isSelected());
		if(current==9)
			return(jb[0].isSelected());
		return false;
	}

}
