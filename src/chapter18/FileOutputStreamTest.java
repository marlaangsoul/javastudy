package chapter18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    /**
     * FileOutputStream 테스트
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileOutputStream fo = null;
        String msg = "FileOutputStream Test";
        byte[] byteArray = msg.getBytes();

        try{
            fo = new FileOutputStream("text2.text",true); // true : append 모두
            fo.write(byteArray);
        }
        catch(IOException io){
            io.printStackTrace();
        }
        finally{
            try{
                fo.close();
            }
            catch(IOException io){
                io.printStackTrace();
            }
        }
    }
}
