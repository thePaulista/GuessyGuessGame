
public class GuessyGuessGame {
    // game has three instance variables for the three player objects
    Player p1;
    Player p2;
    Player p3;

    // create three Player objects and assign them to the three Player instance variables
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // declare three variables to hold the three guesses the Players make
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // declare three variables to hold a true or false based on the player's answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true) {
            System.out.println("Number to guess is " + targetNumber);

            // call each payer's guess() method
            p1.guess();
            p2.guess();
            p3.guess();

            //guess each player's guess (the result of their guess()
            // method running) by accessing the number variable of each
            // player
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            // check each player's guess to see if it matches the target
            // number. if a player is right then set that player's
            // variable to be true - it's set to false by default
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }

            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            //if any of the player's right
            // we must keep going because nobody got it right!
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game over!");
                // game over, and break out of the loop;
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}


