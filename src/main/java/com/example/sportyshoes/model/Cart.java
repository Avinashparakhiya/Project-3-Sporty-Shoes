package com.example.sportyshoes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Cart")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private int productId;
    @Column
    private String loginId;
    @Column
    private int price;
    @Column
    private String brandName;
    @Column
    private String gender;
    @Column
    private int size;

}





