package homework.lisson2;

public class MyArraySizeException extends RuntimeException{
    int row, column;
    public MyArraySizeException(int row,int column){
        super("Неверных данных, строк и столбцов может быть только 4. У вас есть: row " + row + ", column " + column);
        this.row = row;
        this.column = column;
    }
}
