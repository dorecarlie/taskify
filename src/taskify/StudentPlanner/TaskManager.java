package taskify.StudentPlanner;

import java.util.ArrayList;
import java.util.List;

public abstract class TaskManager {
    protected List<Task> tasks = new ArrayList<>();
    protected List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(tasks);
        }
    }

    public List<Task> getTasks() {
    return tasks;
}

    public abstract void createTask(Task task);
    public abstract void editTask(int taskId, Task updatedTask);
    public abstract void deleteTask(int taskId);
}