import java.util.Scanner;

public class Service {

    Question[] questions = new Question[6];
    String[] selection = new String[6];

    public Service() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
        questions[5] = new Question(6, "size of book", "1", "2", "4", "8", "1");
    }

    public void playQuiz() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println("Question no .:" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getChoice1());
            System.out.println(q.getChoice2());
            System.out.println(q.getChoice3());
            System.out.println(q.getChoice4());

            selection[i] = sc.nextLine();
            i++;
        }

        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("your score is :" + score);
    }
}