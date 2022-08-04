package memberArrayList_LBH;

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

        MemberVo member = new MemberVo(id, pw, name, age);
        
        MemberMain.members.add(member);
        
    }
}

