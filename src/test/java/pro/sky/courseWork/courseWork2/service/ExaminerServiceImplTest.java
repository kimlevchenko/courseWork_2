package pro.sky.courseWork.courseWork2.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.courseWork.courseWork2.exeptions.NotEnoughQuestionsException;
import pro.sky.courseWork.courseWork2.model.Question;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    JavaQuestionService javaQuestionService;
    @Mock
    MathQuestionService mathQuestionService;
    @InjectMocks
    ExaminerServiceImpl examinerService;

    @Test
    void testGetQuestions() {
        assertThrows(NotEnoughQuestionsException.class, () -> examinerService.getQuestions(1));
    }
    //    var javaQuestions = List.of(new Question("test", "testtest"));
    //    var mathQuestions = List.of(new Question("test1", "testtest1"));
    //       when(mathQuestionService.getAll()).thenReturn(mathQuestions);
    //       when(javaQuestionService.getAll()).thenReturn(javaQuestions);

}