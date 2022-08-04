package memberArrayList_LBH;
import java.util.List;
import java.util.Scanner;
public class UpdateAction implements Action{
    @Override
    public void execute(Scanner sc) {
        System.out.println("아래와 같이 입력해주세요.");

        // 수정할 id 찾기
        System.out.print("수정할 ID :");
        String id = sc.next(); // 1111
        MemberVo member = null;
        List<MemberVo> members = MemberMain.members;
        for(MemberVo m:members) {
            if(m.getId().equals(id)) {
                member = m;
                break;
            }
        }
        // id 있으면 PW,NAME,AGE 수정
        if(member != null) {
        	System.out.print("기존 PW :");
        	System.out.print("수정 PW :");
            String pw = sc.next();
            System.out.print("수정 NAME :");
            String name = sc.next();
            System.out.print("수정 AGE :");
            int age = sc.nextInt();

            // 1. setXXX()
            member.setPw(pw);
            member.setName(name);
            member.setAge(age);

            // 2. MememberVo 주소 변경
            MemberVo m = new MemberVo(member.getId(), pw, name, age);
            member = m;

        }else {
            System.out.println("없는 ID입니다.");
            System.out.println("메뉴로 돌아갑니다.");
        }


    }

}

