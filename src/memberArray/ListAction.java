package memberArray;

import java.util.Scanner;

public class ListAction implements Action{

    @Override //오버라이드
    public void execute(Scanner sc) {
        MemberVo[] members =  MemberMain.members;
        System.out.printf("=== Member Count %s명 === \n",members.length);
//        for(MemberVo member:members)
//        	System.out.println(member.toString());
    
        for(int i=0;i<members.length;i++){
            System.out.print("ID: " + members[i].getId() +" / ");
            System.out.print("PW: " + "*****" +" / ");
            System.out.print("Name: " + members[i].getName() +" / ");
            System.out.print("Age: " + members[i].getAge() );
            System.out.println();
        }
//        System.out.printf("=== Member Count %s명 ===\n",members.length);
//        for(MemberVo m: members) {
//            System.out.print("ID: " + m.getId() +" / ");
//            System.out.print("PW: " + m.getPw() +" / ");
//            System.out.print("Name: " + m.getName() +" / ");
//            System.out.print("Age: " + m.getAge() );
//            System.out.println();
//        }
    }
}
