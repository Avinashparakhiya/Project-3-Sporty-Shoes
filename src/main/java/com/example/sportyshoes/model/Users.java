package com.example.sportyshoes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String loginId;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String phone;
}




