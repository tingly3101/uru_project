package org.example;

import com.digitalpersona.uareu.Fid;
import com.digitalpersona.uareu.Fid.Fiv;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImagePanel 
	extends JPanel
{
	private static final long serialVersionUID = 5;
	private BufferedImage m_image;

	int counter = 1;
	public void showImage(Fid image){
		Fiv view = image.getViews()[0];
		m_image = new BufferedImage(view.getWidth(), view.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
		m_image.getRaster().setDataElements(0, 0, view.getWidth(), view.getHeight(), view.getImageData());
		repaint();
	} 
	
	public void paint(Graphics g) {
		g.drawImage(m_image, 0, 0, null);
	}

}
