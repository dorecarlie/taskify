package taskify.StudentPlanner;

public class Student extends Users {

    private int studentId;
    private String fullName;
    private String semester;
    private String major;
    private TaskManager taskManager;

    // Default constructor
    public Student() {
        super();
        this.studentId = 0;
        this.fullName = "";
        this.semester = "";
        this.major = "";
    }

    // Full constructor
    public Student(int userId, String username, String email, String password,
                   int studentId, String fullName, String semester, String major,
                   TaskManager taskManager) {
        super(userId, username, email, password);
        this.studentId = studentId;
        this.fullName = fullName;
        this.semester = semester;
        this.major = major;
        this.taskManager = taskManager;
    }

    // =========================
    // METHODS
    // =========================

    public void createTask(Task task) {
        taskManager.createTask(task);
    }

    public void updateTask(int taskId, Task updatedTask) {
        taskManager.editTask(taskId, updatedTask);
    }

    public void deleteTask(int taskId) {
        taskManager.deleteTask(taskId);
    }

    // =========================
    // GETTERS / SETTERS
    // =========================

    public void setTaskManager(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public int getStudentId() { return studentId; }
    public String getFullName() { return fullName; }
    public String getSemester() { return semester; }
    public String getMajor() { return major; }
}