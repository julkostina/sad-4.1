/**
 * The Visitor interface represents a visitor in a visitor design pattern.
 * It defines methods for visiting different elements in the application.
 */
public interface Visitor {
    /**
     * Visits a Button element.
     *
     * @param button the Button element to visit
     */
    void visit(Button button);

    /**
     * Visits a Panel element.
     *
     * @param panel the Panel element to visit
     */
    void visit(Panel panel);
}
