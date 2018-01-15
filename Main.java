package Generic;


public class Main {
    public static void main(String[] args) throws ExceptionSize {


        MyArray<Integer> myArray = new MyArray<Integer>();

        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);

        System.out.println(myArray.get(2));

        Integer[] mas = myArray.getAll(Integer.class);

        Integer[] mas1 = myArray.getAll(Integer.class,1,3);

        for (Integer ma : mas1) {
            System.out.println(ma);
        }






    }
}
