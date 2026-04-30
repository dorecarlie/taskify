package taskify.StudentPlanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // 1. Create TaskManager (the real implementation)
        ConcreteTaskManager manager = new ConcreteTaskManager();

        // 2. Create Student
        Student student = new Student();

        // 3. Connect Student → TaskManager
        student.setTaskManager(manager);

        // 4. Create a Task
        Task task = new Task(
            1,
            "Math Homework",
            LocalDateTime.of(2026, 5, 1, 12, 0),
            1
        );

        // 5. Student creates the task
        student.createTask(task);

        // 6. Verify (print tasks)
        for (Task t : manager.getTasks()) {
            System.out.println(t.getTitle());
        }
    }
}

