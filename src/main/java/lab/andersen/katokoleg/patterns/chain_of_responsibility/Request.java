package lab.andersen.katokoleg.patterns.chain_of_responsibility;

public class Request {

    private String login;
    private String password;
    private String role;

    public Request(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
