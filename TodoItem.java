/**
 * Class representing a single todo item.
 *
 */
public class TodoItem {

    private String name;
    private boolean isDone;

    public TodoItem(String name){
        this.name = name;
        this.isDone = false;
    }

    public void mark(){
        this.isDone = true;
    }

    public String getName(){
        return this.name;
    }

    public boolean getIsDone(){
        return this.isDone;
    }

    public String toString(){
        if(this.getIsDone()){
        return "[X] " + this.name;
    }
    return "[ ] " + this.name;
}
}
