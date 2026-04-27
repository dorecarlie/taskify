import java.util.*;

public class CalendarView implements Observer{
    private Map<Date, List<Task>> calendarView = new HashMap<>();

    public void update(Task task){
        System.out.println("Updating Calender for " + task.getTitle() + "...");
        displayCalendar();
        refreshView();

    }
    public void displayCalendar(){
        System.out.println("Calender updated!" + calendarView.size());
    }
    public void refreshView(){
        System.out.println("Calender View refreshed!")
    }
}
  

