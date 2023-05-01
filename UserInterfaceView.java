package hw_lesson_6_7_8;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название города: ");
            String city = scanner.nextLine();

            System.out.println("1. Введите 1 для получения прогноза на 1 день.\n" +
                    "2. Введите 2 для получения прогноза из базы.\n" +
                    "3. Введите 5 для получения прогноза на 5 дней.\n" +
                    "4. Введите 0 для выхода.");
            String command = scanner.nextLine();
            if ("0".equals(command)) break;


            try {
                controller.getWeather(command, city);
            } catch (IOException | SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
