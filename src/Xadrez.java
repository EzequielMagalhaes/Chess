import javax.swing.*;
import java.awt.*;

public class Xadrez extends JFrame{
	public Xadrez() {
		super("XADREZ");
		this.setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void paint(Graphics g) {
		super.paint(g);
		boolean chave = false;
		
		for(int lin = 0; lin < 8; lin += 1) {
			for(int col = 0; col < 8; col += 1) {
//				g.setColor(((col + lin) % 2 == 0) ? Color.BLACK : Color.WHITE);
				g.setColor((chave = !chave) ? Color.BLACK : Color.WHITE);
				g.fillRect((col * 50) + 35, (lin * 50) + 35, 50, 50);
			}
			chave = !chave;
		}
	}
	
	public static void main(String[] args) {
		new Xadrez();
	}
}
