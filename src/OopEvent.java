import java.awt.*;



import java.awt.event.*;








public class OopEvent extends Frame{
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Canvas c1;
	Panel p1; 
	Label l1;
	TextArea ta;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	Image img = tk.getImage("images/help.jpg");
	Image im1,img2,img3;
	Button b1,b2,b3,b4;
	OopEvent(String title){
		
		super(title);
		
		
		// �������� ȭ�� �߾ӿ� ���̱�
				
				setBounds(screenSize.width/2-300,screenSize.height/2-450,600,900);
				setLayout(null);
				
				// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
				this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
					public void windowClosing(WindowEvent e) { // �������̵�
						dispose(); // ���α׷� ����
					}
				});
				this.setResizable(false); // ������ Ȯ��,��� �ȵǰ� ����!
				//Canvas �κ�
				c1 = new Canvas(){
					public void paint(Graphics g){
						g.drawImage(img,0,0,this );
					}
				};
				c1.setBackground(Color.blue);
				c1.setBounds(50,525,500,360);
		// Label ���� �κ� //
		l1 = new Label("Ŀ�� �̹��� ���̱�");
		l1.setFont(f1);
		l1.setBounds(20,10,550,100);
		l1.setAlignment(Label.CENTER);
		l1.setBackground(Color.blue);
		l1.setForeground(Color.white);
		// Button �κ� //
		b1 = new Button("�Ƹ޸�ī��");	
	
		b2 = new Button("ī���");
		
		b3 = new Button("īǪġ��");
	
		b4 = new Button("����������");
		
		

		// TextArea �κ� //
		
		ta = new TextArea("��ư�� Ŭ���ϼ���",0,0,TextArea.SCROLLBARS_NONE); // 1. �̺�Ʈ �ҽ�
		
		//ta.addActionListener(new EventMoney());
		ta.setBackground(Color.ORANGE);
		ta.setFont(f1);
		ta.setBounds(20,120,450,400);
		ta.setEditable(false);
		// ��ư �̺�Ʈ ������//
				b1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Button b = (Button)e.getSource();
						ta.setText("�Ƹ޸�ī��");
						img = tk.getImage("images/img1.jpg");
						c1.repaint();
						}
				});
				b2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Button b = (Button)e.getSource();
						ta.setText("ī���");
						img = tk.getImage("images/img2.jpg");
						c1.repaint();
						}
				});
				b3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Button b = (Button)e.getSource();
						ta.setText("īǪġ��");
						img = tk.getImage("images/img3.jpg");
						c1.repaint();
						}
				});
				b4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Button b = (Button)e.getSource();
						ta.setText("����������");
						img = tk.getImage("images/img4.jpg");
						c1.repaint();
						}
				});
			
				
		
		
		// �г� p1 �κ� //
		p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		p1.setBounds(470,120,100,400);
		p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);
		
		
		
		
		add(c1);
		add(l1);add(ta);add(p1);
		setVisible(true);
	}
	
	
	

}
