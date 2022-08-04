package chapter18;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    /**
     * FileInputStream 테스트
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileInputStream fIn=null;

        try{
            // 파일 있어야 함(워크스페이스 프로젝트 폴더)
            fIn = new FileInputStream("C:\\bigdata0214\\javaws\\test.txt");

        }
        catch(IOException io){
            io.printStackTrace();
        }

        int var_read = -1;

        try{
            while((var_read = fIn.read()) != -1){
                System.out.print((char)var_read);
            }
        }
        catch(IOException io){
            io.printStackTrace();
        }
        finally{
            try{
                fIn.close();
            }
            catch(IOException io){
                io.printStackTrace();
            }
        }
    }
}
