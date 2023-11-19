package org.example.Repeat.Lesson4.Controller;

import org.example.Repeat.Lesson4.Model.*;
import org.example.Repeat.Lesson4.Servis.DataService;
import org.example.Repeat.Lesson4.Servis.StudyGroupService;
import org.example.Repeat.Lesson4.View.GroupView;
import org.example.Repeat.Lesson4.View.StudentView;
import org.example.Repeat.Lesson4.View.TeacherView;

import java.util.ArrayList;

public class Controller {
    private final DataService _dataService = new DataService();
    private final StudentView _studentView = new StudentView();
    private final GroupView _groupView = new GroupView();
    private final TeacherView _teacherView = new TeacherView();
    private final StudyGroupService _studyGroupService = new StudyGroupService();
    private final ArrayList<StudyGroup> _listGroup = new ArrayList<>();

    public void createStudent(String name, String surname) {
        _dataService.createNewUser(name, surname, TypeUser.Student);
    }

    public void createTeacher(String name, String surname) {
        _dataService.createNewUser(name, surname, TypeUser.Teacher);
    }

    public void createStudentGroup(){
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>(_dataService.getAllUsers());

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Teacher){
                teachers.add((Teacher) users.get(i));

            }else if(users.get(i) instanceof Student) {
                students.add((Student) users.get(i));
            }else ;
        }

        int countGroup = teachers.size();
        int countStudentOfGroup = 3;

        for (int i = 0; i < countGroup; i++) {
            Teacher teacher = teachers.get(i);
            ArrayList<Student> studentsTemp =new ArrayList<>();

            for (int j = 0; j < countStudentOfGroup; j++) {
                studentsTemp.add(students.get(j));
            }
            _studyGroupService.createNewGroup(studentsTemp, teacher);
            _listGroup.add(_studyGroupService.getGroup());
        }
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
                _teacherView.showTeacher((Teacher) user);
            }
        }
    }

    public void showAllGroup(){
        int countGroup = _listGroup.size();

        for (int i = 0; i < countGroup; i++) {
            StudyGroup studyGroup = _listGroup.get(i);
            _groupView.showGroup(studyGroup);
        }
    }
}
