package org.example.Repeat.Lesson4.Model;

import java.util.ArrayList;

public class StudyGroup {
    private Teacher _teacher;
   private ArrayList<Student> _students;
   private int _numberGroup;
   private  static  int _count = 100;

   public StudyGroup(ArrayList<Student> students,Teacher teacher, int numberGroup){
       _students = new ArrayList<>(students);
       _teacher = teacher;
       _count++;
       _numberGroup = _count;
   }

    @Override
    public String toString() {
        return " " +
                " номер группы " + _numberGroup +
                " ";
    }
}
