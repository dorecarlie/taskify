package taskify.StudentPlanner;

public class ConcreteTaskManager extends TaskManager {

    //notice how every update in task updates the observers

    @Override
    public void createTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void editTask(int taskId, Task updatedTask) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskId() == taskId) {
                tasks.set(i, updatedTask);
                notifyObservers();
                return;
            }
        }
    }

    @Override
    public void deleteTask(int taskId) {
        tasks.removeIf(task -> task.getTaskId() == taskId);
        notifyObservers();
    }
}