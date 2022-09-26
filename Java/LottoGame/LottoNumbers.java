package LottoGame;

import java.util.ArrayList;
import java.util.Random;

public class LottoNumbers {

    ArrayList<Integer> lottoNumbers = new ArrayList<>();

    int lowNr = 1;
    int highNr = 10;
    int rndNumber;


    public void GenerateNumber() {

        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            rndNumber = random.nextInt(lowNr + highNr) + lowNr;

            lottoNumbers.add(rndNumber);
        }

    }


}