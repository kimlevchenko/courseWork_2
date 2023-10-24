package pro.sky.courseWork.courseWork2.repository;

import org.junit.jupiter.api.Test;
import pro.sky.courseWork.courseWork2.model.Question;

import static org.junit.jupiter.api.Assertions.*;

class MathQuestionRepositoryTest {

    MathQuestionRepository repository = new MathQuestionRepository();


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

}