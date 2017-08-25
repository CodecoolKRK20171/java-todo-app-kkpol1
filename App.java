import java.util.Scanner;
/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{

    Scanner input = new Scanner(System.in);


    public void start(){

        TodoList list = new TodoList();

        int choice = 1;
        while(choice != 0){
            View.showMenu();
            choice = View.getChoice();

            if(choice == 1){
                list.showAllItems();
            }

            else if(choice == 2){
                String name = View.getNameOfTask();
                TodoItem item = new TodoItem(name);
                list.addItem(item);
            }

            else if(choice == 3){
                list.showAllItems();
                String name = View.getNameOfItem();
                for(TodoItem item : list.toDoList){
                    if(name.equals(item.getName())){
                        item.mark();
                    }
                }
            }

            else if(choice == 4){
                list.archiveItems();
            }
    }
}


  public static void main(String[] args) {
      App app = new App();
      app.start();

  }
}
