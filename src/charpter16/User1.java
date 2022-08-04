package charpter16;

import java.io.Serializable; // 난 파일이 될수 있는 아이다.

public class User1 implements Serializable{
	
	private static final long serialversionUID = 1L;
	
	private String id;
	private String passwd;
	private int age;
	private String name;
	
	public User1(String id, String passwd, int age, String name) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.age = age;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", passwd=" + passwd + ", age=" + age + ", name=" + name + "]";
	}
	
	
	

	
	

}
