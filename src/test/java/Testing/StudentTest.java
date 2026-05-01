package Testing;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

import taskify.StudentPlanner.ConcreteTaskManager;
import taskify.StudentPlanner.Student;
import taskify.StudentPlanner.Task;

public class StudentTest {
    
 
    @Test
    public void testCreateTaskThroughTaskManager() {
        // Arrange
        ConcreteTaskManager manager = new ConcreteTaskManager();
        Student student = new Student();
        student.setTaskManager(manager);

        LocalDateTime deadline = LocalDateTime.of(2026, 5, 1, 12, 0);

        Task task = new Task(1, "HW", deadline, 1);

        // Act
        student.createTask(task);

        // Assert
        assertEquals(1, manager.getTasks().size()); // task added
        assertEquals("HW", manager.getTasks().get(0).getTitle()); // correct task
        assertEquals(deadline, manager.getTasks().get(0).getDeadline()); // correct deadline
    }

        @Test
    public void testUpdateTask(){
        // arrange
        ConcreteTaskManager manager = new ConcreteTaskManager();
        Student student = new Student();
        student.setTaskManager(manager);

        LocalDateTime deadline1 = LocalDateTime.of(2026, 5, 1, 12, 0);
        LocalDateTime deadline2 = LocalDateTime.of(2026, 6, 1, 12, 0);

        Task originalTask = new Task(1, "Old Task", deadline1, 1);
        Task updatedTask = new Task(1, "New Task", deadline2, 2);

        // add original task first
        student.createTask(originalTask);

        //update it
        student.updateTask(1, updatedTask);

        // assert
        assertEquals(1, manager.getTasks().size()); // still 1 task
        assertEquals("New Task", manager.getTasks().get(0).getTitle()); // replaced
        assertEquals(deadline2, manager.getTasks().get(0).getDeadline()); // updated deadline
        assertEquals(2, manager.getTasks().get(0).getPriority()); // updated priority

    }

    //     @Test
    // public void testDeleteTask(){
    


    // }





}
