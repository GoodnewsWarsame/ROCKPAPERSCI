package Game;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class RSPGUI extends JFrame implements ActionListener, constants {

	private JLabel userName = new JLabel("UserName");
	private JLabel Bio = new JLabel("Bio");
	private JTextField bioTxt = new JTextField(10);
	private JTextField userTxt = new JTextField(10);
	private JComboBox Choice = new JComboBox();
	private JTextArea output = new JTextArea(300, 100);
	private JScrollPane Scroll = new JScrollPane(output);
	private JButton Play = new JButton("Play");
	private JButton Result = new JButton("Result");
	private JButton quit = new JButton("quit");
	private JPanel top = new JPanel();
	private JPanel mid = new JPanel();
	private JPanel low = new JPanel();
	private String[] choices = { "ROCK", "PAPER", "SCISSORS" };
	private String result;
	private int playercount;
	private int computercount;
	private Tracker gm;

	public RSPGUI() {
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(1, 2);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(mid);
		add(low);
		mid.add(Choice);
		Choice.setModel(new DefaultComboBoxModel(choices));
		Choice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C = Choice.getSelectedItem().toString();

			}
		});

		mid.add(Play);
		Play.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String C = Choice.getSelectedItem().toString();
				String computerHand = "";
				Random rand = new Random();

				int x = rand.nextInt(3);
				switch (x) {
				case 0:
					computerHand = ROCK;
					break;
				case 1:
					computerHand = PAPER;
					break;
				case 2:
					computerHand = SCISSORS;
					break;
				}
				if (C.equals(computerHand)) {
					result = "TIE";
				} else {
					switch (computerHand) {

					case ROCK:
						if (C.equals(SCISSORS)) {
							result = ("WINNER");
							playercount++;

						} else if (C.equals(PAPER)) {
							result = ("LOSER");
							computercount++;
						}
						break;
					case PAPER:
						if (C.equals(SCISSORS)) {
							result = ("LOSER");
							computercount++;
						} else if (C.equals(ROCK)) {
							result = ("Winner");
							playercount++;
						}
						break;
					case SCISSORS:
						if (C.equals(ROCK)) {
							result = ("LOSER");
							computercount++;
						} else if (C.equals(PAPER)) {
							result = ("WINNER");
							playercount++;
						}

					}
				}
			}

		});

		mid.add(Result);
		Result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {	

			Tracker lm = new Tracker(result,computercount, playercount);
			lm.addScore(result, computercount, playercount);
			output.append(lm.toString() + "");
			}catch(NullPointerException ex) {
				System.out.println("Naaah");
			}
			
			

			}

		});
		mid.add(quit);
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		low.add(Scroll);

	}

	public static void main(String[] args) {
		RSPGUI game = new RSPGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}