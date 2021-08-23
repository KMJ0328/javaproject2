import java.awt.*;


import java.awt.event.*;

import javax.swing.ImageIcon;


public class FirstMenu extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Image img;
	
	FirstMenu(String title){
		super(title);
		
		img = tk.getImage("images/java.jpg");
		setIconImage(new ImageIcon("images/icon.png").getImage());
		
		
		setBounds((screenSize.width)/2-350,(screenSize.height)/2-350, 700, 700);
		setLayout(null);
		this.setResizable(false); // ������ Ȯ��,��� �ȵǰ� ����!
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e){System.exit(0);}});
		// �޴� �κ� //
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("Ȩ");
		Menu m2 = new Menu("���ã��");
		Menu m3 = new Menu("���α׷�");
		Menu m4 = new Menu("���� ĳ����");
		Menu m5 = new Menu("����");
		
		
		
		
				//	�޴� m1�� ������ 
				MenuItem m11 = new MenuItem("����", new MenuShortcut('O',true));
				MenuItem m12 = new MenuItem("�μ�");
				Menu m13 = new Menu("��Ÿ");
				Menu m30 = new Menu("Ŀ�� ���α׷�");
				//	�޴� m2�� ������ 
				
				
				
				//	�޴� m3�� ������ 				
				MenuItem m31 = new MenuItem("Ŀ�� ���Ǳ� ���α׷�");
				m31.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new OopEvent("Ŀ�� ���Ǳ� ���α׷�");}});
				
				MenuItem m32 = new MenuItem("���ֵ� �غ� ����Ʈ ���α׷�");
				m32.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new TravelList("���ֵ� �غ� ����Ʈ ���α׷�");}});
				
				MenuItem m33 = new MenuItem("���� ���� ���α׷�");
				m33.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new ColorEvent_Test("���� ���� ���α׷�");}});
				
				MenuItem m34 = new MenuItem("ä�� ���α׷�");
				m34.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new ChatEvent_Test("ä�� ���α׷�");}});
				
				MenuItem m35 = new MenuItem("���� �غ� ����Ʈ���α׷�");
				m35.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new Travel ("���� �غ� ����Ʈ���α׷�");}});
				
				MenuItem m36 = new MenuItem("���콺�� �׸��׸��� ���α׷�");
				m36.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new DrawGraphics("���콺�� �׸��׸��� ���α׷�");}});
				
				MenuItem m37 = new MenuItem("���� �غ� �̹��� ���α׷�");
				m37.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new RandomImage("���� �غ� �̹��� ���α׷�");}});
				
				MenuItem m38 = new MenuItem("Ŀ�� ������ ���� ���α׷�");
				m38.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new CoffeeP("Ŀ�� ������ ���� ���α׷�");}});
				
				MenuItem m39 = new MenuItem("�޴� �׼� ���α׷�");
				m39.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new MenuActionEventEx();}});
				
				MenuItem m40 = new MenuItem("������ ���α׷�");
				m40.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new ABCOAB("������ ���α׷�");}});
				
				MenuItem m42 = new MenuItem("üũ �̺�Ʈ ��������");
				m42.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new CheckEventPractice();}});
				
				//�޴� m4�� ������
				MenuItem m43 = new MenuItem("���� ���°� ���ϱ� ĳ���� ���α׷�");
				m43.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new character("���� ���°� ���ϱ� ĳ���� ���α׷�");}});
				
				//�޴� m5�� ������ 
				MenuItem m41 = new MenuItem("Help");
				m41.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new Help("Help");}});
				
				
				
				// �޴� m14�� �ݱ� ����Ű ����
				MenuItem m14 = new MenuItem("�ݱ�", new MenuShortcut('E'));
				m14.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
		System.exit(0);}});
		
				// �޴� m1�� ������ �߰�
				m1.add(m11);m1.add(m12);m1.add(m13);
				m1.addSeparator();//���� �߰�
				m1.add(m14);
				// �޴� m2 ���ã�⿡ ���־��� ���α׷� �߰�//
				m2.add(m35);
				m2.add(m32);
				// �޴� m3�� ������ �߰�
				m3.add(m30);
				m30.add(m31); m3.add(m33);m3.add(m34);
				m3.add(m36);m2.add(m37);m30.add(m38);m3.add(m39);
				m3.add(m40);
				m3.add(m42);
				
				//�޴� m4�� ������ �߰�
				m4.add(m43);
				// �޴� m5�� ������ �߰�
				m5.add(m41);
				
		// �޴� �ٿ� �޴� ���̱� //
		mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);mb.add(m5);
		
		// �����ӿ� ������Ʈ ���̴� �κ�//
		setMenuBar(mb); // �����ӿ� �޴��� ���̱�
		
		
		
		setVisible(true);
	}
	
	public void paint(Graphics g){
		int imgWidth =img.getWidth(this);
		int imgHeight =img.getHeight(this);
		
		
			g.drawImage(img, (this.getWidth()-imgWidth),(this.getHeight()-imgHeight),this);
		}
	
	class Event111 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		new FirstMenu("KMJ �ڹ� ������Ʈ");
		
	new Login("�α���");
		//���� �Ϸ� �� �ּ� ����!
		
	}

}
