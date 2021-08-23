import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MenuActionEventEx extends Frame{
    String name[]={"Color","Font","Left","Right"};
    MenuItem mi[]=new MenuItem[4];
    Label la;
    MenuActionEventEx(){
        this.setTitle("Menu에 Action리스너 만들기 예제");
        this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
			public void windowClosing(WindowEvent e) { // 오버라이딩
				dispose(); // 프로그램 종료
			}
		});
        // 메뉴 부분
        MenuBar mb = new MenuBar();
        Menu jm = new Menu("Text");
        // Label 부분
        la = new Label("Java~~");
        la.setAlignment(Label.CENTER);
        
        for(int i=0; i<mi.length; i++){
            mi[i]=new MenuItem(name[i]);
            mi[i].addActionListener(new MyActionListener());
            jm.add(mi[i]);
        }
        mb.add(jm);
        this.setMenuBar(mb);
        this.add(la);
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setVisible(true);
    }
    
    class MyActionListener implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
            MenuItem item = (MenuItem)e.getSource();
            if(item==mi[0]){
                la.setForeground(Color.blue);
            }
            else if(item==mi[1]){
                la.setFont(new Font("Ravie", Font.ITALIC, 30));
            }
            else if(item==mi[2]){
                la.setAlignment(Label.LEFT);
            }
            else if(item==mi[3]){
                la.setAlignment(Label.RIGHT);
            }
        }
        
    }
}



