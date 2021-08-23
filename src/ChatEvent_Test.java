import java.awt.*;
import java.awt.event.*;

public class ChatEvent_Test extends Frame {
	TextArea ta; // 행과열이 있는 내용 많을 때 
	TextField tf; // 한 줄로 입력할 때
	Button b1;
	
	ChatEvent_Test(String title){
		super(title);
		// 프레임의 기본 레이아웃은 보더레잉아웃(동,서,남,북,중앙)
		
		
		
		// 프레임을 화면 중앙에 보이기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setBounds(screenSize.width/2-350,screenSize.height/2-250,700,500);
		
		// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
			public void windowClosing(WindowEvent e) { // 오버라이딩
				dispose();
			}
		});
		
		this.setResizable(false); // 프레임 확대,축소 안되게 설정!
		
		//      			Button b1 부분                                              //
		b1 = new Button("클릭");
		b1.addActionListener(new EventChat());
		
		//                 TextArea ta 부분                                          //
		ta = new TextArea("Hello\n",4,10);
		ta.setEditable(false);
		
		
		//                 TextField tf 부분                                          //
		tf = new TextField(""); // 1. 이벤트 소스
		tf.addActionListener(new EventChat());
		
		
		
		
		
		//      		     프레임에 컨포넌트 붙이기                                          //
		add(ta,BorderLayout.CENTER);//중앙에 ta 붙이기
		add(tf,"South");//남쪽에 tf 붙이기
		add(BorderLayout.NORTH,b1); // 북쪽에 b1붙이기
		
		setVisible(true); 
	}
	
	class EventChat implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ta.append(tf.getText()+"\n");
			tf.requestFocus(); 
			tf.selectAll();
			
			
		}
		
	}

}
