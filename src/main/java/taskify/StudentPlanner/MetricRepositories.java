public class MetricRepositories implements Observer{
    private int totalTasksCreated = 0;
    private int totalTasksCompleted = 0;
    private int totalTasksOverdue = 0;

    public void update(List<Task> task){
        totalTasksCreated++;
        if(task.isOverdue()){
            totalTasksOverdue++;
        }
        System.out.println("Metrics Updated.");
        printMetrics();
    }

    public void printMetrics(){
        System.out.println("Created: " + totalTasksCreated + ", Completed: " + totalTasksCompleted + ", Overdue: " + totalTasksOverdue);
    }
    public void delete(){
        totalTasksCompleted = 0;
        totalTasksCreated = 0;
        totalTasksOverdue = 0;
        System.out.println("All metrics deleted.");
    }
}