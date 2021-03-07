import java.util.Arrays;

public class Board {
    private char[][] values;

    // constructor for board
    public Board(){


    }

    public void print_Board(){
        System.out.println("   0  1  2");
        System.out.println("-------------");
        System.out.println("0 |" + " " + values[0][0] + " " + values[1][0] + " " + values[2][0] + " |");
        System.out.println("1 |" + " " + values[0][1] + " " + values[1][1] + " " + values[2][1] + " |");
        System.out.println("2 |" + " " + values[0][2] + " " + values[1][2] + " " + values[2][2] + " |");
        System.out.println("-------------");
    }

    /**
     * Method to process a players turn and check if its a valid one.
     * @param player
     * @param one
     * @param two
     */

    public char[][] turn(char player, int one, int two){
        // check if input is valid
        if(one < 0 || one > 2 || two < 0 || two > 2){
            System.out.println("Wrong place to place it. Spot not existing");
            return this.values;
        }
        // Check if space is available
        else if(this.values[one][two] == 'X' || this.values[one][two] == 'O' ){
            System.out.println("Spot already taken.");
            return this.values;
        }
        // If everything is correct insert the player's choice
        else{
            this.values[one][two] = player;
            return this.values;
        }


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
