package com.ciferz.mox.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class UserData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String username;

    private String fullname;

    private String email;

    private String mobile;

    private String secret;

    private Date crdate;

    private Integer isactive;

    public UserData() {
    }

    public UserData(Long id, String username, String fullname, String email, String mobile, String secret, Date crdate, Integer isactive) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.mobile = mobile;
        this.secret = secret;
        this.crdate = crdate;
        this.isactive = isactive;
    }
}
