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
		
		// �������� ȭ�� �߾ӿ� ���̱�
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension screenSize = tk.getScreenSize();
				this.setBounds(screenSize.width/2-250,screenSize.height/2-180,500,360);
				img = tk.getImage("images/help.jpg");
				sol = tk.getImage("sol.jpg");
				
				// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
				this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
					public void windowClosing(WindowEvent e) { // �������̵�
						dispose(); // ���α׷� ����
					}
				});
				this.setResizable(false); // ������ Ȯ��,��� �ȵǰ� ����!
				// TextArea �κ� //
				
				ta = new TextArea("�ڹ�(����: Java, ��ȭ��: ���)�� \n�� ����ũ�νý������� \n���ӽ� ����"
						+ "(James Gosling)�� �ٸ� ���������� ������ ��ü ������ ���α׷��� ����̴�. "
						+ "1991�� �׸� ������Ʈ(Green Project)��� �̸�����\n ������ 1995�⿡ ��ǥ�ߴ�.\n"
						+ "ó������ ������ǰ ���� ž���� �����ϴ� ���α׷��� ���� ����������\n ���� �� ���ø����̼� ���߿� ���� ���� ����ϴ� ��� ��� �ϳ��̰�,\n"
						+ "����� ���� ����Ʈ���� ���߿��� �θ� ����ϰ� �ִ�. \n���� ���� 15���� ����ߴ�.\n"
						+ "��� ���� ���� ����Ʈ https://www.w3schools.com/",0,0,TextArea.SCROLLBARS_NONE); // 1. �̺�Ʈ �ҽ�
						
				
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
