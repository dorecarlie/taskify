public class Reminders implements Observer{
    private String reminderName;
    private String dueDate;

    public void update(Task task){
        this.reminderName = task.getTitle();
        this.dueDate = task.getDeadline();
        System.out.println("Reminder set for " + reminderName);
        sendReminder();
    }

    public void sendReminder(){
        System.out.println("Sending Reminder: " + reminderName + "due: " + dueDate);
    }
    public void generateReminder(){
        System.out.println("Generating Reminder for" + reminderName);
    }
}