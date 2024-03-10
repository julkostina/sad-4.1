/**
 * Represents a button in a graphical user interface (GUI).
 */
/**
 * Represents a button in a graphical user interface (GUI).
 */
public class Button implements GUI {
    public String name;

    /**
     * Constructs a new Button object with the specified name.
     *
     * @param element the name of the button
     */
    public Button(String element) {
        this.name = element;
    }

    /**
     * Performs the specified functionality.
     *
     * @param func the functionality to be performed
     */
    @Override
    public void Functionality(String func) {
        System.out.println(func);
    }

    /**
     * Accepts a visitor and calls the visitor's visit method passing itself as an argument.
     * This method is part of the Visitor pattern implementation.
     *
     * @param visitor the visitor object to accept
     */
    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
