import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Prompt the user for input -- his character to play the game with
        String in = "n";
        while(!in.equals("X") && !in.equals("O")){
            if(!in.equals("n")){
                System.out.println("Wrong input.");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Player 1, what's your choice?(X/O) ");
            in  = sc.nextLine();

        }

        // create board
        Board b = new Board();
        // fill with placeholders
        b.initValues();
        b.print_Board();

        // char that determines if the game is over
        char end;
        int count = 0;

        while(true){
            char player;
            if(count % 2 == 0){
                player = 'X' ;

            }
            else{
                player = '0';
            }

            boolean ter;
            do {

                Scanner sc = new Scanner(System.in);
                System.out.println("Player " + player + "your coordinate 1: ");
                int c1 = Integer.parseInt(sc.nextLine());

                Scanner sc1 = new Scanner(System.in);
                System.out.println("Player " + player + "your coordinate 2: ");
                int c2 = Integer.parseInt(sc1.nextLine());

                ter = b.turn(player, c1, c2);

            }while(!ter);
            b.print_Board();

            end = b.checkGameStatus();

            if(end == 'X' || end == 'Y'){
                System.out.println("The winner is....... Player " + end + "!");
                break;
            }
            else if(end == 't'){
                System.out.println("Tie");
            }
            else{

                count++;
            }


        }


















    }
}
