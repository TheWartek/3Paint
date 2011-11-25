package model;

import java.awt.image.BufferedImage;

public interface ImageOperations {
    void putPixel(int x, int y, int rgb);
    int  getPixel(int x, int y);
    BufferedImage getImage();
}
