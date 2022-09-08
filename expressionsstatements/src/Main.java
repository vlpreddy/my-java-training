public class Main {
    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8,200);
        int highscore = calculateScoreReturn(true, 800, 5, 100);
        System.out.println("final Score " + highscore);

        int highScoreposition = calculateHighestScorePosition(1500);
        displayHighestScorePosition("Tim", highScoreposition);

        highScoreposition = calculateHighestScorePosition(900);
        displayHighestScorePosition("Bob", highScoreposition);

        highScoreposition = calculateHighestScorePosition(400);
        displayHighestScorePosition("Percy", highScoreposition);

        highScoreposition = calculateHighestScorePosition(50);
        displayHighestScorePosition("Gilbert", highScoreposition);

        highScoreposition = calculateHighestScorePosition(1000);
        displayHighestScorePosition("Leela", highScoreposition);

        highScoreposition = calculateHighestScorePosition(500);
        displayHighestScorePosition("Reddy", highScoreposition);
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

    public static void displayHighestScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the highest score table ");
    }

    public static int calculateHighestScorePosition(int playerScore){
       /*
        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500) {
            return 2;
        }else if(playerScore >= 100) {
             return 3;
        }
        return 4;
     */
        int position = 4;
        if(playerScore >=1000) {
            position=1;
        } else if(playerScore >=500) {
            position=2;
        } else if(playerScore >=100) {
            position=3;
        }

        return position;

    }


}