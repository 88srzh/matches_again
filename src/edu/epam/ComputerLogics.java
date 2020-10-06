package edu.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputerLogics {
    int count = 20;
    int player = 20;
    public void computerLogics() throws IOException {


        while (count > 1) {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        if (player % 2 ==0) {
            int computer = 0;
            int num = 1;

            for (int i = 0; ; i++) {
                num += 4;

                if (num >count) {
                    computer = count - (num - 4);
                    break;
                }
            }

            System.out.println("На столе осталось " + count + " спичек \n - Количество выбранных компьютером спичек = " + computer);
            count -= computer;
            player--;

            if (count < 2) {
                ConsoleMessages.hasHumanLose();
            }
            else {
                System.out.print("На столе осталось " + count + " спичек \n - Ход игрока. Введите количество спичек: ");
                int x = Integer.parseInt(obj.readLine());

                if (x < 1 || x > 3) {
                    rep: while (true) {
                        ConsoleMessages.enterNumber();
                        int y = Integer.parseInt(obj.readLine());
                        if (y < 1 || y > 3) {
                            continue rep;
                        }

                        count -= y;
                        player--;
                        break;
                    }
                } else {
                    count -= x;
                    player--;
                    if (count < 2) {
                        ConsoleMessages.hasComputerLose();
                    }
                    }
                }
            }
        }
    }
}
