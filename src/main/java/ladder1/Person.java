package ladder1;

public class Person {

private String name;
	
	public Person(String name){
		if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
		this.name = name;
	}
}
