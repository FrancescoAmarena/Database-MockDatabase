package co.develhope.mockdb.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    public String firstName;
    @Column
    public String lastName;
    @Column(unique = true)
    private String email;

}