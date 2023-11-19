package org.example.Repeat.Lesson4.Model;

public class Teacher extends User{
    private int _teacherId;
    private static int _count;

    public Teacher(String name, String surName) {
        super(name, surName);
        _count++;
        _teacherId = _count;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                " Id " + _teacherId +
                super.toString() +
                '}';
    }

    @Override
    public void setId(int id){
        _teacherId = id;
    }

    @Override
    public int getId(){
        return _teacherId;
    }
}
