package taskify.StudentPlanner;

import java.time.LocalDateTime;

//Syntax stuff for how localDateTime works
//LocalDateTime.now() method for checking localDate and time

//LocalDateTime.of(2026, 5, 15, 23, 59);
//              year  mo  day  hr  min


public class Task{
    private int taskId;
    private String title;
    private LocalDateTime deadline;
    private int priority;

    public Task(int taskId, String title, LocalDateTime deadline, int priority) {
        this.taskId = taskId;
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
    }

    public int getTaskId(){
        return taskId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setDeadline(int year, int month, int day, int hour, int minute){
        this.deadline = LocalDateTime.of(year,month,day,hour,minute);
    }
    public LocalDateTime getDeadline(){
        return this.deadline;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }

    public boolean isOverdue() {
        return deadline.isBefore(LocalDateTime.now());
    }

    
    //example code to verify function //
    /* 
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        Task example = new Task(1, "Assignment", LocalDateTime.of(2025, 5, 15, 23, 59), 1);
        System.out.println(example.isOverdue());
    }
    */

}