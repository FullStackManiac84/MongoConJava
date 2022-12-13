package MongoConJava;

public class ZywickSpecial {

	public boolean isInitialMove;
	public boolean isCaptured;
	public int rank;
	public String pieceName;
	public String imageName;
	
	public ZywickSpecial(ZywickSpecial pwzSpec) {
		this.isInitialMove = pwzSpec.isInitialMove;
		this.rank = pwzSpec.rank;
		this.pieceName = pwzSpec.pieceName;
		this.isCaptured = pwzSpec.isCaptured;
		this.imageName = pwzSpec.imageName;
	}
}
