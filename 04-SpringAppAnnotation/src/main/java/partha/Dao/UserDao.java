package partha.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao 
{

	
	public UserDao()
	{
		System.out.println("User Dao Object created");
	}
	
	public boolean save()
	{
		System.out.println("able to save data in DB");
		return true;
	}
}
