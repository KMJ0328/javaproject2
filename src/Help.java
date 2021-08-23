import java.awt.*;

import java.awt.event.*;

import javax.swing.ImageIcon;


public class Help extends Frame{
	Image sol,img = null;
	TextArea ta;
	Font f1 = new Font("Serif",Font.BOLD, 20);
	Help(String title){
		super(title);
		this.setIconImage(new ImageIcon("images/icon.jpg").getImage());
		
		// 프레임을 화면 중앙에 보이기
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-250,screenSize.height/2-180,500,360);
				img = tk.getImage("images/help.jpg");
				sol = tk.getImage("sol.jpg");
				
				// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
				this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
					public void windowClosing(WindowEvent e) { // 오버라이딩
						dispose(); // 프로그램 종료
					}
				});
				this.setResizable(false); // 프레임 확대,축소 안되게 설정!
				// TextArea 부분 //
				
				ta = new TextArea("자바(영어: Java, 문화어: 쟈바)는 \n썬 마이크로시스템즈의 \n제임스 고슬링"
						+ "(James Gosling)과 다른 연구원들이 개발한 객체 지향적 프로그래밍 언어이다. "
						+ "1991년 그린 프로젝트(Green Project)라는 이름으로\n 시작해 1995년에 발표했다.\n"
						+ "처음에는 가전제품 내에 탑재해 동작하는 프로그램을 위해 개발했지만\n 현재 웹 애플리케이션 개발에 가장 많이 사용하는 언어 가운데 하나이고,\n"
						+ "모바일 기기용 소프트웨어 개발에도 널리 사용하고 있다. \n현재 버전 15까지 출시했다.\n"
						+ "언어 설명 참고 사이트 https://www.w3schools.com/",0,0,TextArea.SCROLLBARS_NONE); // 1. 이벤트 소스
						
				
				ta.setBackground(Color.darkGray);
				ta.setForeground(Color.white);
				ta.setFont(f1);
				ta.setBounds(10,10,10,10);
				ta.setEditable(false);
		
		
	add(ta);
		setVisible(true);
		
	
	}
	
	public void paint(Graphics g){
		int imgWidth,imgHeight;
		
		if(img == null){
			return;
		}
		
		imgWidth = img.getWidth(this);
		imgHeight = img.getHeight(this);
		
		g.drawImage(img,0,0,this);
	}
	
	
}
