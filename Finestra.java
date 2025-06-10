import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class Finestra extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra frame = new Finestra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static Integer[] riordina(Integer[] intArray) {

		List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);

		intList.toArray(intArray);

		// System.out.println(Arrays.toString(intArray));

		return intArray;
	}

	private Bottone[] carte = { 
			
			new Bottone("a"),
			new Bottone("b"),
			new Bottone("c"),
			new Bottone("d"),
			new Bottone("e"),
			new Bottone("f"),
			new Bottone("g"),
			new Bottone("h"),
			
			new Bottone("a"),
			new Bottone("b"),
			new Bottone("c"),
			new Bottone("d"),
			new Bottone("e"),
			new Bottone("f"),
			new Bottone("g"),
			new Bottone("h") };

	private JPanel panel = new JPanel();

	private JButton singlePlayer = new JButton("singlePlayer");

	private JButton crediti = new JButton("Crediti");

	private JButton multiPlayer = new JButton("multiPlayer");

	JPanel panel_1 = new JPanel();

	/**
	 * Create the frame.
	 */

	public Finestra() {
		textField.setColumns(10);
		setBackground(new Color(201, 232, 176));
		URL u0 = getClass().getResource("png/child-game.png");
		ImageIcon display = new ImageIcon(u0);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 70, 675, 100);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 163, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 4, 4, 0));
		panel.setVisible(false);

		panel_1.setBackground(new Color(166, 218, 165));
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		singlePlayer.setForeground(new Color(0, 64, 0));
		singlePlayer.setBackground(new Color(128, 255, 128));
		singlePlayer.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		singlePlayer.addActionListener(this);
		panel_1.add(singlePlayer);

		// panel_1.add(crediti);
		// crediti.addActionListener(this);

		multiPlayer.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		multiPlayer.setBackground(new Color(255, 0, 0));
		multiPlayer.setForeground(new Color(128, 0, 0));
		panel_1.add(multiPlayer);

		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setText(
				"<a href=\"https://www.flaticon.com/free-icons/memory-game\" title=\"memory-game icons\">Memory-game icons created by Freepik - Flaticon</a>"
						+ "<div>Icons made by <a href=\"https://www.flaticon.com/authors/flat-icons\" title=\"Flat Icons\">Flat Icons</a> from <a href=\"https://www.flaticon.com/\""
						+ " title=\"Flaticon\">www.flaticon.com</a></div><div>Icons made by <a href=\"https://www.flaticon.com/authors/smashicons\" title=\"Smashicons\">Smashicons</a>"
						+ " from <a href=\"https://www.flaticon.com/\" title=\"Flaticon\">www.flaticon.com</a></div><div>Icons made by <a href=\"https://www.freepik.com\" "
						+ "title=\"Freepik\">Freepik</a> from <a href=\"https://www.flaticon.com/\" title=\"Flaticon\">www.flaticon.com</a></div>"
						+ "<a href=\"https://www.flaticon.com/free-icons/memory-game\" title=\"memory-game icons\">Memory-game icons created by Freepik - Flaticon</a>");
		textField.setVisible(false);
		multiPlayer.addActionListener(this);

		Integer[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		intArray = riordina(intArray);

		for (int i = 0; i < carte.length; i++) {
			panel.add(carte[intArray[i]]);
			carte[intArray[i]].setIcon(display);
			carte[intArray[i]].addActionListener(this);
		}

	}

	private String paragone;
	private int numeroPrima;
	private int numeroSeconda;
	private int coppieTrovate;

	private boolean multi = false;
	private boolean primaCarta = true;
	private final JTextField textField = new JTextField();

	@Override
	public void actionPerformed(ActionEvent e) {
		URL u1 = getClass().getResource("png/001-dog.png");
		ImageIcon dog = new ImageIcon(u1);
		URL u2 = getClass().getResource("png/002-cat.png");
		ImageIcon cat = new ImageIcon(u2);
		URL u3 = getClass().getResource("png/003-frog.png");
		ImageIcon frog = new ImageIcon(u3);
		URL u4 = getClass().getResource("png/004-chick.png");
		ImageIcon chick = new ImageIcon(u4);
		URL u5 = getClass().getResource("png/005-elephant.png");
		ImageIcon elephant = new ImageIcon(u5);
		URL u6 = getClass().getResource("png/006-jellyfish.png");
		ImageIcon jellyfish = new ImageIcon(u6);
		URL u7 = getClass().getResource("png/007-whale.png");
		ImageIcon whale = new ImageIcon(u7);
		URL u8 = getClass().getResource("png/008-crab.png");
		ImageIcon crab = new ImageIcon(u8);

		if (e.getSource() == singlePlayer) {
			panel.setVisible(true);
			multiPlayer.removeActionListener(this);
			multiPlayer.setBackground(new Color(0, 0, 0));
			setBounds(400, 70, 675, 700);
			setLocationRelativeTo(null);
		}
		if (e.getSource() == multiPlayer) {
			panel.setVisible(true);
			multi = true;
			singlePlayer.removeActionListener(this);
			singlePlayer.setBackground(new Color(0, 0, 0));
			setBounds(400, 70, 675, 700);
			setLocationRelativeTo(null);
		}
		if (e.getSource() == crediti) {
			textField.setVisible(true);
		}
		for (int i = 0; i < carte.length; i++) {

			if (e.getSource() == carte[i] && carte[i].isRivelata() == false && carte[i] != carte[numeroPrima]) {
				// carte[i].gira();
				carte[i].setBackground(new Color(204, 166, 166));
				if (carte[i].getTipo().equals("a")) {
					carte[i].setIcon(dog);
				} else if (carte[i].getTipo().equals("b")) {
					carte[i].setIcon(cat);
				} else if (carte[i].getTipo().equals("c")) {
					carte[i].setIcon(frog);
				} else if (carte[i].getTipo().equals("d")) {
					carte[i].setIcon(chick);
				} else if (carte[i].getTipo().equals("e")) {
					carte[i].setIcon(elephant);
				} else if (carte[i].getTipo().equals("f")) {
					carte[i].setIcon(jellyfish);
				} else if (carte[i].getTipo().equals("g")) {
					carte[i].setIcon(whale);
				} else if (carte[i].getTipo().equals("h"))
					carte[i].setIcon(crab);

				if (primaCarta) {
					paragone = carte[i].getTipo();
					numeroPrima = i;
					primaCarta = false;
				} else {
					primaCarta = true;
					numeroSeconda = i;
					controllo(paragone, numeroPrima, carte[i].getTipo(), numeroSeconda);
				}
			}
		}
	}

	private boolean alternatore = true;
	private int rosso = 0;
	private int verde = 0;

	public void controllo(String prima, int n1, String seconda, int n2) {
		URL u0 = getClass().getResource("png/child-game.png");
		ImageIcon display = new ImageIcon(u0);

		if (multi) {
			if (prima.equals(seconda)) {

				if (alternatore == true) {
					carte[n1].setBackground(new Color(255, 0, 0));
					carte[n2].setBackground(new Color(255, 0, 0));
					rosso++;
				} else {
					carte[n1].setBackground(new Color(128, 255, 128));
					carte[n2].setBackground(new Color(128, 255, 128));
					verde++;
				}

				carte[n1].setRivelata(true);

				carte[n2].setRivelata(true);

				if (rosso>=carte.length/4+1 || verde>=carte.length/4+1) {
					if (rosso > verde) {
						for (int i = 0; i < carte.length; i++) {
							carte[i].setBackground(new Color(255, 0, 0));
							
						}
						JOptionPane.showMessageDialog(this, "il rosso ha trovato più coppie e vince!");
						System.exit(0);
					} else if (verde > rosso) {
						for (int i = 0; i < carte.length; i++) {
							carte[i].setBackground(new Color(128, 255, 128));
							
						}
						JOptionPane.showMessageDialog(this, "il verde ha trovato più coppie e vince!");
						System.exit(0);
					} else {
						JOptionPane.showMessageDialog(this, "Tutte le coppie sono state trovate! Pareggio!");
						System.exit(0);
					}
				}

			} else {
				if (alternatore == true) {
					alternatore = false;
				} else {
					alternatore = true;
				}
				for (int i = 0; i < carte.length; i++) {
					
					carte[i].removeActionListener(this);
					
				}	
				Timer timer = new Timer(600, e -> {
					carte[n1].setIcon(display);
					carte[n2].setIcon(display);
					for (int i = 0; i < carte.length; i++) {
						
						carte[i].addActionListener(this);
						
					}
				});
				timer.setRepeats(false);
				timer.start();
			}

		} else {
			if (prima.equals(seconda)) {
				carte[n1].setRivelata(true);
				carte[n2].setRivelata(true);
				coppieTrovate++;
				if (coppieTrovate == carte.length / 2) {
					JOptionPane.showMessageDialog(this, "Hai trovato tutte le coppie! Hai vinto!");
					System.exit(0);
				}
			} else {
				for (int i = 0; i < carte.length; i++) {

					carte[i].removeActionListener(this);

				}	
				Timer timer = new Timer(600, e -> {
					carte[n1].setIcon(display);
					carte[n2].setIcon(display);
					for (int i = 0; i < carte.length; i++) {

						carte[i].addActionListener(this);

					}	
				});
				timer.setRepeats(false);
				timer.start();
			}
		}
	}

}
