package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.LayerNotFoundException;

public class LayerManager implements LayerOperations {
    private List<Layer> layers = new ArrayList<Layer>();
    private int activeLayer;

    @Override
    public Layer getLayer(int n) throws LayerNotFoundException {
	if (n >= layers.size() || n < 0) {
	    throw new LayerNotFoundException("Index out of range.");
	}

	return layers.get(n);
    }

    @Override
    public Layer getLayer(String name) throws LayerNotFoundException {
	Layer result = null;

	for (Layer l : layers) {
	    if (l.getName().equals(name)) {
		result = l;
		break;
	    }
	}

	if (result == null) {
	    throw new LayerNotFoundException("No Layer with the specified name.");
	}

	return result;
    }

    @Override
    public Layer getLayerById(long id) throws LayerNotFoundException {
	Layer result = null;

	for (Layer l : layers) {
	    if (l.getId() == id) {
		result = l;
		break;
	    }
	}

	if (result == null) {
	    throw new LayerNotFoundException("No Layer with the specified ID.");
	}

	return result;
    }

    @Override
    public Layer getActiveLayer() throws LayerNotFoundException {
	Layer result = null;

	try {
	    result = getLayer(activeLayer);
	} catch (LayerNotFoundException e) {
	    System.err.println("[Error] No active layer. There has to be one active layer at least.");
	    throw e;
	}

	return result;
    }

    @Override
    public void hideLayer(int n) throws LayerNotFoundException {
	getLayer(n).hide();
    }

    @Override
    public void hideLayer(String name) throws LayerNotFoundException {
	getLayer(name).hide();
    }

    @Override
    public void hideLayerById(long id) throws LayerNotFoundException {
	getLayerById(id).hide();
    }

    @Override
    public void showLayer(int n) throws LayerNotFoundException {
	getLayer(n).show();
    }

    @Override
    public void showLayer(String name) throws LayerNotFoundException {
	getLayer(name).show();

    }

    @Override
    public void showLayerById(long id) throws LayerNotFoundException {
	getLayerById(id).show();
    }
}
