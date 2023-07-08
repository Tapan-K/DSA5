package in.ineuron.assign5;

public class CoinArrangementInrowsQ2 {
	public static int arrangeCoins(int n) {
        int completeRows = 0;
        int currentRow = 1;

        while (n >= currentRow) {
            n -= currentRow;
            completeRows++;
            currentRow++;
        }

        return completeRows;
    }

	public static void main(String[] args) {
		// Question 2 coins
		int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println("Number of complete rows: " + completeRows);

	}

}
