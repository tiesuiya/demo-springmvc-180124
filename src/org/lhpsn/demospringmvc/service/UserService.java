package org.lhpsn.demospringmvc.service;

import org.lhpsn.demospringmvc.param.LoginForm;

/**
 * @author lh
 * @since 1.0.0
 */
public interface UserService {
    boolean login(LoginForm loginForm);
}
