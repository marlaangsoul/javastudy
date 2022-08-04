package memberArrayList;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Scanner;

public class DeleteAction implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 ID : ");
		String id = sc.next();
		List<MemberVO> members = MemberMain.members;
		boolean isDelete = false; 
		for(int i = 0; i < members.size(); i++) {
			if(id.equals(members.get(i).getId())) {
				members.remove(i);
				isDelete = true;				
				System.out.println("삭제 완료");
				break;
			}
		}
		if(!isDelete) {
			System.out.println("member not found!!");
		}
		
	} //execute() End

}
