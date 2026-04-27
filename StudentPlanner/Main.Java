package taskify.StudentPlanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lets have so much fun");
        IT JohnStinky = new IT(151516, "theJOHNNN" , "stinkbug@gmail.gov" ,"password", "computas", "expert");
        JohnStinky.viewDatabase();
        System.out.println(JohnStinky.getField());
    }
}