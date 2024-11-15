package pdp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Employee employee1 = new Employee("Shox", "Developer");
        Employee employee2 = new Employee("Humo", "Manager");

        Task task1 = new Task("wff", "uysgr", LocalDate.of(2024, 11, 20));
        Task task2 = new Task("'/'/'", "wht", LocalDate.of(2024, 11, 15));
        Task task3 = new Task("hjrffw", "orth", LocalDate.of(2024, 11, 18));

        taskManager.addEmployee(employee1);
        taskManager.addEmployee(employee2);

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        taskManager.assignTaskToEmployee(0, task1);
        taskManager.assignTaskToEmployee(0, task3);
        taskManager.assignTaskToEmployee(1, task2);

        System.out.println("Barcha xodimlar va ularning vazifalari");
        taskManager.displayAllEmployees();

        System.out.println("Muddati o'tgan vazifalar");
        taskManager.getOverdueTasks().forEach(task -> {
            System.out.println(task.getTitle() + " " + task.getDueDate() + " ");
        });



        System.out.println("Bajarilgan vazifalar");
        task1.markAsComplete();
    }
}