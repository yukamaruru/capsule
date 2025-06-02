package capsule;

public class Person {
	
	private String name = null;
	private int age = 0;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}//getの後ろの１文字目は大文字。getの時は必ずreturn。
	
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}//setの後ろの１文字目は大文字。setの時は戻り値の型の位置にvoidと書く。今回はsetNameで名前を書き換える処理を行うだけのため戻り値なしのvoid。
	
	public void setAge(int age) {
		this.age = age;
	}

}
