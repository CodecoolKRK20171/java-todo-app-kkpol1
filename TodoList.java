import java.util.ArrayList;

public class TodoList{

    // private String name;
    public ArrayList <TodoItem> toDoList = new ArrayList <TodoItem>();

    public TodoList(){
        // this.name = name;
        this.toDoList = toDoList;
    }

    public void markItem(String name){
        for(int i = 0; i < toDoList.size(); i++){
            if(name.equals(toDoList.get(i).getName())){
                toDoList.remove(i);
            }
        }
    }

    public void addItem(TodoItem item){
        this.toDoList.add(item);
    }


    public void showAllItems(){
        int counter = 1;
        for(TodoItem item : toDoList){
            System.out.println((counter) + ". " + item);
            counter += 1;
        }
    }

    public void archiveItems(){
        for(int i = 0; i < toDoList.size(); i++){
            if(toDoList.get(i).getIsDone() == true){
                toDoList.remove(i);
            }
        }

    }
}
