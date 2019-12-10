package com.offcn.springbootdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = true, length = 20)
    private String name;

    @Column(name = "age", nullable = true, length = 4)
    private int age;

    @Column(name = "password", nullable = true, length = 20)
    private String password;

    @OneToMany(mappedBy = "personId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Dog> dogs;

}
