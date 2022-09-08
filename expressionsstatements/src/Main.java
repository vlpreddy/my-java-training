public class Main {
    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8,200);
        int highscore = calculateScoreReturn(true, 800, 5, 100);
        System.out.println("final Score " + highscore);
    }

    public static void calculateScore(boolean gameover, int score, int levelcompleted, int bonus){
        if(gameover) {
            int finalScore = score + (levelcompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScoreReturn(boolean gameover, int score, int levelcompleted, int bonus){
        if(gameover) {
            int finalScore = score + (levelcompleted * bonus);
            finalScore += 2000;
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }


}