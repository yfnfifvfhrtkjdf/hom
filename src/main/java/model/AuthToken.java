package model;

import com.google.gson.annotations.SerializedName;

public class AuthToken {
    // todo: serialized поля, согласно swagger, а также геттеры и сеттеры
    @SerializedName("username")
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @SerializedName("password")
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString(){
        return
                "AuthToken{"+
                        "username = '"+username + '\''+ ",password = '"
                        + password + '\'' + "}";
    }
}
