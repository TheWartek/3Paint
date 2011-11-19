package model;

public class Workspace {
    private LayerManager lm;
    private int width = 0;
    private int height = 0;
    
    public Workspace(int width, int height) {
	lm = new LayerManager(width, height);
	this.width = width;
	this.height = height;
    }
}
