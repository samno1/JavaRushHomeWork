package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String n1=reader.readLine();
        String n2=reader.readLine();
        String n3=reader.readLine();

        int a=Integer.parseInt(n1);
        int b=Integer.parseInt(n2);
        int c=Integer.parseInt(n3);
        if (a==b) System.out.println(3);
        else if (b==c) System.out.println(1);
        else if (a==c) System.out.println(2);

    }
}
