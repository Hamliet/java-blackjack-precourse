package view;

import domain.card.Card;
import domain.user.Dealer;
import domain.user.Player;
import util.ExceptionHandler;

public class InputOutputView {
	public static String inputPlayerName() {
		System.out.println("���ӿ� ������ ����� �̸��� �Է��ϼ���.(��ǥ �������� �и�)");
		return ExceptionHandler.inputPlayerHandler();
	}

	public static double inputBettingMoney(String name) {
		System.out.println(name + "�� ���� �ݾ���?");
		return ExceptionHandler.inputBettingMoneyHandler();
	}

	public static void outputShowCards(Dealer dealer) {
		System.out.print("����ī�� ");
		for (Card card : dealer.getCards()) {
			System.out.print(card.getSymbol() + "-" + card.getType() + " ");
		}
		System.out.println();
	}

	public static void outputShowCards(Player player) {
		System.out.print(player.getName() + "ī�� ");
		for (Card card : player.getCards()) {
			System.out.print(card.getSymbol() + "-" + card.getType() + " ");
		}
		System.out.println();
	}

}
