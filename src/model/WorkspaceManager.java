package model;

import java.util.ArrayList;
import java.util.List;

public class WorkspaceManager {
    private List<Workspace> wrks = new ArrayList<Workspace>();
    
    public void newWorkspace(int width, int height, String name) {
	wrks.add(new Workspace(width, height, name));
    }
}
