package view.components;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import model.Layer;
import model.Workspace;
import exceptions.LayerNotFoundException;

public class PaintComponent extends JPanel implements MouseListener, MouseMotionListener {
    private static final long serialVersionUID = 1L;
    private Workspace wrk;
    
    public PaintComponent(Workspace w) {
	setLayout(new FlowLayout());
	wrk = w;
	setPreferredSize(new Dimension(w.getWidth(), w.getHeight()));
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
	
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
	
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
	
    }

    @Override
    public void mousePressed(MouseEvent arg0) {

    }

    @Override
    public void mouseReleased(MouseEvent arg0) {

    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
	
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
	
    }
    
    @Override
    public void paintComponent(Graphics g) {
	Layer l = null;
	try {
	    l = wrk.layerManager.getActiveLayer();
	} catch (LayerNotFoundException e) {
	    e.printStackTrace();
	}
	g.drawImage(l.getImage(), 0, 0, null);
    }
}
