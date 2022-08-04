package chapter05;

public class LoginTest {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String id = args[0];
	        String passwd = args[1];
	        System.out.println(id); //aaa
	        System.out.println(passwd); //bbb
	        
	        if(!id.equals("java")){ // 같다는 equals 만 쓰면 되는데, id 앞에 !를 붙여서 해결.
	            System.out.println("당신은 우리 회원이 아닙니다.");
	        }
	        else if(!passwd.equals("java")){
	            System.out.println("비밀번호가 일치하지 않습니다.");
	        }
	        else{
	            System.out.println("환영합니다.");
	        }
	    }
	}
