package com.ciferz.mox.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name="user_data")
public class UserData {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String user_name;
    private String full_name;
    private String email;
    private String mobile;
    private String secret;
    @CreationTimestamp
    private Timestamp cr_date;
    private Integer is_active;

    @ManyToMany
    private Set<UserRole> roles;

    public UserData() {
    }

    public UserData(Long id, String user_name, String full_name, String email, String mobile, String secret, Timestamp cr_date, Integer is_active) {
        this.id = id;
        this.user_name = user_name;
        this.full_name = full_name;
        this.email = email;
        this.mobile = mobile;
        this.secret = secret;
        this.cr_date = cr_date;
        this.is_active = is_active;
    }
}
