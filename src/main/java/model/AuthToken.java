package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.internal.http.HTTPBuilder;

public class AuthToken  {

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("token")
    private String token;

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setToken(String token) {
        this.token =  token;
    }
    public String getToken() {
        return token;
    }

}
