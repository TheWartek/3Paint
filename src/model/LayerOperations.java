package model;

import exceptions.LayerNotFoundException;

public interface LayerOperations {
    Layer getLayer(int n) throws LayerNotFoundException;
    Layer getLayer(String name) throws LayerNotFoundException;
    Layer getLayerById(long id) throws LayerNotFoundException;
    Layer getActiveLayer() throws LayerNotFoundException;
    Layer getLastLayer() throws LayerNotFoundException;
    void hideLayer(int n) throws LayerNotFoundException;
    void hideLayer(String name) throws LayerNotFoundException;
    void hideLayerById(long id) throws LayerNotFoundException;
    void showLayer(int n) throws LayerNotFoundException;
    void showLayer(String name) throws LayerNotFoundException;
    void showLayerById(long id) throws LayerNotFoundException;
    void addLayer();
    void addLayer(String name);
}
