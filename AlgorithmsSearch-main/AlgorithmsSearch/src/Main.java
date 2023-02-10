import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Методы поиска: \n1. Бинарный поиск\n" +
                "2. Линейный проект\n3. Кнут – Моррис – Пратт поиск");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        System.out.println();

        switch (choice){
            case 1: //binary
                System.out.println("Введите целевое значение");
                BinarySearch.binarySearch(new double[]{5, 3, 2, 4, 1, 8, 9, 6, 7, 10}, scanner.nextInt());
                break;
            case 2: // linear
                System.out.println("Введите целевое значение");
                LinearSearch.linearSearch(scanner.nextInt());
                break;
            case 3: //kmp
                KMPSearch.kmpSearch("Text","Pattern");
                break;
            default:
                System.out.println("Нет такого выбора!");
                break;
        }
    }
}
