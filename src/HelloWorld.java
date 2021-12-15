import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args){
        //вывод в консоль
       // System.out.println("Wwwaaaghhhh!");
        int valu1 = 0;
        int valu2 = 5;
        int sum = valu1 + valu2;
        System.out.println("Сумма " +sum);
        int multiply = valu1 * valu2;
        System.out.println("Произведение " +multiply);
        int difference = valu1 - valu2;
        System.out.println("Разность " +difference);
        Scanner scanner = new Scanner(System.in);
        String userInput = new Scanner(System.in).next();
        System.out.println(userInput);
    }
}

