package model;

public class Workspace {
    private LayerManager lm;
    private int width = 0;
    private int height = 0;
    private String name;
    private boolean saved = false;
    
    public Workspace(int width, int height, String name) {
	lm = new LayerManager(width, height);
	this.width = width;
	this.height = height;
	this.name = name;
    }
    
    public boolean isSaved() {
	return saved;
    }
}
