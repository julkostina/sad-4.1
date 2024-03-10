import java.util.ArrayList;
import java.util.List;

/**
 * Represents a panel in a graphical user interface (GUI).
 * A panel can contain other GUI elements and provide functionality.
 */
public class Panel implements GUI{
    public String name;
    private List<GUI> elements = new ArrayList<GUI>();
    public int numberOfButtons = elements.size();
    /**
     * Adds a GUI element to the panel.
     * 
     * @param child the GUI element to be added
     */
    public void Add(GUI child){
        elements.add(child);
    }
    /**
     * Removes the specified GUI child from the panel.
     *
     * @param child the GUI child to be removed
     */
    public void Delete(GUI child){
        elements.remove(child);
    }
    /**
     * Creates a new Panel object with the specified element name.
     *
     * @param element the name of the element for the panel
     */
    public Panel(String element){
        this.name = element;
    }
    /**
     * Prints the names of the buttons contained in the panel.
     */
    public void Contains(){
        System.out.println("Panel "+ name+ "contains buttons: ");
        for (GUI element : elements) {
            Button el = (Button)element;
            System.out.println(el.name);
        }
    }

    /**
     * Executes the specified functionality on all GUI elements in the panel.
     * 
     * @param func the functionality to be executed
     */
    @Override
    public void Functionality(String func) {
        for(GUI element : elements){
            element.Functionality(func);
        }
    }

    /**
     * Accepts a visitor and allows it to visit this panel and its elements.
     *
     * @param visitor the visitor object that will visit this panel and its elements
     */
    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
        for (GUI element : elements) {
            element.Accept(visitor);
        }
    }
}
