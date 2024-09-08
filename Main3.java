public class Main3 {
    public static void main(String[] args) {
        // Создаем массив из 15 дробных чисел (первые два положительные)
        double[] array = {8.2, 3.7, -2.5, -4.3, 2.1, 3.6, 6.5, -1.9, 5.4, -3.2, 7.3, -6.7, 9.8, 1.1, -8.5};

        boolean firstNegativeFound = false;
        double sum = 0;
        int count = 0;

        // Цикл for each для обработки элементов массива
        for (double num : array) {
            if (num < 0) {
                firstNegativeFound = true; // После нахождения первого отрицательного числа
            } else if (firstNegativeFound && num > 0) {
                sum += num; // Суммируем положительные числа после первого отрицательного
                count++;
            }
        }

        // Выводим среднее арифметическое положительных чисел
        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Положительных чисел после первого отрицательного не найдено.");
        }
    }
}
