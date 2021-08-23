import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Back extends JPanel {
	private int nCase;
	
	Point pos = new Point(100,100); // �����͸� ����
	
	Back(){
		nCase = 0;
	}
	
	public void setnCase(int n) {//public Ŭ�������� �޾ƿ� ���� nCase�� �־���
		this.nCase = n; 
		this.repaint();
	}

	public void paintComponent(Graphics g){
		Image img = Toolkit.getDefaultToolkit().getImage("images/Travel/jeju.png"); // ����̹���
		g.drawImage(img, 0, 0, this);
		// money �̹��� 
		Image Money = Toolkit.getDefaultToolkit().getImage("images/Travel/Money.jpg"); // �̹��� �־���
		// Bag �̹���
		Image Bag = Toolkit.getDefaultToolkit().getImage("images/Travel/Bag.jpg"); // �̹����� �־���
		// ���ڳ�� Ƽ�� �̹���
		Image Ticket = Toolkit.getDefaultToolkit().getImage("images/Travel/airticket.jpg"); // �̹����� �־���
		// �Խ�Ʈ �Ͽ콺 �̹��� �κ�
		Image GuestHouse = Toolkit.getDefaultToolkit().getImage("images/Travel/GuestHouse.jpg"); // �̹����� �־���
		// ĳ���� �̹��� �κ�
		Image img1 = Toolkit.getDefaultToolkit().getImage("images/Travel/Carrier.jpg"); // �̹����� �־���
		// ȣȭ ���� ����Ʈ  �̹����κ�
		
		Image img1_1 = Toolkit.getDefaultToolkit().getImage("images/Travel/Firstairticket.jpg"); // �̹����� �־���
		Image img1_2 = Toolkit.getDefaultToolkit().getImage("images/Travel/HotelSinla.jpg"); // �̹��� �־���
		Image img1_3 = Toolkit.getDefaultToolkit().getImage("images/Travel/OpenCar.jpg"); // �̹��� �־���
		
		//�賶���� ����Ʈ  �̹����κ�
		Image img2 = Toolkit.getDefaultToolkit().getImage("images/Travel/Ship.jpg"); // �̹����� �־���
		
		//������� ���� ����Ʈ �̹��� �κ�
		Image img3 = Toolkit.getDefaultToolkit().getImage("images/Travel/Ot.jpg"); // �̹����� �־���
		
		// �� ���� ����Ʈ �̹��� �κ�
		Image img4 = Toolkit.getDefaultToolkit().getImage("images/Travel/Car.jpg"); // �̹����� �־���
		Image img4_1 = Toolkit.getDefaultToolkit().getImage("images/Travel/Hotel.jpg"); // �̹����� �־���
		
		// �¶��� ���� ����Ʈ �̹��� �κ�
		Image img5 = Toolkit.getDefaultToolkit().getImage("images/Travel/Computer.jpg"); // �̹����� �־���
		
		switch(nCase){ // nCase�� ���� case�� ����
		case 1 : 
			g.drawImage(img1, 20, 20, this); // �̹����� �׷���
			g.drawImage(img1_1, 240, 20, this);
			g.drawImage(img1_2, 20, 230, this);
			g.drawImage(img1_3, 240, 230, this);
			g.drawImage(Money, 370, 150, this);
			break;
		case 2 : 
			
			g.drawImage(Bag, 20, 20, this);
			g.drawImage(GuestHouse, 240, 20, this);
			g.drawImage(img2, 100, 230, this);
			g.drawImage(Money, 300, 230, this);
			
			break;
		case 3 : 
			g.drawImage(img3, 20, 20, this);
			g.drawImage(Bag, 240, 20, this);
			g.drawImage(GuestHouse, 20, 230, this);
			g.drawImage(Ticket, 240, 230, this);
				g.drawImage(Money, 370, 150, this);
			break;
		case 4 : 
			g.drawImage(img4, 20,20, this);
			g.drawImage(img4_1, 240,20, this);
			g.drawImage(Ticket, 20,230, this);
			g.drawImage(img1, 240,230, this);
			g.drawImage(Money, 370,150, this);
			break;
		case 5 : 
			g.drawImage(img5, 20, 100, this);
			
			break;
		}
	}
}

public class Travel extends JFrame {
	Back bk = new Back();
	
	public Travel(String title) {
		super(title);
		this.setIconImage(new ImageIcon("images/icon1.png").getImage());
		this.addWindowListener(new WindowAdapter(){ // �ݱ�
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
		
		
		// ������ �߾ӿ� ��ġ��Ű��
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize(); // ȭ���� �ʺ�� ���̸� ����
		setBounds(screenSize.width/2-325, screenSize.height/2-250, 650, 500);

		this.setTitle("Travel list");
		this.setVisible(true);

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5,1)); // ��ư�� �׸��巹�̾ƿ����� �迭�� ����
		ButtonGroup grp = new ButtonGroup();
		
		JRadioButton rb1 = new JRadioButton("ȣȭ ���� �غ� ����Ʈ");
		JRadioButton rb2 = new JRadioButton("�賶���� �غ� ����Ʈ");
		JRadioButton rb3 = new JRadioButton("������� �غ� ����Ʈ");
		JRadioButton rb4 = new JRadioButton("�� �غ� ����Ʈ");
		JRadioButton rb5 = new JRadioButton("�¶��� �غ� ����Ʈ");
		
		jp.setBackground(Color.white);
		rb1.setBackground(Color.white);
		rb2.setBackground(Color.white);
		rb3.setBackground(Color.white);	
		rb4.setBackground(Color.white);
		rb5.setBackground(Color.white);	
		
	    grp.add(rb1);
	    grp.add(rb2);
	    grp.add(rb3);
	    grp.add(rb4);
	    grp.add(rb5);

	    jp.add(rb1);
	    jp.add(rb2);
	    jp.add(rb3);
	    jp.add(rb4);
	    jp.add(rb5);

	    rb1.addActionListener(al); // �׼Ǹ����� �߰�
		rb2.addActionListener(al);
		rb3.addActionListener(al); 
		rb4.addActionListener(al);
		rb5.addActionListener(al); 
	    
	    JPanel menu = new JPanel();
	    menu.setLayout(new BorderLayout());
	    menu.add(jp, BorderLayout.CENTER);
	    
	    Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		ct.add(menu, BorderLayout.EAST);
		ct.add(bk, BorderLayout.CENTER);
	}
	
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {  	
			if(e.getActionCommand().equals("ȣȭ ���� �غ� ����Ʈ")) { // ���� ��ư�� Ʈ��1�� ������ Back��setnCase�� ��
				System.out.println("ȣȭ ���� �غ� ����Ʈ");
				bk.setnCase(1);
	    	} else if (e.getActionCommand().equals("�賶���� �غ� ����Ʈ")) {
	    		System.out.println("�賶���� �غ� ����Ʈ");
		   		bk.setnCase(2);
		   	} else if (e.getActionCommand().equals("������� �غ� ����Ʈ")) {
	    		System.out.println("������� �غ� ����Ʈ");
		   		bk.setnCase(3);
		   	} else if (e.getActionCommand().equals("�� �غ� ����Ʈ")) {
	    		System.out.println("�� �غ� ����Ʈ");
		   		bk.setnCase(4);
		   	} else if (e.getActionCommand().equals("�¶��� �غ� ����Ʈ")) {
	    		System.out.println("�¶��� �غ� ����Ʈ");
		   		bk.setnCase(5);
		   	}
		}
	};
}
