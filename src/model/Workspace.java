package model;

public class Workspace {
    private LayerManager lm;
    private int width = 0;
    private int height = 0;
    private String name;
    
    public Workspace(int width, int height, String name) {
	lm = new LayerManager(width, height);
	this.width = width;
	this.height = height;
	this.name = name;
    }
}
