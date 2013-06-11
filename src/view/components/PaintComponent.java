package view.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import model.Layer;
import model.Workspace;
import exceptions.LayerNotFoundException;

public class PaintComponent extends JPanel implements MouseListener, MouseMotionListener
{
	private static final long serialVersionUID = 1L;
	private Workspace wrk;

	public PaintComponent(Workspace w)
	{
		wrk = w;
		setPreferredSize(new Dimension(w.getWidth(), w.getHeight()));
	}

	@Override
	public void mouseClicked(MouseEvent arg0)
	{

	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{

	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{

	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{

	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{

	}

	@Override
	public void mouseDragged(MouseEvent arg0)
	{

	}

	@Override
	public void mouseMoved(MouseEvent arg0)
	{

	}

	@Override
	public void paintComponent(Graphics g)
	{
		Layer l = null;
		try
		{
			l = wrk.layerManager.getActiveLayer();
		}
		catch (LayerNotFoundException e)
		{
			e.printStackTrace();
		}
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Color start = new Color(60, 60, 60, 255);
		Color stop = new Color(60, 60, 60, 0);

		// ---Draw gradient border---//
		// corner
		Paint p = new GradientPaint(wrk.getWidth() - 2, wrk.getHeight() - 2, start, wrk.getWidth() + 5, wrk.getHeight() + 5, stop);
		graphics.setPaint(p);
		graphics.fillRoundRect(wrk.getWidth() - 5, wrk.getHeight() - 5, 10, 10, 10, 10);
		graphics.setPaint(Color.GRAY);
		// delete unused parts of corner
		graphics.fillRect(wrk.getWidth() - 5, wrk.getHeight(), 5, 5);
		graphics.fillRect(wrk.getWidth(), wrk.getHeight() - 5, 5, 5);
		// right
		p = new GradientPaint(wrk.getWidth(), 0, start, wrk.getWidth() + 5, 0, stop);
		graphics.setPaint(p);
		graphics.fillRect(wrk.getWidth(), 0, wrk.getWidth() + 5, wrk.getHeight());
		// bottom
		p = new GradientPaint(0, wrk.getHeight(), start, 0, wrk.getHeight() + 5, stop);
		graphics.setPaint(p);
		graphics.fillRect(0, wrk.getHeight(), wrk.getWidth(), wrk.getHeight() + 5);
		graphics.drawImage(l.getImage(), 0, 0, null);
	}
}
