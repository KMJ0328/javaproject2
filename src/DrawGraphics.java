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
		
				// �������� ȭ�� �߾ӿ� ���̱�
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-250,screenSize.height/2-250,500,500);
				
		
				// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
				this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
					public void windowClosing(WindowEvent e) { // �������̵�
						dispose(); // ���α׷� ����
					}
				});
			//�����ӿ� ���콺 ������ ��� �̺�Ʈ ������(������) ���̱�
				this.addMouseMotionListener(this) ;
			
							setVisible(true);
		img = createImage(500,500);
		gImg = img.getGraphics();
		gImg.drawString("���ʹ�ư�� ���� ä�� ���콺�� ������������.", 10, 50);
		repaint();
	}
	
	public void paint(Graphics g){ // �������̵�
		if(img != null){
			g.drawImage(img, 0,0, this);
			// ����ȭ�鿡 �׷��� �׸��� Frame�� ����
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
		new DrawGraphics("�׷��� ����2");

	}


}
