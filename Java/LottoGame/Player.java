package LottoGame;

import java.util.ArrayList;

public class Player {

    private String playerName;
    private int playerAccount;
    private int lottoNumber;

    private int playerBalance = 0;

    ArrayList<Integer> newNumber = new ArrayList<>();


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAccount() {
        return playerAccount;
    }

    public void setPlayerAccount(int playerAccount) {
        this.playerAccount = playerAccount;
    }

    public int getLottoNumbers() {
        return lottoNumber;
    }

    public void setLottoNumber(int lottoNumber) {
        newNumber.add(lottoNumber);
    }

    public int getPlayerBalance() {
        return playerBalance;
    }

    public void setPlayerBalance(int playerBalance) {
        this.playerBalance = playerBalance;
    }
}
