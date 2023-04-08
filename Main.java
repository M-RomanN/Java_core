package hw_lesson_2;

public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"0", "0", "0", "0"}, {"1", "1", "1", "1"}, {"2", "2", "2", "2"},
                {"3", "3", "3", "3"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException exception) {
                System.out.println("Размер массива несоответствует 4 на 4!");
            }
        } catch (MyArrayDataException exception) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + exception.i + " x " + exception.j);
        }

    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }

}