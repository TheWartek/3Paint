package controller;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisposeAction implements ActionListener
{
	private Window window;

	public DisposeAction(Window w)
	{
		window = w;
	}

	public void actionPerformed(ActionEvent e)
	{
		window.dispose();
	}
}
