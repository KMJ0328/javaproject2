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
		this.setResizable(false); // ������ Ȯ��,��� �ȵǰ� ����!
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e){dispose();}});
		ta = new TextArea("���� ����Ʈ ���� 1\n\n�� 2������ ���� �����մϴ�.\n\n�Ʒ��� ����Ʈ ���� 1",0,0,TextArea.SCROLLBARS_NONE);
		ta.setBounds(20,220,170,70);
		ta.setEditable(false);
		
		ta1 = new TextArea("",0,0,TextArea.SCROLLBARS_NONE);
		ta1.setBounds(50, 630, 600, 50);
		ta1.setEditable(false);
		
		g1 = new CheckboxGroup();
		q1cb1 = new Checkbox("����",g1,true);
		q1cb1.setBounds(20,20,150,50);
		q1cb2 = new Checkbox("�Խ�Ʈ�Ͽ콺",g1,false);
		q1cb2.setBounds(20,70,150,50);
		q1cb3 = new Checkbox("��ǻ��",g1,false);
		q1cb3.setBounds(20,120,150,50);
		q1cb4 = new Checkbox("ȣ��",g1,false);
		q1cb4.setBounds(20,170,150,50);
		g2 = new CheckboxGroup();
		q1cb5 = new Checkbox("����ī",g2,true);
		q1cb5.setBounds(20,280,150,50);
		q1cb6 = new Checkbox("��",g2,false);
		q1cb6.setBounds(20,330,150,50);
		q1cb7 = new Checkbox("�������",g2,false);
		q1cb7.setBounds(20,380,150,50);
		q1cb8 = new Checkbox("�� �ٸ�",g2,false);
		q1cb8.setBounds(20,430,150,50);
		//c1.jpg�� ȣȭ ���� 
		//c2.jpg�� �賶 ����
		//c3.jpg�� �� ����
		//c4.jpg�� ������� ����
		//c5.jpg�� �¶��� ����
		
		b1 = new Button("ok");
		b1.setBounds(20,490,100,100);
		b1.addActionListener(new  ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			
		
					
			 if(q1cb1.getState() && q1cb2.getState()){
					ta1.setText("�賶 ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c2.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb3.getState()){
					ta1.setText("�¶��� ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c5.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb4.getState()){
					ta1.setText("�� ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c3.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb5.getState()){
					ta1.setText("ȣȭ ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c1.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb6.getState()){
					ta1.setText("�� ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c3.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb7.getState()){
					ta1.setText("������� ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c4.jpg");
					c1.repaint();
				}else if(q1cb1.getState() && q1cb8.getState()){
					ta1.setText("�賶 ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c2.jpg");
					c1.repaint();
					
				}else if(q1cb2.getState() && q1cb3.getState()){
					ta1.setText("�¶��� ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c5.jpg");
					c1.repaint();
				}else if(q1cb2.getState() && q1cb5.getState()){
					ta1.setText("ȣȭ ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c1.jpg");
					c1.repaint();
				}else if(q1cb2.getState() && q1cb6.getState()){
					ta1.setText("�� ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c3.jpg");
					c1.repaint();
				}else if(q1cb2.getState() && q1cb7.getState()){
					ta1.setText("������� ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c4.jpg");
					c1.repaint();
				}else if(q1cb2.getState() && q1cb8.getState()){
					ta1.setText("�賶 ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c2.jpg");
					c1.repaint();
					
					
				}else if(q1cb4.getState() && q1cb5.getState()){
					ta1.setText("ȣȭ ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c1.jpg");
					c1.repaint();
				}else if(q1cb4.getState() && q1cb6.getState()){
					ta1.setText("�� ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c3.jpg");
					c1.repaint();
				}else if(q1cb4.getState() && q1cb7.getState()){
					ta1.setText("������� ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c4.jpg");
					c1.repaint();
				}else if(q1cb4.getState() && q1cb8.getState()){
					ta1.setText("�賶 ���� ��÷�Դϴ�~");
					img = tk.getImage("images/c2.jpg");
					c1.repaint();
					
				}else {
					ta1.setText("�¶��� ���� ��÷�Դϴ�~");
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
