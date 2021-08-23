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
	//Image img1 부분
	Image img = tk.getImage("images/imgt.jpg");
	Image im1,img2,img3;
	//Image img1 = tk.getImage("images/img2.gif");
	//Image img2 = tk.getImage("images/img2.gif");
	//Image img3 = tk.getImage("images/img3.gif");
	Button b1,b2,b3,b4;
	
	RandomImage(String title){ 
		super(title);
		
		// 프레임을 화면 중앙에 보이기
				
				
				setBounds((screenSize.width)/2-350, 
						(screenSize.height)/2-350, 700, 700);
				setLayout(null);
				// 닫기x 버튼 이벤트 처리
				addWindowListener(new WindowAdapter() { 
					public void windowClosing(WindowEvent e) { 
						dispose(); // 프로그램 종료 
					}
				});
			
		
				//Canvas 부분
		c1 = new Canvas(){
			public void paint(Graphics g){
				g.drawImage(img,0,0,this);
			}
		};
		c1.setBackground(Color.white);
		c1.setBounds(50,50,360,360);
		//c1.repaint();
		
				// 버튼 부분
		
		b1 = new Button("함덕 서우봉 해변");
		b1.addActionListener(new EventCanvas());
		b1.setBackground(Color.GREEN);
		b1.setFont(f2);
		b2 = new Button("협재 해수욕장");
		b2.addActionListener(new EventCanvas());
		b2.setBackground(Color.GREEN);
		b2.setFont(f2);
		b3 = new Button("세화 해수욕장");
		b3.addActionListener(new EventCanvas());
		b3.setBackground(Color.GREEN);
		b3.setFont(f2);
		b4 = new Button("랜덤 해변!!");
		b4.addActionListener(new EventCanvas());
		b4.setBackground(Color.GREEN);
		b4.setFont(f1);
		
		// TextArea 부분 //
		
				ta = new TextArea("자바 AWT ",0,0,TextArea.SCROLLBARS_NONE); // 1. 이벤트 소스
				
				//ta.addActionListener(new EventMoney());
				ta.setBackground(Color.WHITE);
				ta.setFont(f3);
				ta.setBounds(50,450,500,200);
				ta.setEditable(false);
		
				// Panel 부분
		p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		p1.setBounds(300,50,360,360);
		p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);
		// 프레임에 컨포넌트,컨테이너 붙이기
	    add(c1);add(p1);add(ta);
	
		setVisible(true);
	}
	
	class EventCanvas implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			Button b = (Button)e.getSource();
			int r = (int)(Math.random()*3);
			String imgArr[] = {"images/tr1.jpg","images/tr2.jpg","images/tr3.jpg"};
			
			if(b.getLabel() == "함덕 서우봉 해변"){
			//    img = tk.getImage("images/img1.gif");
				ta.setText("제주 시외버스터미날에서 동쪽 약 14km 지점에 있으며, "
						+ "동회선일주도로(12번국도)변에 위치해 있어 교통이 매우 편리하다."
						+ "백사장의 길이는 900m, 너비 120m, 평균 수심 1.2m,"
						+ " 경사도는 5도로 수심이 아주 얕고 경사가 완만하여 한참을 들어가도 "
						+ "바닷물이 허리춤까지 밖에 안되기 때문에 아이들과 함께 해수욕을 하기에 적합하며, "
						+ "바다가 얕아지면서 형성된 하얀 패사층은 마치 산호 바다와 같이 맑은 바닷물을 더욱더 빛나게 만든다.");
				img = tk.getImage(imgArr[0]);
				c1.repaint(); 
			}else if(b.getLabel() == "협재 해수욕장"){
			//    img = tk.getImage("images/img2.gif");
				ta.setText("협재해수욕장은 경사가 완만해 수심이 얕고, "
						+ "소나무 숲도 있어서 어린이가 있는 가족 단위 여행객의 휴가지로 좋다."
						+ " 주위에는 다양한 카페와 맛집"
						+ ", 숙소들이 있고, 주변 관광지로는 한림공원, "
						+ "금능해수욕장, 금능석물원, 월령선인장자생지 등이 있다.");
				img = tk.getImage(imgArr[1]);
				c1.repaint();
			}else if(b.getLabel() == "세화 해수욕장"){
			//	img = tk.getImage("images/img3.gif");
				ta.setText("세화해수욕장은 1980년 개장된 해수욕장으로 규모는 그리 크지 않지만 코발트 빛 맑은 바다 색깔이 무척이나 예쁜 곳입니다. "
						+ "폭 30~40여 미터의 해수욕장이 200여 미터 정도 펼쳐지며 인근에 세화읍이 위치하고 있어 각종 숙박시설과 기타 편의 시설 이용이 용이한 곳입니다.");
				img = tk.getImage(imgArr[2]);
				c1.repaint();
			}else {
				ta.setText("랜덤으로 나온 해변으로 놀러가보세요~~");
				img = tk.getImage(imgArr[r]);
				c1.repaint();
			}
			
		}
		
	}
	
	

}
