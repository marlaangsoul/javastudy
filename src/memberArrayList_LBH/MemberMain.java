package memberArrayList_LBH;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MemberMain {
	// 저장소 : ArryList
    static List<MemberVo> members = new ArrayList<MemberVo>();
    // member 저장 배열
    //CRUD
    //C-1
    //R-2
    //U-3
    //D-4
    //Q-5
    public static void main(String[] args) {

        MemberService ms = new MemberService();
        Action action = null;
        Scanner sc = new Scanner(System.in);
        boolean isStop = false;
        do {
        	System.out.println("메뉴를 선택하세요.");
        	System.out.println("=============");
            System.out.println("1. new 회원 가입");
            System.out.println("2. 회원 목록 보기");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 정보 삭제");
            System.out.println("5. 나가기");
            System.out.println("=============");

            String command = sc.next();
            switch (command) {
            case "1":
                System.out.println("회원 가입 시작");
                action = new AddAction();
                ms.process(action, sc);
                break;
            case "2":
                System.out.println("회원 목록 보기");
                action = new ListAction();
                ms.process(action, sc);
                break;
            case "3":
                System.out.println("회원 정보 수정");
                action = new UpdateAction();
                ms.process(action, sc);
                break;
            case "4":
            	System.out.println("회원 정보 삭제");
            	action = new DeleteAction();
            	ms.process(action, sc);
            	break;
            case "5":
                System.out.println("회원 관리가 종료 되었습니다.");
                isStop = true;
                break;
            default : 
            	System.out.println("번호를 다시 입력해주세요.");
            	break;
            }
        }while(!isStop);
    }
}