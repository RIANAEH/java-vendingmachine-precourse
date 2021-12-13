package vendingmachine.view;

import java.util.HashMap;

import vendingmachine.Coin;

public class OutputView {
	private final static String COIN_NUMBER_MESSAGE = "\n자판기가 보유한 동전";
	private final static String MONEY_UNIT = "원";
	private final static String DASH = " - ";
	private final static String NUMBER_UNIT = "개";

	public void printCoinNumberMessage(HashMap<Coin, Integer> coins) {
		System.out.println(COIN_NUMBER_MESSAGE);
		for (Coin coin : Coin.values()) {
			System.out.println(coin.getAmount() + MONEY_UNIT + DASH + coins.get(coin) + NUMBER_UNIT);
		}
	}
}