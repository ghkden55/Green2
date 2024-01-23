import java.util.Arrays;
import java.util.Random;

public class Lotto {

    public int[] getLottoNum() {

        Random rd = new Random();

        int[] lotto = new int[6];


        for (int i = 0 ; i < lotto.length ; i++) {

            int rdNum = rd.nextInt(45) + 1;

            boolean flag = true;

            if (i == 0) {
                lotto[i] = rdNum;
            }

            for (int j = 0 ; j < i ; j++) {
                if (lotto[j] == rdNum) {
                    i--;
                    flag = false;
                    break;
                }

                if (flag) {
                    lotto[i] = rdNum;
                }
            }
        }

        return lotto;
    }


    public void printLotto(int[] lotto) {
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}
