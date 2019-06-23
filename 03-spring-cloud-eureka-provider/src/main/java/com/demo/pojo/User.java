package com.demo.pojo;

/**
 * Created by lwx on 2019/6/22.
 */
public class User {
    private int userid;
    private String username;
    private int userage;

    public User() {
    }

    public User(int userid, String username, int userage) {
        this.userid = userid;
        this.username = username;
        this.userage = userage;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }
}
