package FunWithQuizzes;

public abstract class Question {
    String question;
    String correctAnswer;
    String givenAnswer;

    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getGivenAnswer() {
        return givenAnswer;
    }

    public void setGivenAnswer(String givenAnswer) {
        this.givenAnswer = givenAnswer;
    }

    public abstract boolean checkAnswer(String answer);

    public abstract void displayQuestion();

    public abstract void displayCorrectAnswer();

    public abstract void displayGivenAnswer();

    public void displayResult() {
        if (checkAnswer(getGivenAnswer())) {
            System.out.println("Correct! \uD83D\uDE00");
        } else {
            System.out.println("Incorrect! \uD83D\uDE1E");
        }
    }
}
