package FunWithQuizzes;

public class CheckboxQuestion extends Question {
    // Create String array for choices
    private String[] choices;

    // Create constructor for CheckboxQuestion class
    public CheckboxQuestion(String question, String correctAnswer, String[] choices) {
        super(question, correctAnswer);
        this.choices = choices;
    }

    // Override checkAnswer method
    @Override
    public boolean checkAnswer(String answer) {
        // get index of string in choices array
        int index = -1;
        for (int i = 0; i < choices.length; i++) {
            if (choices[i].equals(getCorrectAnswer())) {
                index = i;
            }
        }
        // Get the correct answer using index
        String correctAnswer = choices[index - 1];
        return answer.toUpperCase().equals(correctAnswer.toUpperCase());
    }

    // Override displayQuestion method
    @Override
    public void displayQuestion() {
        System.out.println(getQuestion());
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
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
