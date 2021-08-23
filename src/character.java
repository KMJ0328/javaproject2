import java.awt.*;


import java.awt.event.*;

import javax.swing.ImageIcon;


public class character extends Frame{
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Image img;
	Button b1;
	Checkbox q1cb1,q1cb2,q1cb3,q1cb4,q1cb5,q1cb6,q1cb7,q1cb8,q1cb9;
	Canvas c1;
	TextArea ta,ta1;
	CheckboxGroup g1,g2;
	character (String title){
		super(title);
		img = tk.getImage("images/jeju1.jpg");
		
		setBounds((screenSize.width)/2-350,(screenSize.height)/2-350, 700, 700);
		setLayout(null);
		setBackground(Color.ORANGE);
		this.setResizable(false); // 프레임 확대,축소 안되게 설정!
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e){dispose();}});
		ta = new TextArea("위의 리스트 선택 1\n\n총 2가지만 선택 가능합니다.\n\n아래의 리스트 선택 1",0,0,TextArea.SCROLLBARS_NONE);
		ta.setBounds(20,220,170,70);
		ta.setEditable(false);
		
		ta1 = new TextArea("",0,0,TextArea.SCROLLBARS_NONE);
		ta1.setBounds(50, 630, 600, 50);
		ta1.setEditable(false);
		
		g1 = new CheckboxGroup();
		q1cb1 = new Checkbox("가방",g1,true);
		q1cb1.setBounds(20,20,150,50);
		q1cb2 = new Checkbox("게스트하우스",g1,false);
		q1cb2.setBounds(20,70,150,50);
		q1cb3 = new Checkbox("컴퓨터",g1,false);
		q1cb3.setBounds(20,120,150,50);
		q1cb4 = new Checkbox("호텔",g1,false);
		q1cb4.setBounds(20,170,150,50);
		g2 = new CheckboxGroup();
		q1cb5 = new Checkbox("오픈카",g2,true);
		q1cb5.setBounds(20,280,150,50);
		q1cb6 = new Checkbox("차",g2,false);
		q1cb6.setBounds(20,330,150,50);
		q1cb7 = new Checkbox("오토바이",g2,false);
		q1cb7.setBounds(20,380,150,50);
		q1cb8 = new Checkbox("내 다리",g2,false);
		q1cb8.setBounds(20,430,150,50);
		//c1.jpg는 호화 여행 
		//c2.jpg는 배낭 여행
		//c3.jpg는 차 여행
		//c4.jpg는 오토바이 여행
		//c5.jpg는 온라인 여행
		
		b1 = new Button("ok");
		b1.setBounds(20,490,100,100);
		b1.addActionListener(new  ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			
		
					
			 if(q1cb1.getState() && q1cb2.getState()){
					ta1.setText("배낭 여행 당첨입니다~");
					img = tk.getImage("images/c2.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb3.getState()){
					ta1.setText("온라인 여행 당첨입니다~");
					img = tk.getImage("images/c5.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb4.getState()){
					ta1.setText("차 여행 당첨입니다~");
					img = tk.getImage("images/c3.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb5.getState()){
					ta1.setText("호화 여행 당첨입니다~");
					img = tk.getImage("images/c1.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb6.getState()){
					ta1.setText("차 여행 당첨입니다~");
					img = tk.getImage("images/c3.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb7.getState()){
					ta1.setText("오토바이 여행 당첨입니다~");
					img = tk.getImage("images/c4.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb8.getState()){
					ta1.setText("배낭 여행 당첨입니다~");
					img = tk.getImage("images/c2.jpg");
					c1.repaint();
					
				}else if(q1cb2.getState() && q1cb3.getState()){
					ta1.setText("온라인 여행 당첨입니다~");
					img = tk.getImage("images/c5.jpg");
					c1.repaint();
				}else if(q1cb2.getState() && q1cb5.getState()){
					ta1.setText("호화 여행 당첨입니다~");
					img = tk.getImage("images/c1.jpg");
					c1.repaint();
				}else if(q1cb2.getState() && q1cb6.getState()){
					ta1.setText("차 여행 당첨입니다~");
					img = tk.getImage("images/c3.jpg");
					c1.repaint();
				}else if(q1cb2.getState() && q1cb7.getState()){
					ta1.setText("오토바이 여행 당첨입니다~");
					img = tk.getImage("images/c4.jpg");
					c1.repaint();
				}else if(q1cb2.getState() && q1cb8.getState()){
					ta1.setText("배낭 여행 당첨입니다~");
					img = tk.getImage("images/c2.jpg");
					c1.repaint();
					
					
				}else if(q1cb4.getState() && q1cb5.getState()){
					ta1.setText("호화 여행 당첨입니다~");
					img = tk.getImage("images/c1.jpg");
					c1.repaint();
				}else if(q1cb4.getState() && q1cb6.getState()){
					ta1.setText("차 여행 당첨입니다~");
					img = tk.getImage("images/c3.jpg");
					c1.repaint();
				}else if(q1cb4.getState() && q1cb7.getState()){
					ta1.setText("오토바이 여행 당첨입니다~");
					img = tk.getImage("images/c4.jpg");
					c1.repaint();
				}else if(q1cb4.getState() && q1cb8.getState()){
					ta1.setText("배낭 여행 당첨입니다~");
					img = tk.getImage("images/c2.jpg");
					c1.repaint();
					
				}else {
					ta1.setText("온라인 여행 당첨입니다~");
					img = tk.getImage("images/c5.jpg");
					c1.repaint();
				}
				}}); 
		
		c1 = new Canvas(){
	           public void paint (Graphics g) {
	               g.drawImage(img,  0,  0,  this);
	            }
	         };
		c1.setBounds(200,50,450,550);
		c1.setBackground(Color.blue);
		
		
		
		add(c1);add(b1);add(ta);add(ta1);
		add(q1cb1);add(q1cb2);add(q1cb3);add(q1cb4);add(q1cb5);add(q1cb6);add(q1cb7);add(q1cb8);
		setVisible(true);
	}
	
	
	

}
