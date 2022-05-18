package it.prova.dao.user;

import java.util.Date;
import java.util.List;

import it.prova.dao.IBaseDAO;
import it.prova.model.User;

public interface UserDAO extends IBaseDAO<User> {
	public List<User> findAllByUsenameStartsWith(String iniziale)  throws Exception;
	
	public List<User> findAllCreatedBefore(Date dataInput)  throws Exception;
	
	public List<User> findAllByCognomeENomeStartsWith(String inizialeNome, String inizialeCognome)  throws Exception;
	
	public User login(String username, String password)  throws Exception;
}
