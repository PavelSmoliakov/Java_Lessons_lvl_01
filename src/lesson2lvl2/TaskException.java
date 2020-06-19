package lesson2lvl2;

public class TaskException {
    public static void main(String[] args) {
        Object[][] arr;
        int sum = 0;
        try {
            arr = checkArray(4,4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += (int) arr[i][j];
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("в ячейке [" + i + "],[" + j + "] лежат неверные данные." );
                }
            }
        System.out.println("Сумма массива = " + sum);
    }

    public static Object[][] checkArray(int row, int column) throws MyArraySizeException {
        if (row != 4 || column != 4) {
            throw new MyArraySizeException("Пожалуйста, убедитесь, что массив имеет размер 4х4");
        }
        return new Object[][]{{1,2,4,3},{1,2,"aaa",4}};
    }

}
