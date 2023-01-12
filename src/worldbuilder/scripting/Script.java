package worldbuilder.scripting;

import java.util.ArrayList;

public class Script {

    private ArrayList<ScriptElement> elements;

    public Script() {
        elements = new ArrayList<>();
    }

    public void addElement(ScriptElement element) {
        elements.add(element);
    }
    public void addElement(ScriptElement element, int index) {
        elements.add(index, element);
    }

    public ScriptElement getElement(int index) {
        return elements.get(index);
    }
}
