package model;

public class Environment {
    public static WorkspaceManager wrkman;
    
    public static void wrkmanInit() {
	wrkman = new WorkspaceManager();
    }
}
