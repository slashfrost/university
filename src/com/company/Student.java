package com.company;


import model.BaseModel;

import java.util.HashMap;
import java.util.Map;

public class Student extends BaseModel {
    int scholarship;
    public Map<Exam, ExamStagesEnum> passing = new HashMap<Exam, ExamStagesEnum>();

}
