package jsf.controllers;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.*;
import javax.inject.Inject;
import javax.inject.Named;

import jsf.models.User;
import jsf.repositories.UserRepositories;

@ManagedBean(name="indexController")
@SessionScoped
public class IndexController {
	
	public IndexController() {
		
	}
	
	public List<User> GetAllUsers() {
		UserRepositories userRepository = new UserRepositories();
		return userRepository.GetAll();
	}

}
