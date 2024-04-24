package edu.homework.web.logic;

import edu.homework.web.bean.AuthInfo;
import edu.homework.web.bean.User;

public class LogicStub {


        public User checkAuth(AuthInfo authInfo) {

            if("user@mail.ru".equals(authInfo.getLogin())) {
                return new User("Olga", "admin");
            }
            return new User(authInfo.getLogin(), "Новый пользователь");
        }

    }

