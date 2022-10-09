package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String[] inputCarNames() {
        return Console.readLine().split(",");
    }

    public static int inputProgressCount() {
        String count = Console.readLine();
        try {
            return Integer.parseInt(count);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR] 정수를 넣어주세요");
        }
    }

}
