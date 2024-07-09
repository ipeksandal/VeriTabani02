public class ScoreBoard {
    public int numEntries = 0;
    public GameEntry[] board; // array
    public ScoreBoard(int capaticy) {
        board = new GameEntry[capaticy];
    }

    public void ekleme(GameEntry e) {
        int newScore = e.getScore();
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {
                numEntries++;
            }
            int j = numEntries - 1;
            while (j > 0 && newScore > board[j - 1].getScore()) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = e;
        }

    }
    public GameEntry remove(int i) {
        if (i < 0 || i > numEntries - 1) {
            throw new IndexOutOfBoundsException("Geçersiz index :" + i);
        }
        GameEntry temp = board[i];
        for (int j = i; j < numEntries - 1; j++) {
            board[j] = board[j + 1];
            board[numEntries - 1] = null;
            numEntries--;

        }
        return temp;
    }
}
