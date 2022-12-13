package MongoConJava;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoDB {
	//public static MongoClient mongoClient;
	//public static DB database;
	//public static DBCollection test;
	public static void main(String[] args) {
		/*mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		database = mongoClient.getDB("MongoDBTutorial");
		test = database.getCollection("test");
		
		TestObj testObj = new TestObj();
		testObj.setMemberId("def");
		testObj.setTimer(2);
		testObj.setXP(5678);
		
		test.insert(convert(testObj));
		
		DBObject query = new BasicDBObject("XP", 1234);
		DBCursor cursor = test.find(query);
		System.out.println(cursor.one());*/
		try {
			//Library.stain("Patty", 5, 88);
			Library.stain(null, null, null);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*public static DBObject convert(TestObj testObj) {
		return new BasicDBObject("XP", testObj.getXP()).append("Timer", testObj.getTimer())
				.append("memberID", testObj.getMemberId());
	}*/
}