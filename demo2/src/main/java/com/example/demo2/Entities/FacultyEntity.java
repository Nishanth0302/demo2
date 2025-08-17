package com.example.demo2.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Faculty")
public class FacultyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private long phnNo;
    private String Dept;
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public long getPhnNo(){
        return phnNo;
    }
    public void setPhnNo(long phnNo){
        this.phnNo=phnNo;
    }
public String getDept(){
        return Dept;
}
public void setDept(String Dept){
        this.Dept=Dept;
}
}
