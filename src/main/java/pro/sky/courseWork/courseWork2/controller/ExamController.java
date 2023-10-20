package pro.sky.courseWork.courseWork2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import pro.sky.courseWork.courseWork2.model.Question;
import pro.sky.courseWork.courseWork2.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {

    private final ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) {
        return service.getQuestions(amount);

    }
}
