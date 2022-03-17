package com.springprj.myartistlist.models;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user")
public class user {
    @Id
    private BigInteger ID;
    private String userName;
    private String passwd;

    public user(BigInteger ID, String userName, String passwd) {
        this.ID = ID;
        this.userName = userName;
        this.passwd = passwd;
    }

    public BigInteger getID() {
        return ID;
    }

    public void setID(BigInteger iD) {
        ID = iD;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}
