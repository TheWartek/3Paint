package exceptions;

public class WorkspaceNotFoundException extends Exception
{
	private static final long serialVersionUID = -4058648222511806919L;

	public WorkspaceNotFoundException()
	{
	}

	public WorkspaceNotFoundException(String msg)
	{
		super(msg);
	}
}
