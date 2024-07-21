package ladder2;

public class StringList {

	private String name;

    public StringList(String name) {
        this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getFormattedName() {
        return String.format("%-5s", name);
    }
}
