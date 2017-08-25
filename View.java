import java.util.Scanner;

public class View {

    static Scanner input = new Scanner(System.in);

    public static int getChoice(){
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        return choice;
    }

    public static void print(String input){
       System.out.println(input);
    }

    public static void showMenu(){
       System.out.println("\n\n(1) Show list");
       System.out.println("(2) Add item");
       System.out.println("(3) Mark item");
       System.out.println("(4) Archive items");
       System.out.println("(0) Exit");
    }

    public static String getNameOfTask(){
        System.out.print("Name of task: ");
        String name = input.next();
        return name;
    }

    public static String getNameOfItem(){
        System.out.print("Name of item: ");
        String name = input.next();
        return name;
    }

}
