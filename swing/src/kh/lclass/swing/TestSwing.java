package kh.lclass.swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestSwing extends JFrame {
	public TestSwing() {
		setTitle("Hello window 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE); //x 버튼 눌러서 resource 정리하고 창 닫기
		
		Container contentPane = getContentPane();
		//contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5)); //창안에 맞춰주는 코드
//		contentPane.setLayout(new BorderLayout(20,30));
//		contentPane.add(new JButton("ok"),BorderLayout.NORTH);
//		contentPane.add(new JButton("Cancel"),BorderLayout.WEST);
//		contentPane.add(new JButton("Ignore"),BorderLayout.EAST);
//		contentPane.add(new JButton("Ignore"),BorderLayout.CENTER);
		
		// component 생성
		JTextField txtName = new JTextField();
		JTextField txtNO = new JTextField();
		JTextField txtMajor = new JTextField();
		JTextField txtSubject = new JTextField();
		JButton btnSave = new JButton("저장");
		
		// event 등록 = Action 리스너 달기
		btnSave.addActionListener(new MyActionListener());
		txtName.addActionListener(new MyActionListener());
			
		

		// component를 contenpane에 추가
		contentPane.setLayout(new GridLayout(5,2,10,10));
		contentPane.add(new JLabel("이름"));
		contentPane.add(txtName);
		contentPane.add(new JLabel("학번"));
		contentPane.add(txtNO);
		contentPane.add(new JLabel("학과"));
		contentPane.add(txtMajor);
		contentPane.add(new JLabel("과목"));
		contentPane.add(txtSubject);
		contentPane.add(btnSave);
		
		
//		contentPane.add(new JButton("저장"));
//		contentPane.add(btnSave);
		
		//윈도우 창크기  true를해야 창이 보여짐 false를쓰면 창이 안보임.
		setSize(300,300);
		setVisible(true);
		
		
		//프레임 종료버튼이 클릭될 때 프레임을 닫고 응용 프로
		//그램이 종료하도록 하는 방법
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		TestSwing frame = new TestSwing();
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("이건 언제 호출되지??");
			System.out.println(e);
			Object source = e.getSource();
			if (source instanceof JTextField) {

				System.out.println("JTextField에서 enter가 눌렀네요");
				if (((JTextField) source).getText().trim().length() == 0) {
					((JTextField) source).setText("이름을 입력해주세요");
				} else {
					((JTextField) source).setText(((JTextField)source).getText().trim());
				}
			} else if (source instanceof JTextField) {

				{
					System.out.println("text 필드에서 enter key를 눌렀네요.");
				}
			}
		}
	}
}
	

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("이건 언제 호출되지??");
			System.out.println(e);
			Object source = e.getSource();
			if (source instanceof JButton) {

				System.out.println("button 눌렀네요");
				if (((JButton) source).getText().equals("저장")) {
					((JButton) source).setText("Save");
				} else {
					((JButton) source).setText("저장");
				}
			} else if (source instanceof JTextField) {

				{
					System.out.println("text 필드에서 enter key를 눌렀네요.");
				}
			}
		}
	}
