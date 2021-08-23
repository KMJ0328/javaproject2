import java.awt.*;


import java.awt.event.*;

import javax.swing.ImageIcon;

public class TravelList extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Panel p1;
	
	TextArea ta;
	Canvas c1,li;
	List l1;
	Image imgt = tk.getImage("images/imgt.jpg");
	Image imgj = tk.getImage("images/Jeju.jpg");
	Image img = tk.getImage("images/Travel.jpg");
	Image im1,img2,img3;
	
	Font f1 = new Font("Serif",Font.BOLD+Font.HANGING_BASELINE, 25);
	TravelList(String title){
		super(title);
		
		setBounds((screenSize.width)/2-350,(screenSize.height)/2-350, 700, 700);
		setLayout(null);
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e){dispose();}});
		this.setResizable(false); // ������ Ȯ��,��� �ȵǰ� ����!
		//  �κ�
				li = new Canvas(){
			           public void paint (Graphics g) {
			               g.drawImage(imgj,  0,  0,  this);
			            }
			         };
				li.setBounds(20,280,200,150);
				
		// Canvas �κ� //
		c1 = new Canvas() {
	           public void paint (Graphics g) {
	               g.drawImage(imgt,  0,  0,  this);
	            }
	         };

		c1.setBounds(260,50,410,400);
		c1.setBackground(Color.blue);
		//            List �κ� //
		l1 = new List(5);
		l1.add("�Դ� ����� �غ�");
		l1.add("���� �ؼ�����");
		l1.add("������ �غ�");
		l1.add("��ȭ �ؼ�����");
		l1.add("��ȣ�׿� �غ�");
		l1.setBounds(20,50,200,160);
		l1.setFont(f1);
		l1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 List l1 = (List)e.getSource();
		  String data = l1.getItem(l1.getSelectedIndex());
		  if(data == "�Դ� ����� �غ�"){
			  ta.setText("�Դ� ����� �غ��Դϴ�.");
			  imgt = tk.getImage("images/tr1.jpg");
			  c1.repaint();
		  }else if (data == "���� �ؼ�����"){
			  ta.setText("���� �ؼ������Դϴ�.");
			  imgt = tk.getImage("images/tr2.jpg");
			  c1.repaint();
		  }else if (data == "������ �غ�"){
			  ta.setText("������ �غ��Դϴ�.");
			  imgt = tk.getImage("images/tr3.jpg");
			  c1.repaint();
		  }else if (data == "��ȭ �ؼ�����"){
			  ta.setText("��ȭ �ؼ������Դϴ�.");
			  imgt = tk.getImage("images/tr4.jpg");
			  c1.repaint();
		  }else {
			  ta.setText("��ȣ�׿� �غ��Դϴ�.");
			  imgt = tk.getImage("images/tr5.jpg");
			  c1.repaint();
		  }
				
			}
		});
		
		
		
		// TextArea �κ� //
		
		ta = new TextArea("���� �κ�",0,0,TextArea.SCROLLBARS_NONE); // 1. �̺�Ʈ �ҽ�
				
		
		ta.setBackground(Color.ORANGE);
		ta.setFont(f1);
		ta.setBounds(20,480,650,200);
		ta.setEditable(false);
		
		
		// �����ӿ� ������Ʈ ���̱� //
		add(l1); add(c1); add(ta);add(li);
		
		setVisible(true);
	}
	public void paint(Graphics g){
		
		if(img == null){
			return;
		}
		
		g.drawImage(img,0,0,this);
	}
	
	

}
