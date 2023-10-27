package pro.sky.courseWork.courseWork2.service;

import org.junit.jupiter.api.Test;
import pro.sky.courseWork.courseWork2.model.Question;
import pro.sky.courseWork.courseWork2.repository.JavaQuestionRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class JavaQuestionServiceTest {

    @Test
    void testRandomQuestion() {
        var repositoryMock = mock(JavaQuestionRepository.class);
        JavaQuestionService service = new JavaQuestionService(repositoryMock);

        var questions = List.of(
                new Question("q1", "a1"),
                new Question("q2", "a2"),
                new Question("q3", "a3"));
        when(repositoryMock.getAll()).thenReturn(questions);

        var question = service.getRandomQuestion();
        assertTrue(questions.contains(question));
    }

}