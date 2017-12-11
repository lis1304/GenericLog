package Generic;

public class Main {
    public static void main(String[] args) throws ExceptionSize {


        MyArray<Integer> myArray = new MyArray<>();
        //ArrayList<Integer> aa = new ArrayList<>();

        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
//        myArray.add(0,7);
//
//
//        for (int i=0; i<myArray.size();i++) {
//            System.out.println(myArray.get(i));
//
//        }



//        Integer[] mas1 = myArray.getAll();
        Integer[] mas = (Integer[]) myArray.getAll();
        for (Integer ma : mas) {
            System.out.println(ma);
        }




        //System.out.println(myArray.size());



        //System.out.println(myArray.get(10));
/*        for (int i=0; i<myArray.size();i++){
            System.out.println((Object) myArray[i]);
        }
*/

        //System.out.println(myArray.get(1));


        // for (Integer integer : aa) {
        //    System.out.println(integer);
       // }



    }
}
