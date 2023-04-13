package FunWithQuizzes;

public class QuizRunner {
    public static void main(String[] args) {
        // Generate list of questions
        Question[] questions = {
                new MultipleChoiceQuestion("What is the capital of Texas?", "Austin", new String[]{"Dallas", "Houston", "Austin", "San Antonio"}),
                new TrueFalseQuestion("The sky is blue.", "True"),
                new CheckboxQuestion("What is the capital of California?", "Sacramento", new String[]{"Los Angeles", "San Francisco", "Sacramento", "San Diego"}),
                new TrueFalseQuestion("The sun is a star.", "True"),
                new MultipleChoiceQuestion("What is the capital of New York?", "Albany", new String[]{"New York City", "Buffalo", "Albany", "Rochester"}),
                new TrueFalseQuestion("The earth is flat.", "False"),
                new CheckboxQuestion("What is the capital of Florida?", "Tallahassee", new String[]{"Miami", "Tampa", "Orlando", "Tallahassee"}),
                new TrueFalseQuestion("The moon is a planet.", "False"),
                new MultipleChoiceQuestion("What is the capital of Illinois?", "Springfield", new String[]{"Chicago", "Rockford", "Springfield", "Peoria"}),
                new TrueFalseQuestion("The earth is round.", "True")
        };
        Quiz quiz = new Quiz(questions);
        quiz.runQuiz();
        quiz.gradeQuiz();
    }
}
