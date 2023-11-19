package org.example.Repeat.Lesson4.Servis;

import org.example.Repeat.Lesson4.Model.Student;
import org.example.Repeat.Lesson4.Model.Teacher;
import org.example.Repeat.Lesson4.Model.TypeUser;
import org.example.Repeat.Lesson4.Model.User;

import java.util.ArrayList;

public class DataService {
    private ArrayList<User> _users = new ArrayList<>();

    public void createNewUser(String name, String surName, TypeUser typeUser) {
        if (typeUser == TypeUser.Student) {
            User user = new Student(name, surName);
            _users.add(user);
//            user.setId(newId(typeUser));//убрал не работает
        } else if (typeUser == TypeUser.Teacher) {
            User user = new Teacher(name, surName);
            _users.add(user);
//            user.setId(newId(typeUser)); // убрал не работает
        }
    }

    public ArrayList<User> getAllUsers() {
        return _users;
    }

    private int newId(TypeUser typeUser) {
        int id =0;
        int index = 0;
        boolean itsStudent = typeUser == TypeUser.Student;

        for (int i = _users.size()-1; i >= 0; i--) {

            if (_users.get(i)  instanceof Student && itsStudent ) {
                Student student = (Student) _users.get(i);
                id += student.getId();
                index++;
            } else if (_users.get(i)  instanceof Teacher && !itsStudent ) {
                Teacher teacher = (Teacher) _users.get(i);
                id += teacher.getId();
                index++;
            }
            if (index > 0) {
                i = 0;
            }
        }
        return id;
    }


}
