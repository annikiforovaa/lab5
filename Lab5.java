//Написать программу, удаляющую из целочисленного массива A размерности N элементы, равные
//целому числу X. В результате должен получиться массив не большей размерности. На экран
//должны выводиться как оригинальное состояние массива, так и итоговое.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> userAr = new ArrayList<>();

        System.out.println("Введите элементы массива, закончите ввод словом 'quit':");
        while (true) {
            String enter = in.next();
            if (Objects.equals(enter, "quit")) {
                break;
            }
            try {
                Integer element = Integer.parseInt(enter);
                userAr.add(element);
            } catch (NumberFormatException ignored) {
            }
        }

        System.out.println(userAr);
        System.out.println("Введите элемент, который хотите удалить:");
        try {
            Integer X = in.nextInt();
            for (int i = 0; i < userAr.size(); i++) {
                if ((Objects.equals(userAr.get(i), X))) {
                    userAr.remove(i);
                    i--;
                }
            }
            System.out.println("Итоговый массив:");
            System.out.println(userAr);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Это не целое число.");
            in.close();
        }
    }
}