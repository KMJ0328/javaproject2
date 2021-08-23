import java.awt.*; // AWT 컨포넌트 사용하기 위해
import java.awt.event.*; // 이벤트 처리하기 위해





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
		setLayout(null); // 프레임 레이아웃 사용 안함.
		setBackground(Color.LIGHT_GRAY);
		Font f2 = new Font("SansSeif",Font.ROMAN_BASELINE,20);
		
		
		// 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
			public void windowClosing(WindowEvent e) { // 오버라이딩
				dispose(); // 프로그램 종료
			}
		});
		//                    Checkbox 부분                                    //
		group = new CheckboxGroup(); // 체크박스 그룹 객체 생성
		cb1 = new Checkbox("아메리카노(1000원)",group, false);
		cb2 = new Checkbox("카페라떼(1500원)",group, false);
		cb3 = new Checkbox("카푸치노(2000원)",group, false);
		group1 = new CheckboxGroup();
		cb4 = new Checkbox("Small(+0원)",group1, false);
		cb5 = new Checkbox("Medium(+500원)",group1,false);
		cb6 = new Checkbox("Large(+1000원)",group1,false);
		//                   label 부분 //
		sc1 = new Label("커피 선택");
		
		sc2 = new Label("사이즈 선택");
		// panel p1 부분  //
			p1 = new Panel();
			p1.setBackground(Color.orange);
			p1.setForeground(Color.black);
			p1.setLayout(new GridLayout(4,1));
			p1.setBounds(50,50,250,200);
			p1.setFont(f2);
			p1.add(sc1);
			p1.add(cb1);p1.add(cb2);p1.add(cb3);
		// panel p2 부분  //
			p2 = new Panel();
			p2.setBackground(Color.orange);
			p2.setForeground(Color.black);
			p2.setLayout(new GridLayout(4,1));
			p2.setBounds(350,50,250,200);
			p2.setFont(f2);
			p2.add(sc2);
			p2.add(cb4);p2.add(cb5);p2.add(cb6);
			//          Button 부분              //
			b1 = new Button("계산");
			b1.setBounds(50,300,550,60);
			b1.setBackground(new Color(0,64,128));
			b1.setForeground(Color.white);
			b1.setFont(f2);
			//           Button 감지기 //
			b1.addActionListener(new EventG());	
			
			// Label result 부분  //
			result = new Label();
			result.setBounds(50,500,550,60);
			result.setBackground(Color.yellow);
			result.setFont(f2);
			result.setAlignment(Label.CENTER);
		    // Label result2 부분 // 
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
		str +="(아메리카노)";
	}else if (cb2.getState()){
			sc1_money+=1500;
			str +="(카페라떼)";
	}else {
		sc1_money+=2000;
		str +="(카푸치노)";
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
		result.setText("커피와 사이즈를 선택해 주세요.");
	}
			result.setText("선택하신 커피는"+(sc1_money+sc2_money)+"원 입니다.");
			result2.setText("선택하신 커피는"+str+"입니다.");
		}
		
	}
	

	}


