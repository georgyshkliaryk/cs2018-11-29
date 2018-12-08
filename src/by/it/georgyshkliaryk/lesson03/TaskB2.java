package by.it.georgyshkliaryk.lesson03;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
import java.util.Scanner;

class TaskB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, x2;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + " " + b + " " + c);
        double D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Отрицательный дискриминант");
        }
        if (D == 0) {
            x1 = (-b)  / (2 * a);
            System.out.println(x1);
        }
        if (D > 0) {
            x1 = ((-b)  + Math.sqrt(D)) / (2 * a);
            x2 = ((-b) - Math.sqrt(D)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
    }
}
