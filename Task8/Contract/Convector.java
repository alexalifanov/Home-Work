package Task8.Contract;

import java.util.Arrays;
import java.util.Date;

public class Convector {
    public static void main(String[] args) {
        Contract contract = new Contract(12345, new Date(), new String[]{"позиция 1", "позиция 2"});
        Act act = Act.contractToAct(contract);
        System.out.println(act.getNum() + " " + act.getDate() + " " + Arrays.toString(act.getPage()));
    }
}
