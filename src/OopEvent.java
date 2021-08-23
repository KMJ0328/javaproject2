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
		
		
		// 프레임을 화면 중앙에 보이기
				
				setBounds(screenSize.width/2-300,screenSize.height/2-450,600,900);
				setLayout(null);
				
				// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
				this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
					public void windowClosing(WindowEvent e) { // 오버라이딩
						dispose(); // 프로그램 종료
					}
				});
				this.setResizable(false); // 프레임 확대,축소 안되게 설정!
				//Canvas 부분
				c1 = new Canvas(){
					public void paint(Graphics g){
						g.drawImage(img,0,0,this );
					}
				};
				c1.setBackground(Color.blue);
				c1.setBounds(50,525,500,360);
		// Label 제목 부분 //
		l1 = new Label("커피 이미지 보이기");
		l1.setFont(f1);
		l1.setBounds(20,10,550,100);
		l1.setAlignment(Label.CENTER);
		l1.setBackground(Color.blue);
		l1.setForeground(Color.white);
		// Button 부분 //
		b1 = new Button("아메리카노");	
	
		b2 = new Button("카페라떼");
		
		b3 = new Button("카푸치노");
	
		b4 = new Button("에스프레소");
		
		

		// TextArea 부분 //
		
		ta = new TextArea("버튼을 클릭하세요",0,0,TextArea.SCROLLBARS_NONE); // 1. 이벤트 소스
		
		//ta.addActionListener(new EventMoney());
		ta.setBackground(Color.ORANGE);
		ta.setFont(f1);
		ta.setBounds(20,120,450,400);
		ta.setEditable(false);
		// 버튼 이벤트 감지기//
				b1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Button b = (Button)e.getSource();
						ta.setText("아메리카노");
						img = tk.getImage("images/img1.jpg");
						c1.repaint();
						}
				});
				b2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Button b = (Button)e.getSource();
						ta.setText("카페라떼");
						img = tk.getImage("images/img2.jpg");
						c1.repaint();
						}
				});
				b3.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Button b = (Button)e.getSource();
						ta.setText("카푸치노");
						img = tk.getImage("images/img3.jpg");
						c1.repaint();
						}
				});
				b4.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						Button b = (Button)e.getSource();
						ta.setText("에스프레소");
						img = tk.getImage("images/img4.jpg");
						c1.repaint();
						}
				});
			
				
		
		
		// 패널 p1 부분 //
		p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		p1.setBounds(470,120,100,400);
		p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);
		
		
		
		
		add(c1);
		add(l1);add(ta);add(p1);
		setVisible(true);
	}
	
	
	

}
