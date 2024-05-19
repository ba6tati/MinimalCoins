import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] coins = {100, 50, 25, 10, 5};

        Map<Integer, String> coinToName = new HashMap<Integer, String>();
        coinToName.put(5, "Nickels");
        coinToName.put(10, "Dimes");
        coinToName.put(25, "Quarters");
        coinToName.put(50, "Half dollars");
        coinToName.put(100, "Pennies");

        System.out.println("Enter the amount in USD: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> usedCoins = new HashMap<Integer, Integer>();

        float raw_sum = Float.parseFloat(input.readLine());
        float sum = (raw_sum * 100);

        System.out.println("The " + raw_sum + " USD can be represented like that:");

        for (int coin: coins) {
            usedCoins.put(coin, 0);

            for (int i = 0; sum-coin >= 0; i++) {
                usedCoins.put(coin, usedCoins.get(coin) + 1);
                sum -= coin;
            }

            if (usedCoins.get(coin) > 0) {
                System.out.println(coinToName.get(coin) + " (" + coin + "): " + usedCoins.get(coin));
            }
        }

        if (sum > 0) {
            System.out.println("The amount left is " + sum / 100 + " USD.");
        }
    }
}
