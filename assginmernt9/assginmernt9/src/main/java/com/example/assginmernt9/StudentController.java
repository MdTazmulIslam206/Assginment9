package com.example.assginmernt9;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    // 1. /info
    @GetMapping("/info")
    public String getInfo() {
        return "<b>Name:</b> Md: Tazmul Islam <br>" +
                "<b>Course:</b> Backend Web Development with Java & SpringBoot <br>" +
                "<b>Date:</b> Feb 11, 2026 <br>" +
                "<b>Greeting:</b> Hello, fellow developers!";
    }

    // 2. /goal
    @GetMapping("/goal")
    public String getGoal() {
        return "My goal is to become a good backend developer.";
    }

    // 3. /learning-summary
    @GetMapping("/learning-summary")
    public String getLearningSummary() {
        return "In Module 1, I learned how to set up the environment of java. ";
    }

    // 4. /review
    @GetMapping("/review")
    public String getReview() {
        return "<b>Projects Created:</b> 9 project <br>" +
                "<b>Review:</b> The last project class was very clear and informative.";
    }
}
