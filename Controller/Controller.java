package org.example.Repeat.Lesson4.Controller;

import org.example.Repeat.Lesson4.Model.Student;
import org.example.Repeat.Lesson4.Model.Teacher;
import org.example.Repeat.Lesson4.Model.TypeUser;
import org.example.Repeat.Lesson4.Model.User;
import org.example.Repeat.Lesson4.Servis.DataService;
import org.example.Repeat.Lesson4.Servis.StudyGroupService;
import org.example.Repeat.Lesson4.View.StudentView;

import java.util.ArrayList;

public class Controller {
    private final DataService _dataService = new DataService();
    private final StudentView _studentView = new StudentView();
    private final StudyGroupService _studyGroupService = new StudyGroupService();

    public void createStudent(String name, String surname) {
        _dataService.createNewUser(name, surname, TypeUser.Student);
    }

    public void createTeacher(String name, String surname) {
        _dataService.createNewUser(name, surname, TypeUser.Teacher);
    }

    public void createStudentGroup(ArrayList<Student> students, Teacher teacher, int numberGroup){
        _studyGroupService.createNewGroup(students,teacher,numberGroup);
    }

    public void showAllStudent() {
        ArrayList<User> users = _dataService.getAllUsers();

        for (User user : users) {
            if (user instanceof Student) {
                _studentView.showStudent((Student) user);
            }
        }
    }

    public void showAllTeacher() {
        ArrayList<User> users = _dataService.getAllUsers();

        for (User user : users) {
            if (user instanceof Teacher) {
                _studentView.showTeacher((Teacher) user);
            }
        }
    }

}
