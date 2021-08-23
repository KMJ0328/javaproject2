import java.awt.*; // AWT ������Ʈ ����ϱ� ����
import java.awt.event.*; // �̺�Ʈ ó���ϱ� ����




public class ABCOAB extends Frame{
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup group;
	Label result,result2;
	Panel p1;
	Button b1;
	ABCOAB(String title){
		super(title);
		setBounds(500,300,600,400);
		setLayout(null); // ������ ���̾ƿ� ��� ����.
		setBackground(Color.LIGHT_GRAY);
		Font f2 = new Font("SansSeif",Font.ROMAN_BASELINE,25);
		
		
		
		// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
			public void windowClosing(WindowEvent e) { // �������̵�
				dispose(); // ���α׷� ����
			}
		});
		//                    Checkbox �κ�                                    //
		group = new CheckboxGroup(); // üũ�ڽ� �׷� ��ü ����
		cb1 = new Checkbox("A��",group, false);
		cb2 = new Checkbox("B��",group, false);
		cb3 = new Checkbox("O��",group, false);
		cb4 = new Checkbox("AB��",group, false);
		
		// checkbox �̺�Ʈ ó�� //
		cb1.addItemListener(new EventE());
		cb2.addItemListener(new EventE());    
		cb3.addItemListener(new EventE());
		cb4.addItemListener(new EventE());
		
		
		// panel p1 �κ�  //
		p1 = new Panel();
		p1.setBackground(Color.orange);
		p1.setForeground(Color.black);
		p1.setBounds(65,80,370,60);
		p1.setFont(f2);
		p1.add(cb1);p1.add(cb2);p1.add(cb3);p1.add(cb4);
		
		
		
		// Label result �κ�  //
		result = new Label();
		result.setBounds(65,170,370,60);
		result.setBackground(Color.yellow);
		result.setFont(f2);
		result.setAlignment(Label.CENTER);
		
		//          Button �κ�              //
		b1 = new Button("����");
		b1.setBounds(470,80,60,240);
		b1.setBackground(new Color(0,64,128));
		b1.setForeground(Color.white);
		b1.setFont(f2);
		//           Button ������ //
		b1.addActionListener(new EventF());
		
		
		// Label result2 �κ�  //
		result2 = new Label();
		result2.setBounds(65,260,370,60);
		result2.setBackground(Color.blue);
		result2.setForeground(Color.white);
		result2.setFont(f2);
		result2.setAlignment(Label.CENTER);
		
		// �����ӿ� ������Ʈ add //
				add(p1);
				add(result); add(result2);
				add(b1); 
		this.setVisible(true);
	}
	class EventE implements ItemListener {
		public void itemStateChanged(ItemEvent e){
			Checkbox cb = (Checkbox)e.getSource();
			String color = cb.getLabel();
		
			
		if(color.equals("A��")){
			result.setText(color+"�� �����ϼ̽��ϴ�.");
		}
		else if(color.equals("B��")){
			result.setText(color+"�� �����ϼ̽��ϴ�.");
		}
		else if(color.equals("O��")){
			result.setText(color+"�� �����ϼ̽��ϴ�.");
		}else{
			result.setText(color+"�� �����ϼ̽��ϴ�.");
			}
		}
	}
	class EventF implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			
			if(cb1.getState()){
				result2.setText(cb1.getLabel()+"�� �����ϼ̽��ϴ�.");
				result2.setForeground(Color.white);
			}
			else if(cb2.getState()){
				result2.setText(cb2.getLabel()+"�� �����ϼ̽��ϴ�.");
				result2.setForeground(Color.white);
			}
			else if(cb3.getState()){
				result2.setText(cb3.getLabel()+"�� �����ϼ̽��ϴ�.");
				result2.setForeground(Color.white);
			}else if(cb4.getState()){
				result2.setText(cb4.getLabel()+"�� �����ϼ̽��ϴ�.");
				result2.setForeground(Color.white);
			}else {
				result2.setText("�������� �������ֽʽÿ�.");
				result2.setForeground(Color.white);
			}
			
			
		}
		
	}
	
	


}
