package view;

import java.util.List;

import org.assertj.core.util.Strings;

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

	public static void outputGiveCards(String users) {
		System.out.println("������ " + users + "���� 2���� ī�带 ���������ϴ�.");
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

	public static int inputaskMoreCards(Player player) {
		System.out.println(player.getName() + "�� ī�带 �� �ްڽ��ϱ�?(���� y, �ƴϿ��� n)");
		return ExceptionHandler.inputaskMoreCardsHandler();
	}

	public static void outputBust() {
		System.out.println("����Ʈ! ī�� ������ �ߴ��մϴ�.");
	}

	public static void outputDealerGotCard() {
		System.out.println("������ 16���϶� ī�带 �� �޾ҽ��ϴ�.");
	}

	public static void outputShowCardsWithScore(Dealer dealer) {
		System.out.print("\n����ī�� ");
		for (Card card : dealer.getCards()) {
			System.out.print(card.getSymbol() + "-" + card.getType() +" ");

		}
		System.out.println("- ���:" + bestScore(dealer));
	}

	private static int bestScore(Dealer dealer) {
		if (dealer.getScoreAceAsEleven() <= 21) {
			return dealer.getScoreAceAsEleven();
		}
		return dealer.getScoreAceAsOne();
	}

	public static void outputShowCardsWithScore(Player player) {
		System.out.print(player.getName() + "ī�� ");
		for (Card card : player.getCards()) {
			System.out.print(card.getSymbol() + "-" + card.getType() +" ");
		}
		System.out.println("- ���:" + bestScore(player));
	}

	private static int bestScore(Player player) {
		if (player.getScoreAceAsEleven() <= 21) {
			return player.getScoreAceAsEleven();
		}
		return player.getScoreAceAsOne();
	}

}
