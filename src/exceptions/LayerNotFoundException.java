package exceptions;

public class LayerNotFoundException extends Exception {
    private static final long serialVersionUID = 2259113194736030689L;
    
    public LayerNotFoundException() {}
    public LayerNotFoundException(String msg) {
	super(msg);
    }
}
