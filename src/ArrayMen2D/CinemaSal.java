package ArrayMen2D;

public class CinemaSal {
    private boolean[][] seats;
    private int row;
    private int col;

    public CinemaSal(int row, int col) {
        this.row = row;
        this.col = col;
        seats = new boolean[row][col];
    }

    public void book(int row, int col) {
        if (!seats[row][col]) {
            System.out.println("booked seat! row: " + row + " col: " + col);
            seats[row][col] = true;
        }
    }

    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (seats[i][j]) {
                    System.out.print("[X]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    public int countAvailable() {
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!seats[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public int countBooked() {
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (seats[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
