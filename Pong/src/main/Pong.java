package main;

import javax.swing.JFrame;



public class Pong  extends JFrame {
	public static final int  WINDOW_WIDTH = 800;
	public static final int  WINDOW_HEIGHT = 600;
	public static final String WINDOW_TITLE = "Pong";

	
	public Pong() {
    	setTitle(WINDOW_TITLE);
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	setResizable(false);
    	add(new PongPanel());
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
}

	public static void main(String[] args) {
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
			 
			 public void run() {
		 
				 new Pong();

			 }

		 });
	}
}
