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
		this.setResizable(false); // 프레임 확대,축소 안되게 설정!
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e){System.exit(0);}});
		// 메뉴 부분 //
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("홈");
		Menu m2 = new Menu("즐겨찾기");
		Menu m3 = new Menu("프로그램");
		Menu m4 = new Menu("여행 캐릭터");
		Menu m5 = new Menu("도움말");
		
		
		
		
				//	메뉴 m1의 아이템 
				MenuItem m11 = new MenuItem("열기", new MenuShortcut('O',true));
				MenuItem m12 = new MenuItem("인쇄");
				Menu m13 = new Menu("기타");
				Menu m30 = new Menu("커피 프로그램");
				//	메뉴 m2의 아이템 
				
				
				
				//	메뉴 m3의 아이템 				
				MenuItem m31 = new MenuItem("커피 자판기 프로그램");
				m31.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new OopEvent("커피 자판기 프로그램");}});
				
				MenuItem m32 = new MenuItem("제주도 해변 리스트 프로그램");
				m32.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new TravelList("제주도 해변 리스트 프로그램");}});
				
				MenuItem m33 = new MenuItem("랜덤 배경색 프로그램");
				m33.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new ColorEvent_Test("랜덤 배경색 프로그램");}});
				
				MenuItem m34 = new MenuItem("채팅 프로그램");
				m34.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new ChatEvent_Test("채팅 프로그램");}});
				
				MenuItem m35 = new MenuItem("여행 준비물 리스트프로그램");
				m35.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new Travel ("여행 준비물 리스트프로그램");}});
				
				MenuItem m36 = new MenuItem("마우스로 그림그리기 프로그램");
				m36.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new DrawGraphics("마우스로 그림그리기 프로그램");}});
				
				MenuItem m37 = new MenuItem("랜덤 해변 이미지 프로그램");
				m37.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new RandomImage("랜덤 해변 이미지 프로그램");}});
				
				MenuItem m38 = new MenuItem("커피 사이즈 가격 프로그램");
				m38.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new CoffeeP("커피 사이즈 가격 프로그램");}});
				
				MenuItem m39 = new MenuItem("메뉴 액션 프로그램");
				m39.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new MenuActionEventEx();}});
				
				MenuItem m40 = new MenuItem("혈액형 프로그램");
				m40.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new ABCOAB("혈액형 프로그램");}});
				
				MenuItem m42 = new MenuItem("체크 이벤트 연습문제");
				m42.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new CheckEventPractice();}});
				
				//메뉴 m4의 아이템
				MenuItem m43 = new MenuItem("여행 가는곳 정하기 캐릭터 프로그램");
				m43.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new character("여행 가는곳 정하기 캐릭터 프로그램");}});
				
				//메뉴 m5의 아이템 
				MenuItem m41 = new MenuItem("Help");
				m41.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						new Help("Help");}});
				
				
				
				// 메뉴 m14의 닫기 단축키 설정
				MenuItem m14 = new MenuItem("닫기", new MenuShortcut('E'));
				m14.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
		System.exit(0);}});
		
				// 메뉴 m1에 아이템 추가
				m1.add(m11);m1.add(m12);m1.add(m13);
				m1.addSeparator();//수평선 추가
				m1.add(m14);
				// 메뉴 m2 즐겨찾기에 자주쓰는 프로그램 추가//
				m2.add(m35);
				m2.add(m32);
				// 메뉴 m3에 아이템 추가
				m3.add(m30);
				m30.add(m31); m3.add(m33);m3.add(m34);
				m3.add(m36);m2.add(m37);m30.add(m38);m3.add(m39);
				m3.add(m40);
				m3.add(m42);
				
				//메뉴 m4에 아이템 추가
				m4.add(m43);
				// 메뉴 m5에 아이템 추가
				m5.add(m41);
				
		// 메뉴 바에 메뉴 붙이기 //
		mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);mb.add(m5);
		
		// 프레임에 컨포넌트 붙이는 부분//
		setMenuBar(mb); // 프레임에 메뉴바 붙이기
		
		
		
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
		new FirstMenu("KMJ 자바 프로젝트");
		
	new Login("로그인");
		//개발 완료 후 주석 제거!
		
	}

}
