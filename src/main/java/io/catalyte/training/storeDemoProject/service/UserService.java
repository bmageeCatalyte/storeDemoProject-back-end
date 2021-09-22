package io.catalyte.training.storeDemoProject.service;

import io.catalyte.training.storeDemoProject.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
  List<User> getUsers();
  User createUser(User user);
  UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
  //public Boolean login();
}
