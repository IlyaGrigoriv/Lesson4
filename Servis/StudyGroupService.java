package org.example.Repeat.Lesson4.Servis;

import org.example.Repeat.Lesson4.Model.Student;
import org.example.Repeat.Lesson4.Model.StudyGroup;
import org.example.Repeat.Lesson4.Model.Teacher;

import java.util.ArrayList;

public class StudyGroupService {
    private StudyGroup _studyGroup;

    public void  createNewGroup(ArrayList<Student> students, Teacher teacher){
         _studyGroup = new StudyGroup(students,teacher);
    }

    public StudyGroup getGroup(){
        return _studyGroup;
    }
}
