package taskify.StudentPlanner;

public class Admin extends Users {
    String role = "";

    public Admin() {
        super();
        this.role = "high level employee";
    }

    public Admin(int userId, String username, String email, String password, String role) {
        super(userId, username, email, password);
        this.role = role;
    }

    public void manageUsers(){
        System.out.println("Managing the user database ...");
    }
    public void manageTasks(){
        System.out.println("Managing the task database ...");
    }
    public boolean validatePermissions(String action) {

    if (role.equalsIgnoreCase("superadmin")) {
        return true; 
    }

    if (role.equalsIgnoreCase("admin")) {
        if (action.equals("manageUsers") || action.equals("manageTasks")) {
            return true;
        }
    }

    return false;
    }
    public String getRole(){ return this.role; }
    public void setRole(String role){
        this.role = role;
    }
}
