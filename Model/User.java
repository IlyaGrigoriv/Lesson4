package org.example.Repeat.Lesson4.Model;

public  abstract class User {
    private String _name;
    private String _surName;

    public User(String name, String surName) {
        _name = name;
        _surName = surName;
    }

    @Override
    public String toString() {
        return " " +
                " Имя " + _name + '\'' +
                " Фамилия " + _surName + '\'' +
                " ";
    }

    public abstract void setId(int i);
    public abstract int getId();

}
