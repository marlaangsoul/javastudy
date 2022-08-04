package memberArrayList_LBH;

import java.util.List;
import java.util.Scanner;

public class ListAction implements Action{

    @Override
    public void execute(Scanner sc) {
        List<MemberVo> members =  MemberMain.members;

        System.out.printf("=== Member Count %s명 === \n",members.size());
        for(int i=0;i<members.size();i++) {
            System.out.print("ID: " + members.get(i).getId() +" / ");
            System.out.print("PW: " + members.get(i).getPw() +" / ");
            System.out.print("Name: " + members.get(i).getName() +" / ");
            System.out.print("Age: " + members.get(i).getAge() );
            System.out.println();
        }
//        System.out.printf("=== Member Count %s명 ===\n",members.size());
//        for(MemberVo m: members) {
//            System.out.print("ID: " + m.getId() +" / ");
//            System.out.print("PW: " + m.getPw() +" / ");
//            System.out.print("Name: " + m.getName() +" / ");
//            System.out.print("Age: " + m.getAge() );
//            System.out.println();
//        }
    }

}
