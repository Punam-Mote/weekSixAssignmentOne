package com.punam.weeksixassignmentone;

import com.punam.weeksixassignmentone.model.Student;

import java.util.ArrayList;

public class StudentData {
    ArrayList<Student> list = new ArrayList<>();
    private static StudentData data = new StudentData();

    private StudentData(){}

    public  static StudentData get(){
        return data;
    };

    public  ArrayList<Student> List (){
        return list;
    }
}
