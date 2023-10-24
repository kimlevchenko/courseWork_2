package pro.sky.courseWork.courseWork2.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.courseWork.courseWork2.model.Question;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionRepositoryTest {

    JavaQuestionRepository repository = new JavaQuestionRepository();

    @Test
    void testAdd() {
        var result = repository.add("test", "testtest");
        assertEquals("test", result.getQuestion());
        assertEquals("testtest", result.getAnswer());
    }

    @Test
    void testRemove() {
        assertNull(repository.remove(new Question("test", "testtest")));
        var result = repository.add("test", "testtest");
        Question removeQuestion = repository.remove(new Question("test", "testtest"));
        assertEquals(result, removeQuestion);
    }

    @Test
    void testGetAll() {
        List actualQuestions = List.of(new Question("test", "testtest"));
        repository.add("test", "testtest");
        org.assertj.core.api.Assertions.assertThat(actualQuestions).containsExactly(repository.getAll());
    }
}