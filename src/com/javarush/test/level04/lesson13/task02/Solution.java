package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String string1= reader.readLine();
        String string2=reader.readLine();
        int m=Integer.parseInt(string1);
        int n=Integer.parseInt(string2);

        for (int i=0;i<m;i++){
            for (int j=1;j<n;j++){
                System.out.print(8);
            }
            System.out.println(8);
        }

    }
}
