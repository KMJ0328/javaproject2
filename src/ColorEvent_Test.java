import java.awt.*;
import java.awt.event.*;


public class ColorEvent_Test extends Frame {
	Button b1,b2,b3,b4,b5;
	Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
	Font f2 = new Font("Serif",Font.BOLD+Font.ITALIC, 20);
	
	ColorEvent_Test(String title){
		super(title);
		//this.setBounds(0,0,500,600);
		this.setLayout(null); // ������ ���̾ƿ� ������!
		this.setBackground(Color.DARK_GRAY);
		
		
		// �������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setBounds(screenSize.width/2-250,screenSize.height/2-300,500,600);
		
		// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
				this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
					public void windowClosing(WindowEvent e) { // �������̵�
					dispose();// �޸𸮿��� ����
						
					}
				});
				
				this.setResizable(false); // ������ Ȯ��,��� �ȵǰ� ����!
				
		//                 ��ư �κ�                                              //
		b1 = new Button("����");
		b1.setBounds(50,50,180,150);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b1.setFont(f1);
		
		b2 = new Button("���");
		b2.setBounds(260,50,180,150);
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.black);
		b2.setFont(f1);
		
		b3 = new Button("�Ķ�");
		b3.setBounds(50,230,180,150);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b3.setFont(f1);
		
		b4 = new Button("�ʷ�");
		b4.setBounds(260,230,180,150);
		b4.setBackground(Color.green);
		b4.setForeground(Color.black);
		b4.setFont(f1);
		
		b5 = new Button("����");
		b5.setBounds(155,410,180,150);
		b5.setFont(f1);
		b5.addActionListener(new  EventColor());
		
		
		//                 �̺�Ʈ ������ �κ�                                                        //
		b1.addActionListener(new  ActionListener(){// 2. �̺�Ʈ ������(������)
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.red);
			}
		});   
		b2.addActionListener(new  ActionListener(){// 2. �̺�Ʈ ������(������)
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.yellow);
			}
		});  
		b3.addActionListener(new  ActionListener(){// 2. �̺�Ʈ ������(������)
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.blue);
			}
		});  
		b4.addActionListener(new  ActionListener(){// 2. �̺�Ʈ ������(������)
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.green);
			}
		});  
		
		//                 �����ӿ� ������Ʈ ���̱�                                              //
		add(b1);add(b2);add(b3);add(b4);add(b5);
		
		
		
		this.setVisible(true);
	}
	
	// ���� Ŭ���� ����� 3.�̺�Ʈ ó���� 
	class EventColor implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// �迭, ���� �߻�
			int r;
Color c[] = {Color.blue,Color.cyan,Color.LIGHT_GRAY,Color.orange,Color.pink,Color.magenta};
			r = (int)(Math.random()*6);
			
			
			
			setBackground(c[r]);
		}
		
	}
	
	
	
		
	
}
