package org.lhpsn.demospringmvc.service;

import org.lhpsn.demospringmvc.bean.User;
import org.lhpsn.demospringmvc.param.LoginForm;
import org.lhpsn.demospringmvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lh
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean login(LoginForm loginForm) {
        User user = userRepository.findByUserNameAndPassWord(loginForm.getUserName(), loginForm.getPassWord());
        return user != null;
    }
}
