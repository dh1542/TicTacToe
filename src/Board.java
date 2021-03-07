import java.util.Arrays;

public class Board {
    private char[][] values;

    // constructor for board
    public Board(char[][] values){
        setValues(values);
        init_start(this.values);

    }

    public void print_newBoard(){
        System.out.println("   0  1  2");
        System.out.println("-------------");
        System.out.println("0 |" + " " + values[0][0] + " " + values[1][0] + " " + values[2][0] + " |");
        System.out.println("1 |" + " " + values[0][1] + " " + values[1][1] + " " + values[2][1] + " |");
        System.out.println("2 |" + " " + values[0][2] + " " + values[1][2] + " " + values[2][2] + " |");
        System.out.println("-------------");
    }
    public void init_start(char[][] values){
        for (char[] row: values)
            // 'e' for empty
            Arrays.fill(row, 'e');
    }

    public void setValues(char[][] values) {
        this.values = new char[3][3];
    }
}
