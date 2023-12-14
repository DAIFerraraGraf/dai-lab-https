package ch.api.Class;

public class Task {

    private static int counter = 0;
    public int id;
    public String title;
    public String description;

    public Task(String title, String description){
        id = ++counter;
        this.title = title;
        this.description = description;
    }
    public Task(){
    }
}
