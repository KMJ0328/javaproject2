import java.awt.*;
import java.awt.event.*;
public class CheckEventPractice extends Frame {
	Label q1, q2, score;
	Checkbox q1cb1,q1cb2,q1cb3,q1cb4;
	Checkbox q2cb1,q2cb2,q2cb3,q2cb4;
	CheckboxGroup group;
	Button end;
	
	CheckEventPractice(){
		super("Checkbox 이벤트 연습");
		this.setLayout(new GridLayout(13,1)); // 13행 1열
		this.setBounds(500,200,500,400);
		this.setBackground(Color.yellow);
		
		q1 = new Label("1.다음 중 ActionEvent의 actionPerfomed" + "메소드가 호출되는 경우는?(모두 고르세요.)");
		q1cb1 = new Checkbox("Button을 눌렀을 때");
		q1cb2 = new Checkbox("TextField에서 Enter키 눌렀을 때");
		q1cb3 = new Checkbox("MenuItem을 클릭했을 때");
		q1cb4 = new Checkbox("List에서 더블 클릭으로 item 선택 했을 때");
		
		q2 = new Label("2.Frame의 기본 LayoutManger는?(하나만 고르세요.)");
		group = new CheckboxGroup();
		q2cb1 = new Checkbox("FlowLayout",group,false);
		q2cb2 = new Checkbox("GridLayout",group,false);
		q2cb3 = new Checkbox("BorderLayout",group,false);
		q2cb4 = new Checkbox("CardLayout",group,false);
		
		score = new Label("* 결과: ");
		score.setFont(new Font("Serif",Font.BOLD,20));
		score.setAlignment(Label.CENTER);
		
		end = new Button("이 버튼을 누르시면 결과를 알 수 있습니다."); // 1.이벤트 소스
		end.setBackground(Color.pink);
		
		end.addActionListener(new  ActionListener(){
			public void actionPerformed(ActionEvent e) {
				double totalScore = 0.0;
				
				if(q1cb1.getState()){totalScore += 12.5;}
				if(q1cb2.getState()){totalScore += 12.5;}
				if(q1cb3.getState()){totalScore += 12.5;}
				if(q1cb4.getState()){totalScore += 12.5;}
				
				if(q2cb3.getState()){totalScore += 50.0;}
				
				score.setText("* 결과: " + totalScore + "점 입니다.");}}); 
		score.setBackground(Color.GREEN);
		
		add(q1);
		add(q1cb1);add(q1cb2);add(q1cb3);add(q1cb4);
		add(new Label(""));
		add(q2);
		add(q2cb1);add(q2cb2);add(q2cb3);add(q2cb4);
		add(end);
		add(score);
		
		this.addWindowListener(new WindowAdapter(){ // 프레임 닫기 이벤트
			public void windowClosing(WindowEvent e){dispose();}});// 프로그램 종료
		
		setVisible(true);
	}
	
	
	
	
	
	// 내부 클래스 ,3. 이벤트처리기
	class Event5 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double totalScore = 0.0;
			
			if(q1cb1.getState()){totalScore += 12.5;}
			if(q1cb2.getState()){totalScore += 12.5;}
			if(q1cb3.getState()){totalScore += 12.5;}
			if(q1cb4.getState()){totalScore += 12.5;}
			
			if(q2cb3.getState()){totalScore += 50.0;}
			
			score.setText("* 결과: " + totalScore + "점 입니다.");
			
		}
		
		
	}

}
