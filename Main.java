package org.example.Repeat.Lesson4;

import org.example.Repeat.Lesson4.Controller.Controller;
import org.example.Repeat.Lesson4.Model.Student;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Иван","Суворов");
        controller.createStudent("Илья","Григорьев");
        controller.createStudent("Лена","Васильева");
        controller.createTeacher("Елена","Петровна");
        controller.showAllStudent();
        System.out.println();
        controller.showAllTeacher();
        controller.createStudentGroup();
        controller.showAllGroup();

    }
}
