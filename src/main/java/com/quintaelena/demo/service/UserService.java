package com.quintaelena.demo.service;

import com.quintaelena.demo.entity.User;
import java.util.List;

/**
 *
 * @author User
 */
public interface UserService {
    
    public List<User> findAll();
    
    public User findBy(Long id);
    
    public User save(User employee);
    
    public void delete(User employee);
    
    public void deleteBy(Long id);
            
}
