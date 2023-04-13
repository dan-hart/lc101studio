package FunWithQuizzes;

// Create TrueFalseQuestion class that extends Question class
public class TrueFalseQuestion extends Question {
    // Create constructor for TrueFalseQuestion class
    public TrueFalseQuestion(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    // Override checkAnswer method
    @Override
    public boolean checkAnswer(String answer) {
        return answer.toUpperCase().equals(getCorrectAnswer().toUpperCase());
    }

    // Override displayQuestion method
    @Override
    public void displayQuestion() {
        System.out.println(getQuestion());
    }

    // Override displayCorrectAnswer method
    @Override
    public void displayCorrectAnswer() {
        System.out.println("The correct answer is: " + getCorrectAnswer());
    }

    // Override displayGivenAnswer method
    @Override
    public void displayGivenAnswer() {
        System.out.println("Your answer is: " + getGivenAnswer());
    }
}
