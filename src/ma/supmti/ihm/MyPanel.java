package ma.supmti.ihm;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	private Boolean isRectangle, isCercle;
	
	public MyPanel() {
		isRectangle = isCercle = Boolean.FALSE;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(isRectangle) {
			g.drawRect(80, 20, 120, 60);
		} else if(isCercle) {
			g.drawOval(80, 20, 120, 120);
		}
		repaint();
	}
	
	public void setRectangle() {
		isCercle = Boolean.FALSE;
		isRectangle = Boolean.TRUE;
	}
	
	public void setCercle() {
		isCercle = Boolean.TRUE;
		isRectangle = Boolean.FALSE;
	}

}
