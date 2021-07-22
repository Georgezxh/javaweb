package entity;

public class User {
    public Integer uerid;
    public String username;
    public String password;

    public Integer getUerid() {
        return uerid;
    }

    public void setUerid(Integer uerid) {
        this.uerid = uerid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
