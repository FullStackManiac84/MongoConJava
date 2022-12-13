package MongoConJava;

public class TestObj {
	private String memberID = "";
	private int timer = 0;
	private int xp = 0;
	public TestObj() {
		
	}
	
	public String getMemberId() {
		return memberID;
	}
	
	public int getXP() {
		return xp;
	}
	
	public int getTimer() {
		return timer;
	}
	
	public void setMemberId(String memberID) {
		this.memberID = memberID;
	}
	
	public void setXP(int xp) {
		this.xp = xp;
	}
	
	public void setTimer(int timer) {
		this.timer = timer;
	}
}
