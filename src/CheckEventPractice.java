import java.awt.*;
import java.awt.event.*;
public class CheckEventPractice extends Frame {
	Label q1, q2, score;
	Checkbox q1cb1,q1cb2,q1cb3,q1cb4;
	Checkbox q2cb1,q2cb2,q2cb3,q2cb4;
	CheckboxGroup group;
	Button end;
	
	CheckEventPractice(){
		super("Checkbox �̺�Ʈ ����");
		this.setLayout(new GridLayout(13,1)); // 13�� 1��
		this.setBounds(500,200,500,400);
		this.setBackground(Color.yellow);
		
		q1 = new Label("1.���� �� ActionEvent�� actionPerfomed" + "�޼ҵ尡 ȣ��Ǵ� ����?(��� ������.)");
		q1cb1 = new Checkbox("Button�� ������ ��");
		q1cb2 = new Checkbox("TextField���� EnterŰ ������ ��");
		q1cb3 = new Checkbox("MenuItem�� Ŭ������ ��");
		q1cb4 = new Checkbox("List���� ���� Ŭ������ item ���� ���� ��");
		
		q2 = new Label("2.Frame�� �⺻ LayoutManger��?(�ϳ��� ������.)");
		group = new CheckboxGroup();
		q2cb1 = new Checkbox("FlowLayout",group,false);
		q2cb2 = new Checkbox("GridLayout",group,false);
		q2cb3 = new Checkbox("BorderLayout",group,false);
		q2cb4 = new Checkbox("CardLayout",group,false);
		
		score = new Label("* ���: ");
		score.setFont(new Font("Serif",Font.BOLD,20));
		score.setAlignment(Label.CENTER);
		
		end = new Button("�� ��ư�� �����ø� ����� �� �� �ֽ��ϴ�."); // 1.�̺�Ʈ �ҽ�
		end.setBackground(Color.pink);
		
		end.addActionListener(new  ActionListener(){
			public void actionPerformed(ActionEvent e) {
				double totalScore = 0.0;
				
				if(q1cb1.getState()){totalScore += 12.5;}
				if(q1cb2.getState()){totalScore += 12.5;}
				if(q1cb3.getState()){totalScore += 12.5;}
				if(q1cb4.getState()){totalScore += 12.5;}
				
				if(q2cb3.getState()){totalScore += 50.0;}
				
				score.setText("* ���: " + totalScore + "�� �Դϴ�.");}}); 
		score.setBackground(Color.GREEN);
		
		add(q1);
		add(q1cb1);add(q1cb2);add(q1cb3);add(q1cb4);
		add(new Label(""));
		add(q2);
		add(q2cb1);add(q2cb2);add(q2cb3);add(q2cb4);
		add(end);
		add(score);
		
		this.addWindowListener(new WindowAdapter(){ // ������ �ݱ� �̺�Ʈ
			public void windowClosing(WindowEvent e){dispose();}});// ���α׷� ����
		
		setVisible(true);
	}
	
	
	
	
	
	// ���� Ŭ���� ,3. �̺�Ʈó����
	class Event5 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double totalScore = 0.0;
			
			if(q1cb1.getState()){totalScore += 12.5;}
			if(q1cb2.getState()){totalScore += 12.5;}
			if(q1cb3.getState()){totalScore += 12.5;}
			if(q1cb4.getState()){totalScore += 12.5;}
			
			if(q2cb3.getState()){totalScore += 50.0;}
			
			score.setText("* ���: " + totalScore + "�� �Դϴ�.");
			
		}
		
		
	}

}
