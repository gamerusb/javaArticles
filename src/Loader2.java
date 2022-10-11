import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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