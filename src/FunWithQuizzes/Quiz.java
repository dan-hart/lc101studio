package FunWithQuizzes;

import java.util.Scanner;

public class Quiz {
    // Create Question array for questions
    private Question[] questions;

    // Create constructor for Quiz class
    public Quiz(Question[] questions) {
        this.questions = questions;
    }

    // Create runQuiz method
    public void runQuiz() {
        for (int i = 0; i < questions.length; i++) {
            questions[i].displayQuestion();
            Scanner scanner = new Scanner(System.in);
            String givenAnswer = scanner.nextLine();
            questions[i].setGivenAnswer(givenAnswer);
        }
    }

    // Create gradeQuiz method
    public void gradeQuiz() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            questions[i].displayGivenAnswer();
            questions[i].displayCorrectAnswer();
            questions[i].displayResult();
            if (questions[i].checkAnswer(questions[i].getGivenAnswer())) {
                score++;
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);
    }
}
