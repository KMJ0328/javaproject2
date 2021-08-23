import java.awt.*;


import java.awt.event.*;

import javax.swing.ImageIcon;

public class TravelList extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Panel p1;
	
	TextArea ta;
	Canvas c1,li;
	List l1;
	Image imgt = tk.getImage("images/imgt.jpg");
	Image imgj = tk.getImage("images/Jeju.jpg");
	Image img = tk.getImage("images/Travel.jpg");
	Image im1,img2,img3;
	
	Font f1 = new Font("Serif",Font.BOLD+Font.HANGING_BASELINE, 25);
	TravelList(String title){
		super(title);
		
		setBounds((screenSize.width)/2-350,(screenSize.height)/2-350, 700, 700);
		setLayout(null);
		
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e){dispose();}});
		this.setResizable(false); // 프레임 확대,축소 안되게 설정!
		//  부분
				li = new Canvas(){
			           public void paint (Graphics g) {
			               g.drawImage(imgj,  0,  0,  this);
			            }
			         };
				li.setBounds(20,280,200,150);
				
		// Canvas 부분 //
		c1 = new Canvas() {
	           public void paint (Graphics g) {
	               g.drawImage(imgt,  0,  0,  this);
	            }
	         };

		c1.setBounds(260,50,410,400);
		c1.setBackground(Color.blue);
		//            List 부분 //
		l1 = new List(5);
		l1.add("함덕 서우봉 해변");
		l1.add("협재 해수욕장");
		l1.add("월정리 해변");
		l1.add("세화 해수욕장");
		l1.add("이호테우 해변");
		l1.setBounds(20,50,200,160);
		l1.setFont(f1);
		l1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 List l1 = (List)e.getSource();
		  String data = l1.getItem(l1.getSelectedIndex());
		  if(data == "함덕 서우봉 해변"){
			  ta.setText("함덕 서우봉 해변입니다.");
			  imgt = tk.getImage("images/tr1.jpg");
			  c1.repaint();
		  }else if (data == "협재 해수욕장"){
			  ta.setText("협재 해수욕장입니다.");
			  imgt = tk.getImage("images/tr2.jpg");
			  c1.repaint();
		  }else if (data == "월정리 해변"){
			  ta.setText("월정리 해변입니다.");
			  imgt = tk.getImage("images/tr3.jpg");
			  c1.repaint();
		  }else if (data == "세화 해수욕장"){
			  ta.setText("세화 해수욕장입니다.");
			  imgt = tk.getImage("images/tr4.jpg");
			  c1.repaint();
		  }else {
			  ta.setText("이호테우 해변입니다.");
			  imgt = tk.getImage("images/tr5.jpg");
			  c1.repaint();
		  }
				
			}
		});
		
		
		
		// TextArea 부분 //
		
		ta = new TextArea("설명 부분",0,0,TextArea.SCROLLBARS_NONE); // 1. 이벤트 소스
				
		
		ta.setBackground(Color.ORANGE);
		ta.setFont(f1);
		ta.setBounds(20,480,650,200);
		ta.setEditable(false);
		
		
		// 프레임에 컨포넌트 붙이기 //
		add(l1); add(c1); add(ta);add(li);
		
		setVisible(true);
	}
	public void paint(Graphics g){
		
		if(img == null){
			return;
		}
		
		g.drawImage(img,0,0,this);
	}
	
	

}
