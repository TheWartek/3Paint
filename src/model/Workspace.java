package model;

public class Workspace {
    public LayerManager layerManager;
    private int width = 0;
    private int height = 0;
    private String name;
    private boolean saved = false;
    
    public Workspace(int width, int height, String name) {
	layerManager = new LayerManager(width, height);
	this.width = width;
	this.height = height;
	this.name = name;
    }
    
    public boolean isSaved() {
	return saved;
    }
    
    public String getName() {
	return name;
    }
    
    public int getWidth() {
	return width;
    }
    
    public int getHeight() {
	return height;
    }
}
