import java.awt.*;
import java.awt.event.*;

public class ChatEvent_Test extends Frame {
	TextArea ta; // ������� �ִ� ���� ���� �� 
	TextField tf; // �� �ٷ� �Է��� ��
	Button b1;
	
	ChatEvent_Test(String title){
		super(title);
		// �������� �⺻ ���̾ƿ��� �������׾ƿ�(��,��,��,��,�߾�)
		
		
		
		// �������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setBounds(screenSize.width/2-350,screenSize.height/2-250,700,500);
		
		// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
			public void windowClosing(WindowEvent e) { // �������̵�
				dispose();
			}
		});
		
		this.setResizable(false); // ������ Ȯ��,��� �ȵǰ� ����!
		
		//      			Button b1 �κ�                                              //
		b1 = new Button("Ŭ��");
		b1.addActionListener(new EventChat());
		
		//                 TextArea ta �κ�                                          //
		ta = new TextArea("Hello\n",4,10);
		ta.setEditable(false);
		
		
		//                 TextField tf �κ�                                          //
		tf = new TextField(""); // 1. �̺�Ʈ �ҽ�
		tf.addActionListener(new EventChat());
		
		
		
		
		
		//      		     �����ӿ� ������Ʈ ���̱�                                          //
		add(ta,BorderLayout.CENTER);//�߾ӿ� ta ���̱�
		add(tf,"South");//���ʿ� tf ���̱�
		add(BorderLayout.NORTH,b1); // ���ʿ� b1���̱�
		
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
