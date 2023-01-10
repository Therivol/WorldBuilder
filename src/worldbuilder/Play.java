package worldbuilder;

import java.util.HashMap;

public class Play {

    private String title;
    private String script;
    private HashMap<String, Scene> scenes;

    public Play(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getScript() {
        return script;
    }
}
