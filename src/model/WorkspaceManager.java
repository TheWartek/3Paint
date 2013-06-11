package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.WorkspaceNotFoundException;

public class WorkspaceManager
{
	private List<Workspace> wrks = new ArrayList<Workspace>();

	/**
	 * Creates new workspace/project.
	 * 
	 * @param width
	 *            Width in pixels.
	 * @param height
	 *            Height in pixels.
	 * @param name
	 *            Name of the project.
	 */
	public void newWorkspace(int width, int height, String name)
	{
		wrks.add(new Workspace(width, height, name));
	}

	/**
	 * Returns number of opened projects.
	 * 
	 * @return Number of projects.
	 */
	public int numOfWorkspaces()
	{
		return wrks.size();
	}

	/**
	 * Saves all unsaved projects.
	 */
	public void saveAllProjects()
	{
		System.out.println("Saving projects");
	}

	/**
	 * Checks if unsaved projects exists.
	 * 
	 * @return "True" if at least one unsaved project exists.
	 */
	public boolean unsavedProjects()
	{
		for (Workspace w : wrks)
		{
			if (!w.isSaved())
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Generates unique name of new project.
	 * 
	 * @return Unique project name.
	 */
	public String generateProjectName()
	{
		return "Untitled-" + wrks.size();
	}

	public Workspace getLast() throws WorkspaceNotFoundException
	{
		if (wrks.size() == 0)
		{
			throw new WorkspaceNotFoundException("No workspaces found.");
		} else
		{
			return wrks.get(wrks.size() - 1);
		}
	}
}
