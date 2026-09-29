import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create an ArrayList of tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Study Java");
        tasks.add("Complete assignment");
        tasks.add("Go for a walk");

        // Display all tasks
        System.out.println("To-Do List:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Remove a task
        tasks.remove("Go for a walk");

        // Add another task
        tasks.add("Read a book");

        // Display updated list
        System.out.println("\nUpdated To-Do List:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
