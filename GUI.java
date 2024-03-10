/**
 * The GUI interface represents a graphical user interface.
 * It provides methods for functionality and accepting a visitor.
 */
public interface GUI {

    /**
     * Performs the specified functionality.
     *
     * @param func the functionality to be performed
     */
    public void Functionality(String func);

    /**
     * Accepts a visitor for performing operations on the GUI.
     *
     * @param visitor the visitor to be accepted
     */
    public void Accept(Visitor visitor);
}

