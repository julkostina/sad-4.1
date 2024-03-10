/**
 * The MainFile class represents the entry point of the program.
 * It contains the main method that initializes and interacts with GUI components.
 */
public class MainFile {
    public static void main(String[] args){
        GUI panel1 = new Panel("panel 1");
        GUI panel2 = new Panel("panel 2");
        GUI button1 = new Button("button 1");
        ((Panel)panel1).Add(new Button("button 2"));


        Visitor counter = new ShapesCounter();

        panel1.Accept(counter);
        panel2.Accept(counter);
        button1.Accept(counter);
        ((ShapesCounter) counter).getButtonVisits();
        ((ShapesCounter) counter).getPanelVisits();

    }

}
