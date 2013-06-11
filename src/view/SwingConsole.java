package view;

import javax.swing.JFrame;

public class SwingConsole
{
	public static void run(JFrame frame, String title, int width, int height)
	{
		frame.setTitle(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
	}
}
