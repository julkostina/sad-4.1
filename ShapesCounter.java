/**
 * The ShapesCounter class is responsible for counting the number of buttons and panels visited by a Visitor.
 * It implements the Visitor interface and provides methods to increment the button and panel counts, as well as
 * retrieve the total number of buttons and panels visited.
 */
public class ShapesCounter implements Visitor{
    private int buttons =0;
    private int panels =0;
    /**
        * Visits a Button object and increments the count of buttons.
        *
        * @param button the Button object to visit
        */
    @Override
    public void visit(Button button) {

        buttons++;
    }

    /**
        * Visits a Panel object and increments the count of panels.
        *
        * @param panel the Panel object to visit
        */
    @Override
    public void visit(Panel panel) {
        panels++;
    }

    /**
     * Prints the number of buttons visited.
     */
    public void getButtonVisits() {
        System.out.println("Number of buttons: "+buttons);
    }

    /**
     * Prints the number of panels visited.
     */
    public void getPanelVisits() {
        System.out.println("Number of panels: "+panels);
    }

}
