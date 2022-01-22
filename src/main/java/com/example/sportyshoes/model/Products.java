package com.example.sportyshoes.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Products {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String brandName;
    @Column
    private String gender;
    @Column
    private int size;
    @Column
    private int price;

}





