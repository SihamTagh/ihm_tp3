package ma.supmti.ihm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton rectangle, cercle;
	MyPanel panel;
	
	public MyFrame() {
		initFrameProperties();
		rectangle = new JButton("Rectangle");
		cercle = new JButton("Cercle");
		panel = new MyPanel();
		
		setLayout(new BorderLayout());
		add(rectangle, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(cercle, BorderLayout.SOUTH);
		rectangle.addActionListener(this);
		cercle.addActionListener(this);
	}
	
	private void initFrameProperties() {
		// Titre
		this.setTitle("My Frame");

		// Position et dimention
		this.setSize(250, 250);
		FrameUtils.centreWindow(this);

		// Terminer le programme en cas de fermeture de cette fenetre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Rendre la fenetre visible
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == rectangle) {
			panel.setRectangle();
		} else if( e.getSource() == cercle) {
			panel.setCercle();
		}
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
