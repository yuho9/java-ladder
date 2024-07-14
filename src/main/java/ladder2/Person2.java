package ladder2;

public class Person2 {

	private String name;
	
	Person2(String name){
		if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String spaceSetting() {
		String result="";
		for(int i=0;i<5-name.length();i++) {
			result+=" ";
		}
		return result;
	}

}
