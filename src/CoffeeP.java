import java.awt.*; // AWT ������Ʈ ����ϱ� ����
import java.awt.event.*; // �̺�Ʈ ó���ϱ� ����





public class CoffeeP extends Frame{
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	CheckboxGroup group,group1;
	Label result,sc1,sc2,result2;
	Panel p1,p2;
	Button b1;
	int sc1_money= 0 , sc2_money =0,total = 0;
	CoffeeP(String title){
		super(title);
		setBounds(500,300,650,600);
		setLayout(null); // ������ ���̾ƿ� ��� ����.
		setBackground(Color.LIGHT_GRAY);
		Font f2 = new Font("SansSeif",Font.ROMAN_BASELINE,20);
		
		
		// ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
			public void windowClosing(WindowEvent e) { // �������̵�
				dispose(); // ���α׷� ����
			}
		});
		//                    Checkbox �κ�                                    //
		group = new CheckboxGroup(); // üũ�ڽ� �׷� ��ü ����
		cb1 = new Checkbox("�Ƹ޸�ī��(1000��)",group, false);
		cb2 = new Checkbox("ī���(1500��)",group, false);
		cb3 = new Checkbox("īǪġ��(2000��)",group, false);
		group1 = new CheckboxGroup();
		cb4 = new Checkbox("Small(+0��)",group1, false);
		cb5 = new Checkbox("Medium(+500��)",group1,false);
		cb6 = new Checkbox("Large(+1000��)",group1,false);
		//                   label �κ� //
		sc1 = new Label("Ŀ�� ����");
		
		sc2 = new Label("������ ����");
		// panel p1 �κ�  //
			p1 = new Panel();
			p1.setBackground(Color.orange);
			p1.setForeground(Color.black);
			p1.setLayout(new GridLayout(4,1));
			p1.setBounds(50,50,250,200);
			p1.setFont(f2);
			p1.add(sc1);
			p1.add(cb1);p1.add(cb2);p1.add(cb3);
		// panel p2 �κ�  //
			p2 = new Panel();
			p2.setBackground(Color.orange);
			p2.setForeground(Color.black);
			p2.setLayout(new GridLayout(4,1));
			p2.setBounds(350,50,250,200);
			p2.setFont(f2);
			p2.add(sc2);
			p2.add(cb4);p2.add(cb5);p2.add(cb6);
			//          Button �κ�              //
			b1 = new Button("���");
			b1.setBounds(50,300,550,60);
			b1.setBackground(new Color(0,64,128));
			b1.setForeground(Color.white);
			b1.setFont(f2);
			//           Button ������ //
			b1.addActionListener(new EventG());	
			
			// Label result �κ�  //
			result = new Label();
			result.setBounds(50,500,550,60);
			result.setBackground(Color.yellow);
			result.setFont(f2);
			result.setAlignment(Label.CENTER);
		    // Label result2 �κ� // 
			result2 = new Label();
			result2.setBounds(50,400,550,60);
			result2.setBackground(Color.yellow);
			result2.setFont(f2);
			result2.setAlignment(Label.CENTER);
		
		
		this.add(p1);add(p2);add(b1);add(result);add(result2);
		
		
		setVisible(true);
	}
	class EventG implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			total = 0;
			sc1_money= 0;
			sc2_money =0;
		String str = "";
	if(cb1.getState()){
		sc1_money+=1000;
		str +="(�Ƹ޸�ī��)";
	}else if (cb2.getState()){
			sc1_money+=1500;
			str +="(ī���)";
	}else {
		sc1_money+=2000;
		str +="(īǪġ��)";
	}
	if(cb4.getState()){
		sc2_money+=0;
		str +="(Small)";
	}else if(cb5.getState()){
		sc2_money+=500;
		str +="(Medium)";
	}else if(cb6.getState()){
		sc2_money+=1000;
		str +="(Large)";
	}else{
		result.setText("Ŀ�ǿ� ����� ������ �ּ���.");
	}
			result.setText("�����Ͻ� Ŀ�Ǵ�"+(sc1_money+sc2_money)+"�� �Դϴ�.");
			result2.setText("�����Ͻ� Ŀ�Ǵ�"+str+"�Դϴ�.");
		}
		
	}
	

	}


