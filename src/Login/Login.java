package Login;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import  java.awt.TextField;
import javax.swing.JPasswordField;
import Game.RSPGUI;
//
public class Login extends JFrame {
	private JPanel top = new JPanel();
	private JPanel bttm = new JPanel();
	private JTextField usernTxt = new JTextField(10);
	private JPasswordField passTxt = new JPasswordField(10);
	private JLabel userlbl = new JLabel("Username");
	private JLabel passlbl = new JLabel("Password");
	private JButton Login = new JButton("Login");
	private JButton Create = new JButton("Create User");
	private UserInfo user = new UserInfo();

	public Login() {
		JFrame log = new JFrame();
		log.setVisible(true);
		log.setSize(200, 200);
		log.setTitle("Log in");
		log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(2, 1);
		FlowLayout flow = new FlowLayout();
		log.setLayout(grid);
		log.add(top);
		log.add(bttm);
		top.add(userlbl);
		top.add(usernTxt);
		top.add(passlbl);
		top.add(passTxt);
		bttm.add(Create);
		Create.addActionListener(new AddBtnListener());
		bttm.add(Login);
		Login.addActionListener(new AddBtnListener());

	}

	public static void main(String[] args) {
		Login log = new Login();

	}

	private class AddBtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String Callingbtn = e.getActionCommand();
			if (Callingbtn.equals("Create User")) {
				String temp1 = usernTxt.getText();
				String temp2 = passTxt.getText();

				user.addUser(temp1, temp2);
				System.out.println("You have created an Account ");
				usernTxt.setText("");
				passTxt.setText("");
				JOptionPane.showMessageDialog(null, "Great JOB! You Created an Account!");

			}

			if (Callingbtn.equals("Login")) {
				String temp1 = usernTxt.getText();
				String myPass=String.valueOf(passTxt.getPassword());
				String temp2 = myPass;
			
				
				if (user.Search(temp1, temp2) == true) {
					usernTxt.setText("");
					passTxt.setText("");
					JOptionPane.showMessageDialog(null, "Great JOB! You Logged in!");
					RSPGUI gui = new RSPGUI();

				}
				
					else if (user.Search(temp1, temp2) == false) {
						JOptionPane.showMessageDialog(null, "Incorrect username or Password");
					
				}
			}
		}
	}
}
