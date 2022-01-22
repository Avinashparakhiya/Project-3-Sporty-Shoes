package com.example.sportyshoes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "OrderDetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetails {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String loginId;
    @Column
    private int ciId;
    @Column
    private int orderId;
    @Column
    private int productId;
    @Column
    private String brandName;
    @Column
    private String gender;
    @Column
    private int size;
    @Column
    private int price;
    @Column
    private Date orderDate;

}











