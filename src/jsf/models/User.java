package jsf.models;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import javax.enterprise.inject.Model;

@Model
public class User {
	
	private String Name;
	private String Password;
	
	public String getName()
	{
		return Name;
	}
	
	public String getPassword()
	{
		return Password;
	}
	
	public void setName(String name)
	{
		this.Name = name;
	}
	
	public void setPassword(String password)
	{
		this.Password = password;
	}
	
	public static BasicDBObject toDBObject(User user) {
		BasicDBObject dbo = new BasicDBObject();
		
		dbo.put("Name", user.getName());
		dbo.put("Password", user.getPassword());
		
		return dbo;
	}
	
	public static User fromDBObject(DBObject doc) {
		User u = new User();
		 
		u.setName((String)doc.get("Name"));
		u.setPassword((String)doc.get("Password"));

		return u;
	}
	
}
