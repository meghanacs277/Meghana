
public class ExamException extends Exception {
	String msg;
	ExamException(String msg){
	this.msg=msg;
	}
	@Override
	public String getMessage() {
		return msg;
		
	}
	}


