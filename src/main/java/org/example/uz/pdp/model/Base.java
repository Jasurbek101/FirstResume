package org.example.uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString

public abstract class Base {
    private static int idGeneration;
    protected int id;
    protected String name;

    public Base() {
        id = idGeneration++;
    }

    public Base(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
