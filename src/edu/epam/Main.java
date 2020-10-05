package edu.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int count = 20;
        int player = 20;

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
                    System.out.println("Осталась 1 спичка. Человек проиграл");
                }
                else {
                    System.out.print("На столе осталось " + count + " спичек \n - Ход игрока. Введите количество спичек: ");
                    int x = Integer.parseInt(obj.readLine());

                    if (x < 1 || x > 3) {
                        rep: while (true) {
                            System.out.print("Введите число от 1 до 3: ");
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
                            System.out.println("Осталась 1 спичка. Компьютер проиграл");
                        }
                        }
                    }
                }
            }
        }
    }