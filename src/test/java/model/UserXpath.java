package model;

public class UserXpath {
    private int role;
    private int status;
    private int employeeName;
    private String username;
    private String password;
    private String confirmPassword;

    public UserXpath() {
    }

    public UserXpath(int role, int status, int employeeName, String username, String password, String confirmPassword) {
        this.role = role;
        this.status = status;
        this.employeeName = employeeName;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(int employeeName) {
        this.employeeName = employeeName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
