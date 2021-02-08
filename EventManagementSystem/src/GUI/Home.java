import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class Home extends JFrame implements ActionListener
{
		JPanel panel;
		JLabel lbl1, lbl2,lbl3,lbl4;
		JButton corporate, birthday, kids, social, wedding;

		public Home(){
		super("Home Page");
		setSize(1000,1000);
		setVisible(true);


		//--------------------------------------------------Adding the panel---------------------------------------
		panel = new JPanel();
		add(panel);
		panel.setLayout(null);

		// ---------------------------------------------Adding the label objects-----------------------------------
		lbl1 = new JLabel("Make Merry Events");
		lbl2 = new JLabel("We don't just say, we make it happen!!");
		lbl3 = new JLabel("..........................................");

		//-----------------------------------------Initialising font types-----------------------------------------
		Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,40);
		Font f2=new Font("Calibri",Font.BOLD,20);
		Font f3=new Font("Times New Roman",Font.ITALIC,40);

		//----------------------------------------setting the label fonts-----------------------------------------
		lbl1.setFont(f1);
		lbl2.setFont(f2);
		lbl3.setFont(f3);

		//-----------------------setting the foreground and background colours for the objects---------------------
		lbl1.setForeground(new Color(178,34,34));
		panel.setBackground(new Color(255,204,204));
		lbl2.setForeground(new Color(205,92,92));
		lbl3.setForeground(new Color(178,34,34));

		//-------------------------------Positioning and sizing the objects----------------------------------------
		lbl1.setBounds(370,30,900,70);
		lbl2.setBounds(700,40,900,60);
		lbl3.setBounds(480,100,1000,50);

		//------------------------------Adding the objects to the panel-------------------------------------------
		panel.add(lbl1);
		panel.add(lbl12);
		panel.add(lbl13);

		//---------------------------------------- body ----------------------------------------------------------
		lbl4 = new JLabel("EVENTS");
		Font f4 = new Font("Gabriola",Font.BOLD,40);
		lbl14.setFont(f4);
		lbl14.setForeground(Color.black);
		lbl14.setBounds(630,0,200,400);
		panel.add(lbl14);

		//------------------------------------------------Adding the buttons and their actions-----------------------
		//Corporate Button:----------------------------------
		JButton corporate = new JButton("Corporate Events");
		corporate.setBounds(200,300,200,30);
		panel.add(corporate);
		corporate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				panel.setVisible(false);
	      Corporate c=new Corporate();
				c.setVisible(true);
	    }
	  });

		//Birthday Button:-----------------------------------
		JButton birthday = new JButton("Birthday Events");
		birthday.setBounds(500,300,250,30);
		panel.add(birthday);
		birthday.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent f)
			{
					panel.setVisible(false);
		      Birthday b=new Birthday();
					b.setVisible(true);
	    }
	  });

		//Kids Button:-------------------------------------
		JButton kids = new JButton("Kids Events");
		kids.setBounds(800,300,250,30);
		panel.add(kids);
		kids.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent g)
			{
				panel.setVisible(false);
	      Kids k=new Kids();
				k.setVisible(true);
	    }
	  });

		//Social Button:----------------------------------
		JButton social = new JButton("Social Events");
		social.setBounds(300,400,250,30);
		panel.add(social);
		social.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent g)
			{
				panel.setVisible(false);
	      Social s=new Social();
				s.setVisible(true);
	    }
	  });

		//Wedding Button:-----------------------------------
		JButton wedding = new JButton("Wedding Events");
		wedding.setBounds(700,400,250,30);
		panel.add(wedding);
		wedding.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent h)
			{
				panel.setVisible(false);
	      Wedding w=new Wedding();
				w.setVisible(true);
	    }
	  });

		//-------------------------------------------- Footer ----------------------------------------------------

	}
	public static void main(String[] args)
	{
		Home h = new Home();
	}
}

public void actionPerformed(ActionEvent e){

	/*if(e.getSource()==corporate){
		corporate.setText("Clicked");
	}*/

	/*if(e.getSource()==corporate){
		panel.setVisible(false);
		Corporate c=new Corporate();
		c.setVisible(true);
	}
	if(e.getSource()==wedding){
		Wedding w=new Wedding();
		this.dispose();
	}*/
	/*if(e.getSource()==birthday){
		Birthday b=new Birthday();
		this.dispose();
	}
	if(e.getSource()==kids){
		Kids k=new Kids();
		this.dispose();
	}
	if(e.getSource()==corporate){
		Social s=new Social();
		this.dispose();
	}*/
}
