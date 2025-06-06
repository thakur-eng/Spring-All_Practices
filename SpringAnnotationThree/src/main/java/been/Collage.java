package been;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Collage {

	@Value("C V Raman")
	private String collageName;
	@Value("Ashish Thakur")
	private String studentName;
	@Value("C.S.I.T")
	private String branchName;
	@Value("1801227707")
	private String roolNumber;
	
	
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getRoolNumber() {
		return roolNumber;
	}
	public void setRoolNumber(String roolNumber) {
		this.roolNumber = roolNumber;
	}
	
	public void studentInfo() {
		System.out.println("collageName "+collageName+" studentName " +studentName+"branchName "+branchName+" roolNumber ");
	}
	
}
