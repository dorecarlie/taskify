package taskify.StudentPlanner;

public abstract class Users {

    protected int userId;
    protected String username;
    protected String email;
    protected String password;

    public Users() {
        this.userId = 0;
        this.username = "";
        this.email = "";
        this.password = "";
    }

    public Users(int userId, String username, String email, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public boolean register(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        return true;
    }

    public void logout() {
        System.out.println(username + " logged out.");
    }

    public boolean validateEmail(String email) {
        return email.contains("@");
    }
}