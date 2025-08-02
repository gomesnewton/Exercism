import java.util.ArrayList;
import java.util.List;

public class HandshakeCalculator {

    private final List<Integer> actionsInBinary = new ArrayList<>();
    private final List<Signal> secretHandShake = new ArrayList<>();

    public List<Signal> calculateHandshake(int number) {
        toBinary(number);
        for (int binaryAction : actionsInBinary) {
            switch (binaryAction) {
                case 1 -> secretHandShake.add(Signal.WINK);
                case 2 -> secretHandShake.add(Signal.DOUBLE_BLINK);
                case 4 -> secretHandShake.add(Signal.CLOSE_YOUR_EYES);
                case 8 -> secretHandShake.add(Signal.JUMP);
                case 16 -> { return secretHandShake.reversed();}
                }
            }
        return secretHandShake;
    }


    public void toBinary(int number) {
        int bin = 1;
        while (number > 0) {
            actionsInBinary.add((number % 2 == 0 ? 0 : bin));
            number = number / 2;
            bin += bin;
        }
    }

}
