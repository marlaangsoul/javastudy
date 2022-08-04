package chapter07;

public class Car2 {
	String color;
	String company;
	String type;
	
	Car2(){
		//this.color = "white";
		//this.company = "기아"
		//this.type = "경차";
		//위랑 아래랑 같은 말.
		this("white", "기아", "경차");
	}
	Car2(String color, String company, String type){
		this.color = color;
		this.company = company;
		this.type = type;
		
	}
	
	Car2(String com, String t){
		this ("white", com, t);
	}
	Car2(String t){
		this("white", "기어", t);
	}
	public String toString() {
		return color + "-" + company + "-" + type;
		
	}
	
}
