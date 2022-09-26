package LottoGame;

public class Prize {

    private int correctNumber = 0;
    private  int prizeWon = 0;

    public void CheckPrize(){

        if(correctNumber == 1){
            prizeWon = 1000;
        }
        if(correctNumber == 2){
            prizeWon = 2500;
        }
        if(correctNumber == 3){
            prizeWon = 5000;
        }
        if(correctNumber == 4){
            prizeWon = 15000;
        }
    }


    public int getCorrectNumber() {
        return correctNumber;
    }

    public void setCorrectNumber(int correctNumber) {
        this.correctNumber = correctNumber;
    }

    public int getPrizeWon() {
        return prizeWon;
    }

    public void setPrizeWon(int prizeWon) {
        this.prizeWon = prizeWon;
    }
}
