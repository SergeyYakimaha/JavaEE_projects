package com.itvdn;

import javax.persistence.*;

@Entity
public class Animal {
    @SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="animal_id_seq", name="animal_id_seq")
    @GeneratedValue(generator="animal_id_seq", strategy= GenerationType.SEQUENCE)
    @Id
    private int id;
    private String name;
    private int age;
    private boolean tail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
