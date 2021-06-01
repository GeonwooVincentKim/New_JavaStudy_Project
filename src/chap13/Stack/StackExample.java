package chap13.Stack;

import java.util.Stack;
import static java.lang.System.out;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>();
        out.println(coinBox);

        coinBox.push(new Coin(100));
        out.println(coinBox);

        coinBox.push(new Coin(50));
        out.println(coinBox);

        coinBox.push(new Coin(500));
        out.println(coinBox);

        coinBox.push(new Coin(10));
        out.println(coinBox);

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}
