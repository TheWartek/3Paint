package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Layer implements ImageOperations
{
	private BufferedImage img;
	private long id;
	private boolean visible;
	private String name;

	public Layer(long id, int width, int height)
	{
		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);
		this.id = id;
		name = "Layer" + id;
	}

	public Layer(long id, String name, int width, int height)
	{
		this(id, width, height);
		this.name = name;
	}

	public boolean isVisible()
	{
		return visible;
	}

	public void show()
	{
		visible = true;
	}

	public void hide()
	{
		visible = false;
	}

	public long getId()
	{
		return id;
	}

	public void setName(String newName)
	{
		name = newName;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public void putPixel(int x, int y, int rgb)
	{
		img.setRGB(x, y, rgb);

	}

	@Override
	public int getPixel(int x, int y)
	{
		return img.getRGB(x, y);
	}

	@Override
	public BufferedImage getImage()
	{
		return img;
	}

}
