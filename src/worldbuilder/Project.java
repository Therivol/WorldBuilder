package worldbuilder;

import worldbuilder.util.Date;

import java.util.HashMap;

public class Project {
    private String title;
    private Date startDate;
    private final HashMap<String, Play> plays;
    private final HashMap<String, Object> folders;

    public Project(String title, Date startDate) {
        plays = new HashMap<>();
        folders = new HashMap<>();
        this.title = title;
        this.startDate = startDate;
        this.folders.put(this.title, new Folder(this.title));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addPlay(Play newPlay) {
        this.plays.put(newPlay.getTitle(), newPlay);
    }

    public Play getPlay(String title) {
        return plays.get(title);
    }


}
