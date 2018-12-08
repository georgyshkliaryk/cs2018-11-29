package by.it.georgyshkliaryk.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int maximum = 0;

        if(N>0) {
            for (int i = 0; i < 3; i++) {
                int x = scanner.nextInt();
                if (maximum < x) maximum = x;
            }
            System.out.println(maximum);

        }
}





}
