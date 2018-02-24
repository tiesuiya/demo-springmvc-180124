package org.lhpsn.demospringmvc.param;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 登陆表单
 *
 * @author lh
 * @since 1.0.0
 */
public class LoginForm {
    @NotEmpty
    private String userName;
    @NotEmpty
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
