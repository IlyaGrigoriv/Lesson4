package org.example.Repeat.Lesson4.Model;

public class Student extends User{
    private int _studentId;
    private static int _count = 0;

    public Student(String name, String surName) {
        super(name, surName);
        _count++;
        _studentId = _count;
    }
    @Override
    public String toString() {
        return "Student{" +
                " Id " + _studentId +
                super.toString()+
                '}';
    }

    @Override
    public void setId(int studentId){
        _studentId = studentId;
    }

    @Override
    public int getId(){
        return _studentId;
    }
}
