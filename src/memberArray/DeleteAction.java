package memberArray;
import java.util.Scanner;
public class DeleteAction implements Action{

	@Override
	public void execute(Scanner sc) {
		// id 찾기
		System.out.println("삭제할 ID를 입력해주세요.");
		System.out.print("ID :");
		String id = sc.next(); // 1111
		MemberVo member = null;
		MemberVo[] members = MemberMain.members;
		int deleteIndex = -1;
		for(int i=0;i<members.length;i++) {
			if(members[i].getId().equals(id)) {
				deleteIndex = i;
				break;
			}
		}
		//삭제 : deleteIndex만 빼고 새로 복사.
		if(deleteIndex != -1) {

			MemberVo[] temp = new MemberVo[members.length -1];
			for(int i=0;i<members.length;i++) {
				if(i == deleteIndex) {
					continue;
				}else if(i > deleteIndex){
					temp[i-1] = members[i];
				}else {
					temp[i] = members[i];                   
				}
			}
			MemberMain.members = temp;
		}else {
			System.out.println("삭제할 ID가 없습니다.");
		}
	}
}
