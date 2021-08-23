import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Back extends JPanel {
	private int nCase;
	
	Point pos = new Point(100,100); // 포인터를 생성
	
	Back(){
		nCase = 0;
	}
	
	public void setnCase(int n) {//public 클래스에서 받아온 값을 nCase에 넣어줌
		this.nCase = n; 
		this.repaint();
	}

	public void paintComponent(Graphics g){
		Image img = Toolkit.getDefaultToolkit().getImage("images/Travel/jeju.png"); // 배경이미지
		g.drawImage(img, 0, 0, this);
		// money 이미지 
		Image Money = Toolkit.getDefaultToolkit().getImage("images/Travel/Money.jpg"); // 이미지 넣어줌
		// Bag 이미지
		Image Bag = Toolkit.getDefaultToolkit().getImage("images/Travel/Bag.jpg"); // 이미지를 넣어줌
		// 이코노미 티켓 이미지
		Image Ticket = Toolkit.getDefaultToolkit().getImage("images/Travel/airticket.jpg"); // 이미지를 넣어줌
		// 게스트 하우스 이미지 부분
		Image GuestHouse = Toolkit.getDefaultToolkit().getImage("images/Travel/GuestHouse.jpg"); // 이미지를 넣어줌
		// 캐리어 이미지 부분
		Image img1 = Toolkit.getDefaultToolkit().getImage("images/Travel/Carrier.jpg"); // 이미지를 넣어줌
		// 호화 여행 리스트  이미지부분
		
		Image img1_1 = Toolkit.getDefaultToolkit().getImage("images/Travel/Firstairticket.jpg"); // 이미지를 넣어줌
		Image img1_2 = Toolkit.getDefaultToolkit().getImage("images/Travel/HotelSinla.jpg"); // 이미지 넣어줌
		Image img1_3 = Toolkit.getDefaultToolkit().getImage("images/Travel/OpenCar.jpg"); // 이미지 넣어줌
		
		//배낭여행 리스트  이미지부분
		Image img2 = Toolkit.getDefaultToolkit().getImage("images/Travel/Ship.jpg"); // 이미지를 넣어줌
		
		//오토바이 여행 리스트 이미지 부분
		Image img3 = Toolkit.getDefaultToolkit().getImage("images/Travel/Ot.jpg"); // 이미지를 넣어줌
		
		// 차 여행 리스트 이미지 부분
		Image img4 = Toolkit.getDefaultToolkit().getImage("images/Travel/Car.jpg"); // 이미지를 넣어줌
		Image img4_1 = Toolkit.getDefaultToolkit().getImage("images/Travel/Hotel.jpg"); // 이미지를 넣어줌
		
		// 온라인 여행 리스트 이미지 부분
		Image img5 = Toolkit.getDefaultToolkit().getImage("images/Travel/Computer.jpg"); // 이미지를 넣어줌
		
		switch(nCase){ // nCase에 따라 case문 실행
		case 1 : 
			g.drawImage(img1, 20, 20, this); // 이미지를 그려줌
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
		this.addWindowListener(new WindowAdapter(){ // 닫기
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
		
		
		// 프레임 중앙에 위치시키기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize(); // 화면의 너비와 높이를 구함
		setBounds(screenSize.width/2-325, screenSize.height/2-250, 650, 500);

		this.setTitle("Travel list");
		this.setVisible(true);

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5,1)); // 버튼을 그리드레이아웃으로 배열을 설정
		ButtonGroup grp = new ButtonGroup();
		
		JRadioButton rb1 = new JRadioButton("호화 여행 준비물 리스트");
		JRadioButton rb2 = new JRadioButton("배낭여행 준비물 리스트");
		JRadioButton rb3 = new JRadioButton("오토바이 준비물 리스트");
		JRadioButton rb4 = new JRadioButton("차 준비물 리스트");
		JRadioButton rb5 = new JRadioButton("온라인 준비물 리스트");
		
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

	    rb1.addActionListener(al); // 액션리스너 추가
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
			if(e.getActionCommand().equals("호화 여행 준비물 리스트")) { // 눌린 버튼이 트리1과 같으면 Back의setnCase로 감
				System.out.println("호화 여행 준비물 리스트");
				bk.setnCase(1);
	    	} else if (e.getActionCommand().equals("배낭여행 준비물 리스트")) {
	    		System.out.println("배낭여행 준비물 리스트");
		   		bk.setnCase(2);
		   	} else if (e.getActionCommand().equals("오토바이 준비물 리스트")) {
	    		System.out.println("오토바이 준비물 리스트");
		   		bk.setnCase(3);
		   	} else if (e.getActionCommand().equals("차 준비물 리스트")) {
	    		System.out.println("차 준비물 리스트");
		   		bk.setnCase(4);
		   	} else if (e.getActionCommand().equals("온라인 준비물 리스트")) {
	    		System.out.println("온라인 준비물 리스트");
		   		bk.setnCase(5);
		   	}
		}
	};
}
