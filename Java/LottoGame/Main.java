package LottoGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        LottoNumbers lottoNumbers = new LottoNumbers();
        Prize prize = new Prize();

        boolean play = true;

        while (play) {
            int playerNrInput;
            int lottoNrCheck;

            // Get numbers from user
            System.out.println("WELCOME TO THE LOTTO GAME!");
            System.out.println(" ###################################################### ");
            System.out.println("       ¤¤¤¤ WIN PRICES ¤¤¤¤");
            System.out.println("1 = $1000 ## 2 = $2500 ## 3 = $5000 ## 4 = JACKPOTT $15 000");
            System.out.println(" ###################################################### ");

            if(player.getPlayerName() == null){
                System.out.println("What is your name?");
                player.setPlayerName(scanner.next());
            }

            System.out.println("Type your first number between 1 - 10");
            playerNrInput = scanner.nextInt();
            player.setLottoNumber(playerNrInput);
            System.out.println("Type your second number between 1 - 10");
            playerNrInput = scanner.nextInt();
            player.setLottoNumber(playerNrInput);
            System.out.println("Type your third number between 1 - 10");
            playerNrInput = scanner.nextInt();
            player.setLottoNumber(playerNrInput);
            System.out.println("Type your fourth number between 1 - 10");
            playerNrInput = scanner.nextInt();
            player.setLottoNumber(playerNrInput);

            System.out.println(" Your numbers are " + player.newNumber);

            //Generate the lotto numbers
            lottoNumbers.GenerateNumber();
            System.out.println(" ###################################################### ");
            System.out.println("       ¤¤¤¤ LOTTO NUMBERS ARE " + lottoNumbers.lottoNumbers + " ¤¤¤¤");
            System.out.println(" ###################################################### ");


            //Check Result
            lottoNumbers.lottoNumbers.retainAll(player.newNumber);
             prize.setCorrectNumber(lottoNumbers.lottoNumbers.size());

            if (prize.getCorrectNumber() > 0) {

                prize.CheckPrize();
                player.setPlayerBalance(player.getPlayerBalance() + prize.getPrizeWon());

                System.out.println("Great " + player.getPlayerName() + " You had " + prize.getCorrectNumber() + " correct number, YOU WON $" + prize.getPrizeWon());
                System.out.println("Your correct number/s was " + lottoNumbers.lottoNumbers);
                System.out.println("You account balace is $" + player.getPlayerBalance());
            } else {
                System.out.println("Unlucky " + player.getPlayerName() + " You had " + prize.getCorrectNumber() + " correct number, YOU LOST");
            }

            //Play again or Quit
            System.out.println("1: Play Again ---- 2: Quit");
            int gameState = scanner.nextInt();
            if (gameState == 1) {
                player.newNumber.clear();
                lottoNumbers.lottoNumbers.clear();
                play = true;
            }
            if (gameState == 2) {
                play = false;
            }
        }

    }
}
