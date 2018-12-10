package Game;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
//
public class RSPGUI extends JFrame implements ActionListener, constants {


	private JComboBox choice = new JComboBox();
	private JTextArea output = new JTextArea(100, 100);
	private JScrollPane scroll = new JScrollPane(output);
	private JButton Play = new JButton("Play");
	private JButton Record = new JButton("Record");
	private JButton quit = new JButton("quit");
	private JPanel top = new JPanel();
	private JPanel mid = new JPanel();
	private JPanel low = new JPanel();
	private String[] choices = { "ROCK", "PAPER", "SCISSORS" };
	private String result;
	private int playercount;
	private int computercount;
	private Tracker gm;
	private int count;
	ImageIcon img = new ImageIcon("loser.jpg");
	ImageIcon win = new ImageIcon("winner.jpg");
	ImageIcon tie = new ImageIcon("tieGame.png");
//GUI 
	public RSPGUI() {
		setVisible(true);
		setSize(500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(1, 2);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(mid);
		add(low);
		mid.add(choice);
		choice.setModel(new DefaultComboBoxModel(choices));
		choice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String C = choice.getSelectedItem().toString();

			}
		});

		mid.add(Play);
		Play.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String C = choice.getSelectedItem().toString();
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
					count++;
					
					JOptionPane.showMessageDialog(null, "DRAW, Play again", result,
							JOptionPane.INFORMATION_MESSAGE,tie);
				} else {
					switch (computerHand) {

					case ROCK:
						if (C.equals(SCISSORS)) {
							result = ("WINNER");
							playercount++;
							count++;
							
								JOptionPane.showMessageDialog(null, "Great JOB! You Won!", result,
										JOptionPane.INFORMATION_MESSAGE,win);
		
						} else if (C.equals(PAPER)) {
							result = ("LOSER");
							computercount++;
							count++;

							JOptionPane.showMessageDialog(null, "Better Luck Next Time! You Lost!", result,
									JOptionPane.INFORMATION_MESSAGE,img);
	
						}
						break;
					case PAPER:
						if (C.equals(SCISSORS)) {
							result = ("LOSER");
							computercount++;
							count++;
							JOptionPane.showMessageDialog(null, "Better Luck Next Time! You Lost!", result,
									JOptionPane.INFORMATION_MESSAGE,img);
						} else if (C.equals(ROCK)) {
							result = ("Winner");
							playercount++;
							count++;
							JOptionPane.showMessageDialog(null, "Great JOB! You won!", result,
									JOptionPane.INFORMATION_MESSAGE,win);
						}
						break;
					case SCISSORS:
						if (C.equals(ROCK)) {
							result = ("LOSER");
							computercount++;
							count++;
							JOptionPane.showMessageDialog(null, "Better Luck Next Time! You Lost!", result,
									JOptionPane.INFORMATION_MESSAGE,img);
						} else if (C.equals(PAPER)) {
							result = ("WINNER");
							playercount++;
							count++;
							JOptionPane.showMessageDialog(null, "Great JOB! You won!", result,
									JOptionPane.INFORMATION_MESSAGE,win);
						}

					}
				}
			}

		});

		mid.add(Record);
		Record.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {	
				//ADDS RESULTS AND DISPLAYS RESULTS FROM GUI
			Tracker game = new Tracker(result,computercount, playercount,count);
			game.addScore(result, computercount, playercount,count);
			output.append(game.toString() + "\n");
			if(playercount > computercount ) {
				output.append("you're winning more than you're losing , a great Tactician" + "\n");
			}
			
			if(computercount> playercount) {
				output.append("Luck is not on your side" + "\n");
			}
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
		low.add(scroll);

	}

	public static void main(String[] args) {
		RSPGUI game = new RSPGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}