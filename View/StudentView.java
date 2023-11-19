package org.example.Repeat.Lesson4.View;

import org.example.Repeat.Lesson4.Model.Student;
import org.example.Repeat.Lesson4.Model.Teacher;

public class StudentView {
    public void showStudent(Student student) {
        System.out.println(student.toString());
    }

    public void showTeacher(Teacher teacher){
        System.out.println(teacher.toString());
    }
}
