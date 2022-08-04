package memberArrayList;

import java.util.List;
import java.util.Scanner;

public class UpdateAction implements Action{

	@Override
	public void execute(Scanner sc) {
		// 1. 수정할 ID
		System.out.println("수정할 ID : ");
		String id = sc.next();
		MemberVO member = null;
		List<MemberVO> members = MemberMain.members;
		int updateIndex = -1;
		int index = -1;
		for(MemberVO m:members) {
			index++;
			if(id.equals(m.getId())) {
				member = m;	
				updateIndex = index;
				break;
			}
		}		
		System.out.println(member); // 		
		// 2. 수정: PW, NAME, AGE
		if(member != null) {
			System.out.print("Old-PW : ");
			System.out.print("New-PW : ");
			String pw = sc.next();
			System.out.print("NAME : ");
			String name = sc.next();
			System.out.print("AGE : ");
			int age = sc.nextInt();
			member.setPw(pw);
			member.setName(name);
			member.setAge(age);
			
			
		}else {
			System.out.println("member not found!!!");
		}
	}

}
