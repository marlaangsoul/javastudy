package chapter07;

public class VarArgs {
	
	void printInfo(String ...infos) {
		if(infos.length != 0) {
			for(int i=0;i<infos.length;i++) {
				System.out.println(infos[i]);
			}	
			
		}else {
			System.out.println("Data Not Found ~~ ");
			
		}
	}

	public static void main(String[] args) {
		VarArgs varArgs = new VarArgs();
		varArgs.printInfo("ㅁㅁㅁ");
		
	}
	
	
	
}
