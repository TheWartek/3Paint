package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.Environment;
import view.MainWindow;
import view.dialogs.NewProjectDialog;

public class NewAction implements ActionListener
{
	private JFrame parent;

	public NewAction(JFrame parent)
	{
		this.parent = parent;
	}

	public void actionPerformed(ActionEvent e)
	{
		String projectName = Environment.wrkman.generateProjectName();
		NewProjectDialog p = new NewProjectDialog(parent, projectName);

		if (!p.isCanceled())
		{
			int width = Integer.parseInt(p.getWidthValue());
			int height = Integer.parseInt(p.getHeightValue());
			Environment.wrkman.newWorkspace(width, height, p.getName());
			((MainWindow) parent).refreshProjectTabs();
		}
	}

}
