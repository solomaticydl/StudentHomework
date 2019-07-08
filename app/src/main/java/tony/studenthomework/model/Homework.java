package tony.studenthomework.model;

public class Homework {
    private final int id;
    private final String title;

    public Homework(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
