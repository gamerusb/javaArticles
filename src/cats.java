
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное и отрицательное число
*/

public class cats {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        if (a > 0){
            a = a * 2;

        }if (a < -0){
            a = a + 1;

        }else if (a == 0) {

        }
        System.out.println(a);
    }


}

