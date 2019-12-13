package view;

import java.util.List;
import java.util.Scanner;

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
}
