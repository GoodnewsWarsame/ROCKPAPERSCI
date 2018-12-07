package Game;

import java.awt.FlowLayout;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.Random;
import javax.swing.JOptionPane;

import javax.swing.*;

/*
 * Creating Gui and the frame includes: labels, text fields, and a selection of RPS, and 3 buttons.
 * 
 */

public class RSPGui extends JFrame implements ActionListener, Constants {

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

	private Game gm;
	
	/*
	 * @layout of RSPGui includes selection of Rock paper or Scissors
	 * 
	 */

	public RSPGui() {

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
/*
 * @computershand generates the choice of RPS for computer
 */
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
				
				/*
				 * @logic to determine the outcome of each choice of playerHand and computerHand
				 * 
				 */

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
				/*
				 * @output with total wins of each player and overall winner
				 */

				output.append(result + " \n" + " Player wins " + playercount + "Computer wins " + computercount + "\n");

				if (playercount > computercount) {
					JOptionPane.showMessageDialog(null, "Great JOB! You won!", "Result",
							JOptionPane.INFORMATION_MESSAGE);
				} else {

					JOptionPane.showMessageDialog(null, "Good TRY! You lost!", "Result",
							JOptionPane.INFORMATION_MESSAGE);

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

		RSPGui game = new RSPGui();

	}

	@Override

	public void actionPerformed(ActionEvent e) {

	}

}