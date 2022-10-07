
package ca.sait.services;

import ca.servlets.models.User;

/**
 *Service provider for account
 * @author Sri
 */
public class AccountService 
{
    /**
     * Login a user
     * @param username username
     * @param password password
     * @return user instance if login credentials are correct or null
     */
    public User login(String username, String password)
    {

        if("abe".equals(username) && "password".equals(password))
        {
            User user = new User(username, password);
            return user;
        }
        else if("barb".equals(username) && "password".equals(password))
        {
            User user = new User(username, password);
            return user;
        }
        else
        {
            return null;
        }
        
    }
    
}
