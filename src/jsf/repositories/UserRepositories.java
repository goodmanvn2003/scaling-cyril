package jsf.repositories;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import jsf.models.*;
import jsf.connectors.mongodb.MongoDbConnector;

public class UserRepositories implements IBaseRepository<User> {
	
	private DBCollection _collection;
	
	public UserRepositories() {
		_collection = MongoDbConnector.GetConnectionWithCollection("localhost", MongoDbConnector.MONGODB_DEFAULT_PORT, "test").getCollection("user");
	}

	@Override
	public List<User> GetAll() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList();
		DBCursor cursor = _collection.find();
		
		for (DBObject dbo : cursor.toArray())
		{
			users.add(User.fromDBObject(dbo));
		}	
		return users;
	}

	@Override
	public User GetOneByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
