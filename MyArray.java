package Generic;


import java.util.Arrays;

/**
 * Своя реализация ArrayList
 * @autor Леонов Игорь
 * @version 0.1
 */
public class MyArray<T> {

    /** Массив, основное поле */
    private T[] myArray;

    /** Поле текщуий индекс массива */
    private int index;

    /** Поле текщуий размер массива */
    private int size;

    /**Константа, для увеличения размера массива*/
    private static final int GROW_MAX_ELEMENT = 5;

    /**Массив, без указания размера*/
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * Конструктор для создания объекта без размера
     */
    public MyArray() {
       this.myArray = (T[]) DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    /**
     * Конструктор для создания
     * @sizeArray размерность массива
     */
    public MyArray(int sizeArray) throws ExceptionSize {
        if (sizeArray > 0){
            this.myArray = (T[]) new Object[sizeArray];
        } else if (sizeArray == 0){
            this.myArray = (T[]) DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        } else
        {
            throw new ExceptionSize("Размер массива не может быть < 0");
        }

    }


    /**
     * Процедура Увеличение размерности массива
     */
    public void growArray(){
        myArray = Arrays.copyOf(myArray,size()+GROW_MAX_ELEMENT);
    }

    /**
     * Процедура добавление элемента в массив
     * @param value - значение элемента
     */
    public void add(T value){
        if (index == size())
        {
            growArray();
        }
        myArray[this.index] = value;
        this.index++;
        this.size++;
    }

    /**
     * Процедура добавление элемента в массив
     * @param index  - позция для вставки элемента
     * @param value - значение элемента
     */
    public void add(int index, T value){
        if (index > size() || index < 0)
        {
            throw new IndexOutOfBoundsException("Index = "+index+" max index = "+size());
        }

        System.arraycopy(myArray, index, myArray, index + 1,
                size - index);
        myArray[index] = value;

        this.index++;
        this.size++;
    }

    /**
     * Функция возвращает размерность массива
     * @return размер массива
     */
    public int size(){
        return size;
    }

    /**
     * Функция возврата элемнта по индексу
     * @param index - элемент в массиве
     * @return значение
     */
    public T get(int index){
        if (index >= size()){
            throw new IndexOutOfBoundsException("Максимальный индекс = "+size()+" запрашиваемый индекс = "+index);
        }
        return myArray[index];
    }

    /**
     * Функция возвращает все элементы в новом массиве
     * @return - новый массив значений
     */
    public T[] getAll(){
        T[] array = (T[]) new Object[size()];
        //java.util.Arrays.fill(array,myArray);
        for (int i = 0; i < size(); i++) {
            array[i] = get(i);
        }
        //System.arraycopy(myArray, 0, array,0,size);
        return array;
    }

    /**
     * Функция возврата номера значения в массиве
     * @param value - значение
     * @return - элемент в массиве
     */
    public int indexOf(T value) {
        if (value == null) {
            for (int i = 0; i < size(); i++)
                if (myArray[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size(); i++)
                if (value.equals(myArray[i]))
                    return i;
        }
        return -1;
    }

    /**
     * Процедура очистка массива
     */
    public void clear() {

        for (int i = 0; i < size(); i++){
            myArray[i] = null;
        }

        size = 0;
        index = 0;
    }

}
