package org.example.Repeat.Lesson4.Model;

import java.util.ArrayList;

public class StudyGroup {
    private Teacher _teacher;
   private ArrayList<Student> _students;
   private int _numberGroup;
   private  static  int _count = 100;

   public StudyGroup(ArrayList<Student> students,Teacher teacher){
       _students = new ArrayList<>(students);
       _teacher = teacher;
       _count++;
       _numberGroup = _count;
   }

    @Override
    public String toString() {
        return " " +
                " номер группы " + _numberGroup +
                " учитель " + _teacher.toString() +
                " студент " +
                " ";
    }

    public void showGroup(){
        System.out.println(_numberGroup);

       _teacher.toString();

        for (int i = 0; i < _students.size(); i++) {
            Student student = _students.get(i);
            System.out.println( " студент " + " ID "+ student.getId());
            System.out.println(student.toString());
        }
    }
}
