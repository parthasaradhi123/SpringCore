package partha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import partha.Dao.UserDao;

@Service
public class UserService
{
	@Autowired
	private UserDao userDao;
	
	public UserService()
	{
		System.out.println("UserService Object is created.");
	}
	
	public void storeInDb()
	{
		boolean status = userDao.save();
		if(status)
		{
			System.out.println("data saved in db");
		}
		else
		{
			System.out.println("data not saved in db");
		}
	
	}
}
