package pro.sky.courseWork.courseWork2.service;

import org.junit.jupiter.api.Test;
import pro.sky.courseWork.courseWork2.model.Question;
import pro.sky.courseWork.courseWork2.repository.MathQuestionRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MathQuestionServiceTest {

    @Test
    void testRandomQuestion() {
        var repositoryMock = mock(MathQuestionRepository.class);
        MathQuestionService service = new MathQuestionService(repositoryMock);

        var questions = List.of(
                new Question("q1", "a1"),
                new Question("q2", "a2"),
                new Question("q3", "a3"));
        when(repositoryMock.getAll()).thenReturn(questions);

        var question = service.getRandomQuestion();
        assertTrue(questions.contains(question));
    }

}