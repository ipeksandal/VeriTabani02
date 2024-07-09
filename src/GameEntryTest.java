public class GameEntryTest {
    public static void main(String[] args) {
        GameEntry gameEntry = new GameEntry("ipek" , 200);
        GameEntry gameEntry1 = new GameEntry("Arda",210);
        GameEntry gameEntry2 = new GameEntry("Merda", 105);
        System.out.println(gameEntry.toString() + "\n" + gameEntry1.toString() + "\n" + gameEntry2.toString());
        ScoreBoard scoreBoard = new ScoreBoard(9);
        scoreBoard.ekleme(gameEntry);
        scoreBoard.ekleme(gameEntry1);
        scoreBoard.ekleme(gameEntry2);
        System.out.println(scoreBoard.board[0].toString() + scoreBoard.board[1].toString());
         GameEntry gameEntry3 = scoreBoard.remove(2);
        System.out.println(gameEntry3.toString()); //Merda'yı siliyor.


    }
    
}
