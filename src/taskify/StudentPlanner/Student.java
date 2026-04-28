package taskify.StudentPlanner;

import java.util.ArrayList;
import java.util.List;

public class Student extends Users {

    private int studentId;
    private String fullName;
    private String semester;
    private String major;
    private List<Task> taskList;

    // Default constructor
    public Student() {
        super();
        this.studentId = 0;
        this.fullName = "";
        this.semester = "";
        this.major = "";
        this.taskList = new ArrayList<>();
    }

    // Full constructor
    public Student(int userId, String username, String email, String password,
                   int studentId, String fullName, String semester, String major) {

        super(userId, username, email, password);
        this.studentId = studentId;
        this.fullName = fullName;
        this.semester = semester;
        this.major = major;
        this.taskList = new ArrayList<>();
    }

    // =========================
    // METHODS
    // =========================

    public void createTask(Task task) {
        taskList.add(task);
        System.out.println("Task added: " + task.getTitle());
    }

    public void updateTask(int taskId, Task updatedTask) {
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).getTaskId() == taskId) {
                taskList.set(i, updatedTask);
                System.out.println("Task updated.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int taskId) {
        for (Task task : taskList) {
            if (task.getTaskId() == taskId) {
                taskList.remove(task);
                System.out.println("Task deleted.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public List<Task> viewTasks() {
        return taskList;
    }

    public void markTaskComplete(int taskId) {
        for (Task task : taskList) {
            if (task.getTaskId() == taskId) {
                task.setStatus("Completed");
                System.out.println("Task marked complete.");
                return;
            }
        }
    }

    public void setTaskPriority(int taskId, String priority) {
        for (Task task : taskList) {
            if (task.getTaskId() == taskId) {
                task.setPriority(priority);
                System.out.println("Priority updated.");
                return;
            }
        }
    }

    // =========================
    // GETTERS
    // =========================

    public int getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSemester() {
        return semester;
    }

    public String getMajor() {
        return major;
    }

    public List<Task> getTaskList() {
        return taskList;
    }
}