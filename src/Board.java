import java.util.Arrays;

public class Board {
    private char[][] values;

    // constructor for board
    public Board(){
        this.values = new char[3][3];



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

    public boolean turn(char player, int one, int two){
        // check if input is valid
        if(one < 0 || one > 2 || two < 0 || two > 2){
            System.out.println("Wrong place to place it. Spot not existing");
            return false;
        }
        // Check if space is available
        else if(this.values[one][two] == 'X' || this.values[one][two] == 'O' ){
            System.out.println("Spot already taken.");
            return false;
        }
        // If everything is correct insert the player's choice
        else{
            this.values[one][two] = player;
            return true;
        }
    }

    // Checks the game status
    // If the next turn is possible and no one won or it's no tie --> return 'n' for next
    // If a player won --> return 'char of player'
    // If it's a tie --> return 't' for tie

    public char checkGameStatus(){
        // Not very elegant but it works
        if(this.values[0][0] != 'e' && this.values[0][0] == this.values[0][1] && this.values[0][2]== this.values[0][1]){
            return this.values[0][0];
        }
        else if(this.values[0][0] != 'e' && this.values[0][0] == this.values[1][0] && this.values[2][0]== this.values[1][0]){
            return this.values[0][0];
        }
        else if(this.values[0][1] != 'e' && this.values[0][1] == this.values[1][1] && this.values[2][1]== this.values[1][1]){
            return this.values[0][1];
        }
        else if(this.values[0][2] != 'e' && this.values[0][2] == this.values[1][2] && this.values[2][2]== this.values[1][2]){
            return this.values[0][2];
        }
        else if(this.values[1][0] != 'e' && this.values[1][0] == this.values[1][1] && this.values[1][2]== this.values[1][1]){
            return this.values[1][0];
        }
        else if(this.values[2][0] != 'e' && this.values[2][0] == this.values[2][1] && this.values[2][2]== this.values[2][1]){
            return this.values[2][0];
        }
        else if(this.values[0][0] != 'e' && this.values[1][1] == this.values[0][0] && this.values[2][2]== this.values[1][1]){
            return this.values[0][0];
        }
        else{
            for(int i = 0; i < this.values.length; i++){
                for(int j = 0; j < this.values[0].length; j++){
                    if(this.values[i][j] == 'e'){
                        return 'n';
                    }
                }
            }
            return 't';
        }
    }


    // fills new array with placeholders 'e' for empty
    public void initValues(){
        for(int i = 0; i  < this.values.length; i++){
            for(int j = 0; j < this.values[0].length; j++){
                this.values[i][j] = 'e';
            }
        }
    }

    public void setValues(char[][] val) {
        if(val.length == 3 && val[0].length == 3){
            this.values = val;
        }

    }

    public char[][] getValues() {
        return values;
    }
}
