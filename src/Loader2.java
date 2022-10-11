import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Координатные четверти
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3
*/


public class Loader2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberOX = reader.readLine();
        String numberOY = reader.readLine();
        int numOX;
        int numOY;
        numOX = Integer.parseInt(numberOX);
        numOY = Integer.parseInt(numberOY);

        if(numOX > 0 && numOY >0){
            System.out.println(1);
        }
        else if(numOX < 0 && numOY >0){
            System.out.println(2);
        }
        else if(numOX < 0 && numOY < 0){
            System.out.println(3);
        } else {
            System.out.println(4);
        }

    }

}
