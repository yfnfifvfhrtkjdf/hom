package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;

public class AuthToken {
    // todo: serialized поля, согласно swagger, а также геттеры и сеттеры

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;
    @JsonIgnore
    private String token;


    public void setToken(String token) {
        this.token =  token;
    }

    public String getToken() {
        return token;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


}
