package org.lhpsn.demospringmvc.repository;

import org.lhpsn.demospringmvc.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * @author lh
 * @since 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Serializable> {
    User findByUserNameAndPassWord(String userName, String passWord);
}
