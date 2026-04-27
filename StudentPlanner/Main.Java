package taskify.StudentPlanner;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Taskify Student Planner");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("Welcome to Taskify", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton studentButton = new JButton("Student");
        JButton adminButton = new JButton("Admin");
        JButton itButton = new JButton("IT");

        buttonPanel.add(studentButton);
        buttonPanel.add(adminButton);
        buttonPanel.add(itButton);

        frame.add(title, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        studentButton.addActionListener(e -> showLoginSignup("Student"));
        adminButton.addActionListener(e -> showLoginSignup("Admin"));
        itButton.addActionListener(e -> showLoginSignup("IT"));

        frame.setVisible(true);
    }

public static void showLoginSignup(String userType) {
    JFrame frame = new JFrame(userType + " Login / Sign Up");
    frame.setSize(400, 250);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setLayout(new GridLayout(3, 1, 10, 10));

    JLabel label = new JLabel("Continue as " + userType, SwingConstants.CENTER);

    JButton loginButton = new JButton("Login");
    JButton signupButton = new JButton("Sign Up");

    frame.add(label);
    frame.add(loginButton);
    frame.add(signupButton);

    loginButton.addActionListener(e -> {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        Object[] fields = {
                "Username:", usernameField,
                "Password:", passwordField
        };

        int result = JOptionPane.showConfirmDialog(
                frame,
                fields,
                userType + " Login",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(frame, userType + " logged in!");
            frame.dispose();
            showDashboard(userType);
        }
    });

    signupButton.addActionListener(e -> {
        JTextField userIdField = new JTextField();
        JTextField usernameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        if (userType.equals("Student")) {
            JTextField studentIdField = new JTextField();
            JTextField fullNameField = new JTextField();
            JTextField semesterField = new JTextField();
            JTextField majorField = new JTextField();

            Object[] fields = {
                    "User ID:", userIdField,
                    "Username:", usernameField,
                    "Email:", emailField,
                    "Password:", passwordField,
                    "Student ID:", studentIdField,
                    "Full Name:", fullNameField,
                    "Semester:", semesterField,
                    "Major:", majorField
            };

            int result = JOptionPane.showConfirmDialog(
                    frame,
                    fields,
                    "Student Sign Up",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result == JOptionPane.OK_OPTION) {
                Student student = new Student(
                        Integer.parseInt(userIdField.getText()),
                        usernameField.getText(),
                        emailField.getText(),
                        new String(passwordField.getPassword()),
                        Integer.parseInt(studentIdField.getText()),
                        fullNameField.getText(),
                        semesterField.getText(),
                        majorField.getText()
                );

                JOptionPane.showMessageDialog(frame, "Student account created!");
                frame.dispose();
                showDashboard("Student");
            }
        }

        else if (userType.equals("Admin")) {
            JTextField roleField = new JTextField();

            Object[] fields = {
                    "User ID:", userIdField,
                    "Username:", usernameField,
                    "Email:", emailField,
                    "Password:", passwordField,
                    "Role:", roleField
            };

            int result = JOptionPane.showConfirmDialog(
                    frame,
                    fields,
                    "Admin Sign Up",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result == JOptionPane.OK_OPTION) {
                Admin admin = new Admin(
                        Integer.parseInt(userIdField.getText()),
                        usernameField.getText(),
                        emailField.getText(),
                        new String(passwordField.getPassword()),
                        roleField.getText()
                );

                JOptionPane.showMessageDialog(frame, "Admin account created!");
                frame.dispose();
                showDashboard("Admin");
            }
        }

        else if (userType.equals("IT")) {
            JTextField fieldInput = new JTextField();
            JTextField skillLevelField = new JTextField();

            Object[] fields = {
                    "User ID:", userIdField,
                    "Username:", usernameField,
                    "Email:", emailField,
                    "Password:", passwordField,
                    "Field:", fieldInput,
                    "Skill Level:", skillLevelField
            };

            int result = JOptionPane.showConfirmDialog(
                    frame,
                    fields,
                    "IT Sign Up",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result == JOptionPane.OK_OPTION) {
                IT itUser = new IT(
                        Integer.parseInt(userIdField.getText()),
                        usernameField.getText(),
                        emailField.getText(),
                        new String(passwordField.getPassword()),
                        fieldInput.getText(),
                        skillLevelField.getText()
                );

                JOptionPane.showMessageDialog(frame, "IT account created!");
                frame.dispose();
                showDashboard("IT");
            }
        }
    });

    frame.setVisible(true);
}

    public static void showDashboard(String userType) {
        JFrame frame = new JFrame(userType + " Dashboard");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 1, 10, 10));

        JLabel title = new JLabel(userType + " Dashboard", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));

        frame.add(title);

        if (userType.equals("Student")) {
            JButton createTask = new JButton("Create Task");
            JButton viewTasks = new JButton("View Tasks");
            JButton updateTask = new JButton("Update Task");
            JButton deleteTask = new JButton("Delete Task");
            JButton markComplete = new JButton("Mark Task Complete");

            frame.add(createTask);
            frame.add(viewTasks);
            frame.add(updateTask);
            frame.add(deleteTask);
            frame.add(markComplete);

            createTask.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Create Task button clicked"));

            viewTasks.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "View Tasks button clicked"));

            updateTask.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Update Task button clicked"));

            deleteTask.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Delete Task button clicked"));

            markComplete.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Mark Complete button clicked"));
        }

        else if (userType.equals("Admin")) {
            JButton manageUsers = new JButton("Manage Users");
            JButton manageTasks = new JButton("Manage Tasks");
            JButton validatePermissions = new JButton("Validate Permissions");
            JButton generateReports = new JButton("Generate Reports");

            frame.add(manageUsers);
            frame.add(manageTasks);
            frame.add(validatePermissions);
            frame.add(generateReports);

            manageUsers.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Manage Users button clicked"));

            manageTasks.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Manage Tasks button clicked"));

            validatePermissions.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Permissions validated"));

            generateReports.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Report generated"));
        }

        else if (userType.equals("IT")) {
            JButton viewDatabase = new JButton("View Database");
            JButton maintenance = new JButton("Perform Maintenance");
            JButton debug = new JButton("Debug System");

            frame.add(viewDatabase);
            frame.add(maintenance);
            frame.add(debug);

            viewDatabase.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Viewing database..."));

            maintenance.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Performing maintenance..."));

            debug.addActionListener(e ->
                    JOptionPane.showMessageDialog(frame, "Debugging system..."));
        }

        frame.setVisible(true);
    }
}