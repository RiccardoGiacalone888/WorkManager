public class Main {
    public static void main(String[] args) {
        WorkManager manager = new WorkManager();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = manager.scanner.nextInt();
            manager.scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = manager.scanner.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter the index of the task to mark as completed: ");
                    int index = manager.scanner.nextInt();
                    manager.markTaskAsCompleted(index - 1);
                    break;
                case 4:
                    System.out.print("Enter the index of the task to remove: ");
                    int taskIndex = manager.scanner.nextInt();
                    manager.removeTask(taskIndex - 1);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}

