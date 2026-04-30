public class PriorityView implements Observer{
    private String priorityLevel;
    private String label;


    public void update(Task task){
        int p = task.getPriority();
        this.priorityLevel = p == 3 ? "high" : p == 2 ? "medium" : " low";
        this.label = task.getTitle();
        System.out.println("Priority view for " + label);
        showPriority();
    }
    public void showPriority(){
        System.out.println(priorityLevel);
    }
    public void setPriority(){
        System.out.println("Priority is now set to: " + priorityLevel);
    }
}