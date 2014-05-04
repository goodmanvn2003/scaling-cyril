package jsf.repositories;

import java.util.*;

public interface IBaseRepository<T> {
	
	List<T> GetAll();
	T GetOneByKey(String key);
	
}
