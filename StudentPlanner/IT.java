package taskify.StudentPlanner;

public class IT extends Users {

    private String field;
    private String skillLevel;

    public IT() {
        super();
        this.field = "basic IT";
        this.skillLevel = "intermediate";
    }

    public IT(int userId, String username, String email, String password,
              String field, String skillLevel) {
        super(userId, username, email, password);
        this.field = field;
        this.skillLevel = skillLevel;
    }

    public void viewDatabase() {

        System.out.println(username + " is viewing the task database...");
    }

    public void performMaintenance() {
        System.out.println("Performing system maintenance...");
    }

    public void debugSystem() {
        System.out.println("Debugging system errors...");
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
}