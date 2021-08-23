import java.awt.*;


import java.awt.event.*;


public class RandomImage extends Frame{
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Canvas c1,c2,c3;
	Panel p1; 
	TextArea ta;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 15);
	Font f2 = new Font("Serif",Font.BOLD, 15);
	Font f3 = new Font("Serif",Font.BOLD, 20);
	//Image img1 �κ�
	Image img = tk.getImage("images/imgt.jpg");
	Image im1,img2,img3;
	//Image img1 = tk.getImage("images/img2.gif");
	//Image img2 = tk.getImage("images/img2.gif");
	//Image img3 = tk.getImage("images/img3.gif");
	Button b1,b2,b3,b4;
	
	RandomImage(String title){ 
		super(title);
		
		// �������� ȭ�� �߾ӿ� ���̱�
				
				
				setBounds((screenSize.width)/2-350, 
						(screenSize.height)/2-350, 700, 700);
				setLayout(null);
				// �ݱ�x ��ư �̺�Ʈ ó��
				addWindowListener(new WindowAdapter() { 
					public void windowClosing(WindowEvent e) { 
						dispose(); // ���α׷� ���� 
					}
				});
			
		
				//Canvas �κ�
		c1 = new Canvas(){
			public void paint(Graphics g){
				g.drawImage(img,0,0,this);
			}
		};
		c1.setBackground(Color.white);
		c1.setBounds(50,50,360,360);
		//c1.repaint();
		
				// ��ư �κ�
		
		b1 = new Button("�Դ� ����� �غ�");
		b1.addActionListener(new EventCanvas());
		b1.setBackground(Color.GREEN);
		b1.setFont(f2);
		b2 = new Button("���� �ؼ�����");
		b2.addActionListener(new EventCanvas());
		b2.setBackground(Color.GREEN);
		b2.setFont(f2);
		b3 = new Button("��ȭ �ؼ�����");
		b3.addActionListener(new EventCanvas());
		b3.setBackground(Color.GREEN);
		b3.setFont(f2);
		b4 = new Button("���� �غ�!!");
		b4.addActionListener(new EventCanvas());
		b4.setBackground(Color.GREEN);
		b4.setFont(f1);
		
		// TextArea �κ� //
		
				ta = new TextArea("�ڹ� AWT ",0,0,TextArea.SCROLLBARS_NONE); // 1. �̺�Ʈ �ҽ�
				
				//ta.addActionListener(new EventMoney());
				ta.setBackground(Color.WHITE);
				ta.setFont(f3);
				ta.setBounds(50,450,500,200);
				ta.setEditable(false);
		
				// Panel �κ�
		p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		p1.setBounds(300,50,360,360);
		p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);
		// �����ӿ� ������Ʈ,�����̳� ���̱�
	    add(c1);add(p1);add(ta);
	
		setVisible(true);
	}
	
	class EventCanvas implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			Button b = (Button)e.getSource();
			int r = (int)(Math.random()*3);
			String imgArr[] = {"images/tr1.jpg","images/tr2.jpg","images/tr3.jpg"};
			
			if(b.getLabel() == "�Դ� ����� �غ�"){
			//    img = tk.getImage("images/img1.gif");
				ta.setText("���� �ÿܹ����͹̳����� ���� �� 14km ������ ������, "
						+ "��ȸ�����ֵ���(12������)���� ��ġ�� �־� ������ �ſ� ���ϴ�."
						+ "������� ���̴� 900m, �ʺ� 120m, ��� ���� 1.2m,"
						+ " ��絵�� 5���� ������ ���� ��� ��簡 �ϸ��Ͽ� ������ ���� "
						+ "�ٴ幰�� �㸮����� �ۿ� �ȵǱ� ������ ���̵�� �Բ� �ؼ����� �ϱ⿡ �����ϸ�, "
						+ "�ٴٰ� ������鼭 ������ �Ͼ� �л����� ��ġ ��ȣ �ٴٿ� ���� ���� �ٴ幰�� ����� ������ �����.");
				img = tk.getImage(imgArr[0]);
				c1.repaint(); 
			}else if(b.getLabel() == "���� �ؼ�����"){
			//    img = tk.getImage("images/img2.gif");
				ta.setText("�����ؼ������� ��簡 �ϸ��� ������ ���, "
						+ "�ҳ��� ���� �־ ��̰� �ִ� ���� ���� ���ఴ�� �ް����� ����."
						+ " �������� �پ��� ī��� ����"
						+ ", ���ҵ��� �ְ�, �ֺ� �������δ� �Ѹ�����, "
						+ "�ݴ��ؼ�����, �ݴɼ�����, ���ɼ������ڻ��� ���� �ִ�.");
				img = tk.getImage(imgArr[1]);
				c1.repaint();
			}else if(b.getLabel() == "��ȭ �ؼ�����"){
			//	img = tk.getImage("images/img3.gif");
				ta.setText("��ȭ�ؼ������� 1980�� ����� �ؼ��������� �Ը�� �׸� ũ�� ������ �ڹ�Ʈ �� ���� �ٴ� ������ ��ô�̳� ���� ���Դϴ�. "
						+ "�� 30~40�� ������ �ؼ������� 200�� ���� ���� �������� �αٿ� ��ȭ���� ��ġ�ϰ� �־� ���� ���ڽü��� ��Ÿ ���� �ü� �̿��� ������ ���Դϴ�.");
				img = tk.getImage(imgArr[2]);
				c1.repaint();
			}else {
				ta.setText("�������� ���� �غ����� ���������~~");
				img = tk.getImage(imgArr[r]);
				c1.repaint();
			}
			
		}
		
	}
	
	

}
