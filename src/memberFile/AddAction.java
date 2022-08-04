package memberFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddAction implements Action{

    @Override
    public void execute(Scanner sc) {
        System.out.println("회원 정보 입력");
        System.out.print("ID :");
        String id = sc.next();
        System.out.print("PW :");
        String pw = sc.next();
        System.out.print("사용자 이름 :");
        String name = sc.next();
        System.out.print("사용자 나이 :");
        int age = sc.nextInt();
        
        String member = id + "," + pw + "," + name + "," + age + "\r\n";

        FileWriter fw = null;

        try {
			fw = new FileWriter("members.txt", true) ; //true : append
			fw.write(member);
        	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    }
}

//csv : id,pw,name,age
//FileWrite
