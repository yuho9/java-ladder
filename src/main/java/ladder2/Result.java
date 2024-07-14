package ladder2;

public class Result {

	private String result;

	Result(String result){
		if (result.length() > 5) {
            throw new IllegalArgumentException("결과는 5자 이하만 가능합니다.");
        }
		this.result = result;
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String newResult) {
		this.result = newResult;
	}
	
	public String spaceSetting() {
		String result="";
		for(int i=0;i<5-result.length();i++) {
			result+=" ";
		}
		return result;
	}
}
