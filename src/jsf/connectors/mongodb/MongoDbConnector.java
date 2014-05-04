package jsf.connectors.mongodb;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.sun.istack.internal.Nullable;

public class MongoDbConnector {
	
	public final static int MONGODB_DEFAULT_PORT = 27017;
	
	public MongoDbConnector() {
		// Don't do anything
	}
	
	public static DB GetConnectionWithCollection(String host, Integer port, String dbname)
	{
		Mongo m;
		try {
			if (port == null) port = MONGODB_DEFAULT_PORT;
			
			m = new Mongo(host, port);
			return m.getDB(dbname);
		} catch (UnknownHostException e) {
			return null;
		}
	}
	
}
