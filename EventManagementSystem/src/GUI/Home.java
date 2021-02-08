import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class Home extends JFrame implements ActionListener{

	JPanel pnl,events;
	JLabel lbl,lbl2,lbl3,lbl4;
	JButton corporate,birthday,kids,social,wedding;
	JButton blogin,bregister;
	ImageIcon corp,birth,kid,weds,soc;

	public Home(){
		super("Home Page");
		setSize(700,700);
		setVisible(true);


		//------ heading ----------
		pnl=new JPanel();
		add(pnl);
		pnl.setLayout(null);

		lbl=new JLabel("Make Merry Events");
		lbl2=new JLabel("<html><p><br>We don't just say, we make it happen!!</p></html>");
		lbl3=new JLabel("..........................................");

		Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,40);
		Font f2=new Font("Calibri",Font.BOLD,20);
		Font f3=new Font("Times New Roman",Font.ITALIC,40);

		lbl.setFont(f1);
		lbl2.setFont(f2);
		lbl3.setFont(f3);

		lbl.setForeground(new Color(178,34,34));
		pnl.setBackground(new Color(255,204,204));
		lbl2.setForeground(new Color(205,92,92));
		lbl3.setForeground(new Color(178,34,34));

		lbl.setBounds(370,30,900,70);
		lbl2.setBounds(700,40,900,60);
		lbl3.setBounds(480,100,1000,50);

		pnl.add(lbl);
		pnl.add(lbl2);
		pnl.add(lbl3);		

		//-------- body ---------
		lbl4=new JLabel("EVENTS");
		Font f4=new Font("Gabriola",Font.BOLD,40);
		lbl4.setFont(f4);
		lbl4.setForeground(Color.black);
		lbl4.setBounds(630,0,200,400);
		pnl.add(lbl4);

		ImageIcon corp=new ImageIcon("E:/jdk1.8.0_271/bin/corporate1.jpg");
		//pnl.add(corp);
		JLabel lbl5=new JLabel(corp);
		pnl.add(lbl5);
		//ImageIcon corp=new ImageIcon("C:\\Users\\Home\\Desktop\\images\\corporate1.png");
		//ImageIcon weds=new ImageIcon("C:\\Users\\Home\\Desktop\\images\\wedding1.jpg");
		//ImageIcon kid=new ImageIcon("C:\\Users\\Home\\Desktop\\images\\birthday1.jpg");
		//ImageIcon soc=new ImageIcon("C:\\Users\\Home\\Desktop\\images\\social.jpg");
		//ImageIcon birth=new ImageIcon("C:\\Users\\Home\\Desktop\\images\\birthday2.jpg");
		//GridLayout gl=new GridLayout(2,3);
		//events=new JPanel(gl);
		//corporate=new JButton();
		//corporate.setIcon(new ImageIcon("C:\\Users\\Home\\Desktop\\images\\corporate1.jpg"));
		//wedding=new JButton(weds);
		//kids=new JButton(kid);
		//social=new JButton(soc);
		//birthday=new JButton(birth);
		//events.add(corporate);
		//pnl.add(wedding);
		//pnl.add(kids);
		//pnl.add(social);
		//pnl.add(birthday);
		//validate();
		//JLabel corpl=new JLabel("Corporate");
		//corpl.setBounds(200,100,300,200);
		//pnl.add(corpl);

		JButton corporate=new JButton("Corporate Events");
		corporate.setBounds(200,300,200,30);
		pnl.add(corporate);
		corporate.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				pnl.setVisible(false);
	            Corporate c=new Corporate();
				c.setVisible(true);  
        	}  
    	});
		
		JButton birthday=new JButton("Birthday Events");
		birthday.setBounds(500,300,250,30);
		pnl.add(birthday);
		birthday.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				pnl.setVisible(false);
	            Birthday b=new Birthday();
				b.setVisible(true);  
        	}  
    	});

		JButton kids=new JButton("Kids Events");
		kids.setBounds(800,300,250,30);
		pnl.add(kids);
		kids.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				pnl.setVisible(false);
	            Kids k=new Kids();
				k.setVisible(true);  
        	}  
    	});

		JButton social=new JButton("Social Events");
		social.setBounds(300,400,250,30);
		pnl.add(social);
		social.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				pnl.setVisible(false);
	            Social s=new Social();
				s.setVisible(true);  
        	}  
    	});

		JButton wedding=new JButton("Wedding Events");
		wedding.setBounds(700,400,250,30);
		pnl.add(wedding);
		wedding.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				pnl.setVisible(false);
	            Wedding w=new Wedding();
				w.setVisible(true);  
        	}  
    	});

		//----------- Footer -------------
		 
	}

	public void actionPerformed(ActionEvent e){

		/*if(e.getSource()==corporate){
			corporate.setText("Clicked");
		}*/

		/*if(e.getSource()==corporate){
			pnl.setVisible(false);
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

	public static void main(String[] args){
		Home h=new Home();
	}
}