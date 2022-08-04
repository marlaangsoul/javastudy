package chapter18;
import java.io.IOException;

public class InputStreamTest {
    /**
     * InputStream 테스트
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int var_byte=-1;
        System.out.print("문자입력 >>");
        do{
            try{
                var_byte = System.in.read(); // 1byte 씩 읽어온다(한글은 깨짐)
            }
            catch(IOException io){
                io.printStackTrace();
            }
            if(var_byte == 10 || var_byte == 13) {
                break;
            }else {
                System.out.println("읽은 값 : " + (char)var_byte);
            }

        }
        while(true);
        System.out.println("end");
    }
}
