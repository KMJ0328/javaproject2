import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.awt.event.*;
import java.awt.event.*;
import java.awt.event.*;

public class DrawGraphics extends Frame implements MouseMotionListener{
	int x = 0, y = 0;
	Image img =null;
	Graphics gImg = null;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	
	DrawGraphics(String title){
		super(title);
		
				// 프레임을 화면 중앙에 보이기
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-250,screenSize.height/2-250,500,500);
				
		
				// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
				this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
					public void windowClosing(WindowEvent e) { // 오버라이딩
						dispose(); // 프로그램 종료
					}
				});
			//프레임에 마우스 움직일 경우 이벤트 리스너(감지기) 붙이기
				this.addMouseMotionListener(this) ;
			
							setVisible(true);
		img = createImage(500,500);
		gImg = img.getGraphics();
		gImg.drawString("왼쪽버튼을 누른 채로 마우스를 움직여보세요.", 10, 50);
		repaint();
	}
	
	public void paint(Graphics g){ // 오버라이딩
		if(img != null){
			g.drawImage(img, 0,0, this);
			// 가상화면에 그려진 그림을 Frame에 복사
		}
	}
	public void mouseDragged(MouseEvent e) {
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
			x = e.getX();
			y = e.getY();
			gImg.drawString("*", x, y);
			repaint();
		}
	}
	public void mouseMoved(MouseEvent e) {}
	
	public static void main(String[] args) {
		new DrawGraphics("그래픽 연습2");

	}


}
