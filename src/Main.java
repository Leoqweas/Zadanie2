import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class Main {
    // Задача 1
    // Функция для нахождения максимума
    // Напишите функцию, которая принимает два числа и возвращает максимальное из них. Если числа равны, выбрасывайте исключение с сообщением об ошибке.

    public static int MaxNum(int a, int b) throws Exception{
        if (a>b) return a;
        else if (a < b) return b;
        else throw new Exception("Числа равны");
    }

    //Задача 2
    // Калькулятор деления
    //Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте ArithmeticException с сообщением о недопустимости деления на ноль

    public static int Divide(int a, int b) throws Exception{
        if (b == 0) throw new Exception("Деление на ноль");
        return a/b;
    }

    // Задача 3
    // Конвертер строк в числа
    // Напишите функцию, которая принимает строку и пытается конвертировать её в целое число.
    // Если строка не может быть конвертирована, выбрасывайте NumberFormatException.

    public static int StrInInt(String str) {
        try {
            return Integer.parseInt(str);
        }
        catch (Exception e) {
            throw new NumberFormatException("Неверный формат");
        }
    }

    // Задача 4
    // Проверка возраста
    // Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException,
    // если возраст меньше нуля или больше 150.

    public static boolean Age(int age) throws Exception {
        if (age < 0 || age > 150) throw new IllegalArgumentException("Неверный возраст");
        return true;
    }

    // Задача 5
    // Нахождение корня
    // Реализуйте функцию, которая находит корень из числа.
    // Если число отрицательное, выбрасывайте IllegalArgumentException.

    public static double ReturnSqrts(int a, int b) throws Exception {
        if (a < 0) throw new IllegalArgumentException("Корень из отрицательного числа");
        return Math.pow(a,1.0/b);
    }

    // Задача 6
    // Факториал
    // Напишите функцию, которая вычисляет факториал числа.
    // Если число отрицательное, выбрасывайте исключение.

    public static int Factorial(int a) throws Exception {
        if (a < 0) throw new Exception("Факториал из отрицательного числа");
        if (a == 1) return 1;
        return a * Factorial(a - 1);
    }

    // Задача 7 Проверка массива на нули
    // Создайте функцию, которая проверяет массив на наличие нулей.
    // Если в массиве есть нули, выбрасывайте исключение.

    public static boolean NullInMassive(int[] a) throws Exception {
        for (int i: a) {
            if (i == 0) throw new Exception("В массиве есть 0");
        }
        return true;
    }

    // Задача 8 Калькулятор возведения в степень
    // Реализуйте функцию, которая возводит число в степень.
    // Если степень отрицательная, выбрасывайте исключение.

    public static int Pow(int num, int pow) throws Exception {
        if (pow < 0) throw new Exception("Отрицательная степень");
        return (int)Math.pow(num,pow);
    }

    // Задача 9 Обрезка строки
    // Напишите функцию, которая принимает строку и число символов.
    // Функция должна возвращать строку, обрезанную до указанного числа символов.
    // Если число символов больше длины строки, выбрасывайте исключение.

    public static String CutString(String str, int a) throws Exception {
        if (a > str.length()) throw new Exception("Число символов для обрезки превышает длину строки");
        return str.substring(0,a);
    }

    // Задача 10 Поиск элемента в массиве
    // Напишите функцию, которая ищет элемент в массиве.
    // Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.

    public static boolean NumInMassive(int[] nums, int num) throws Exception {
        for (int i: nums){
            if (i == num) return true;
        }
        throw new Exception("В массиве нет числа " + num);
    }

    // Задача 11 Конвертация в двоичную систему
    // Создайте функцию, которая конвертирует целое число в двоичную строку.
    // Если число отрицательное, выбрасывайте исключение.

    public static String _10in2 (int a) throws Exception {
        if (a < 0) throw new Exception("Число меньше нуля");
        String str = "";
        while (a > 0) {
            str = a%2 + str;
            a/=2;
        }
        return str;
    }

    // Задача 12 Проверка делимости
    // Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе.
    // Если второе число равно нулю, выбрасывайте ArithmeticException.

    public static boolean NumDivide(int a, int b) throws Exception {
        if (b == 0) throw new ArithmeticException("Деление на ноль");
        if (a%2 == 0) return true;
        else return false;
    }

    // Задача 13 Чтение элемента списка
    // Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.

    public  static int IndArr(int[] a,int b) throws Exception {
        if (b > a.length-1) throw new IndexOutOfBoundsException("Индекс находиться вне массива");
        return a[b];
    }

    // Задача 14 Парольная проверка
    // Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.

    public static class WeakPasswordException extends Throwable {
        public WeakPasswordException(String mes) {
            super(mes);
        }
    }

    public static boolean ChekPassword(String password) throws WeakPasswordException {
        if (password.length() < 8) throw new WeakPasswordException("Короткий пароль");
        return true;
    }

    // Задача 15 Проверка даты
    // Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy".
    // Если формат неверен, выбрасывайте DateTimeParseException.

    public static boolean ChekDate(String date) throws Exception {
        try {
            LocalDate localDate = LocalDate.of(Integer.parseInt(date.substring(6, 10)), Integer.parseInt(date.substring(3, 5)), Integer.parseInt(date.substring(0, 2))
            );
        }
        catch (DateTimeParseException e)
        {
            throw new DateTimeParseException("Неверный формат даты",date, 0);
        }
        return true;
    }

    // Задача 16 Конкатенация строк
    // Реализуйте функцию, которая объединяет две строки.
    // Если одна из строк равна null, выбрасывайте NullPointerException.

    public static String ConcString(String a, String b) throws Exception{
        if (a == null || b == null) throw new NullPointerException("Строка равна null");
        return a + b;
    }

    // Задача 17 Остаток от деления
    // Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.

    public static int DivideOst(int a, int b) throws Exception {
        if (b == 0) throw new Exception("Деление на ноль");
        return a%b;
    }

    // Задача 18 Квадратный корень
    // Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.

    public static double ReturnSqrt(int a) throws Exception {
        if (a < 0) throw new IllegalArgumentException("Корень из отрицательного числа");
        return Math.sqrt(a);
    }

    // Задача 19 Конвертер температуры
    // Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного нуля, выбрасывайте исключение.

    public static double CInF (double C) throws Exception{
        if (C < -273.15) throw new Exception("Температура меньше абсолютного нуля");
        return (C + 273.15);
    }

    // Задача 20 Проверка строки на пустоту
    // Создайте функцию, которая проверяет, является ли строка пустой или null.
    // Если строка пустая или равна null, выбрасывайте исключение.

    public static boolean EmptyString (String a) throws Exception {
        if (a == null || a == "") throw new Exception("Строка пуста");
        return true;
    }

    public static void main(String[] args) throws Exception, WeakPasswordException {
        int[] a = {1,2,3,4,5};
        String b = "adswasds";
        String c = "24.12.2004";
        System.out.println(EmptyString(""));
    }
}