package pro.sky.courseWork.courseWork2.service;

import pro.sky.courseWork.courseWork2.model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);

}
