import java.awt.Color;

import javax.swing.JButton;

public class Bottone extends JButton {

	/*
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipo;
	private boolean rivelata=false;
	
//	URL u0= getClass().getResource("png/display.png");
//	ImageIcon display = new ImageIcon(u0);
//	URL u1= getClass().getResource("png/001-dog.png");
//	ImageIcon dog = new ImageIcon(u1);
//	URL u2= getClass().getResource("png/002-cat.png");
//	ImageIcon cat = new ImageIcon(u2);
//	URL u3= getClass().getResource("png/003-frog.png");
//	ImageIcon frog = new ImageIcon(u3);
//	URL u4= getClass().getResource("png/004-chick.png");
//	ImageIcon chick = new ImageIcon(u4);
//	URL u5= getClass().getResource("png/005-elephant.png");
//	ImageIcon elephant = new ImageIcon(u5);
//	URL u6= getClass().getResource("png/006-jellyfish.png");
//	ImageIcon jellyfish = new ImageIcon(u6);
//	URL u7= getClass().getResource("png/007-whale.png");
//	ImageIcon whale = new ImageIcon(u7);
//	URL u8= getClass().getResource("png/008-crab.png");
//	ImageIcon crab = new ImageIcon(u8);
	
	
	public Bottone(String tipo) {
		super();
		this.tipo = tipo;
		this.setBackground(new Color(204, 166, 166));
	}
	
	public boolean isRivelata() {
		return rivelata;
	}

	public void setRivelata(boolean rivelata) {
		this.rivelata = rivelata;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
//	public void gira() {
//		if(this.getIcon().equals(display)) {
//			if(this.getTipo().equals("a")) {
//				this.setIcon(dog);
//			}else if(this.getTipo().equals("b")) {
//				this.setIcon(cat);
//			}else if(this.getTipo().equals("c")) {
//				this.setIcon(frog);
//			}else if(this.getTipo().equals("d")) {
//				this.setIcon(chick);
//			}else if(this.getTipo().equals("e")) {
//				this.setIcon(elephant);
//			}else if(this.getTipo().equals("f")) {
//				this.setIcon(jellyfish);
//			}else if(this.getTipo().equals("g")) {
//				this.setIcon(whale);
//			}else if(this.getTipo().equals("h"))
//				this.setIcon(crab);
//		}
//		else this.setIcon(display);
//	}

	
	
}
