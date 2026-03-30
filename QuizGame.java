import java.util.Scanner;

public class QuizGame
{
    //we will be using 2d array concept.
    public static void main(String[] args)
    {
        String[] questions = {"1. What colour is strawberry?",
                              "2. What is the boiling temperature of water in celsius?",
                              "3. Which of the following is hot?",
                              "4. What degree am I pursuing?",
                              "5. What language is being used in the code?"};
        String[][] options = {{"1. Black","2. Purple","3. Red","4. Yellow"},
                            {"1. 100","2. 21","3. 1200","4. 240"},
                            {"1. IceCream","2. Tea","3. Ice","4. MilkShake"},
                            {"1. BBA","2. MBBS","3. BA","4. BTECH"},
                            {"1. C","2. Python","3. JAVA","4. R"}};
        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess;
        Scanner sc = new Scanner(System.in);
        //welcome
        System.out.println("+-----------------------+");
        System.out.println("Welcome to our quiz game!");
        System.out.println("+-----------------------+");
        System.out.println("Your questions are:");
        
        for(int i = 0;i<questions.length;i++)
        {
            System.out.println(questions[i]);
            for(int j =0;j<options[i].length;j++)
            {
                System.out.println(options[i][j]);
            }
            System.out.print("Your Choice: ");
            guess = sc.nextInt();

            if(guess == answers[i])
            {
                System.out.println("Correct!");
                score++;
            }
            else
            {
                System.out.println("Incorrect!");
            }
        }
        System.out.println("Total Score:"+score+"/"+questions.length);
        sc.close();
    }
}
