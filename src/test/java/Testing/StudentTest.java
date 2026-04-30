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

    //     @Test
    // public void testUpdateTask(){


    // }

    //     @Test
    // public void testDeleteTask(){
    


    // }





}
