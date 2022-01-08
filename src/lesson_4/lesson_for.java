package lesson_4;

import jdk.internal.org.objectweb.asm.tree.analysis.BasicValue;


public class lesson_for {
    public static void main (String[] args){

        //1980-1985 - выводим года
        int year = 1980;
        for(int j=0; j<6; j++){
            System.out.println("Год " +year++);
        }
        //Записываем массив
        int[] araiV1=new int[]{1,2,3,4,5};
       // System.out.println(araiV1[4]);
        araiV1[3]=67;
        for(int j=0; j<araiV1.length; j++){
            System.out.println(araiV1[j]);
        }

        //foreach и работа с массивом
        for(int item: araiV1){
            System.out.println(item);
        }



    }
}
