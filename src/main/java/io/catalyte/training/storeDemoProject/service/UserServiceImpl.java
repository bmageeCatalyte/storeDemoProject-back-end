package io.catalyte.training.storeDemoProject.service;

import io.catalyte.training.storeDemoProject.model.User;
import io.catalyte.training.storeDemoProject.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getUsers() {
    return null;
  }

  @Override
  public User createUser(User user) {
    return null;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username);
    if (user == null) {
      throw new UsernameNotFoundException(username);
    }
    return user;
  }
}
