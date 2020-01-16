package com.monggopesen.service;

import com.monggopesen.domain.Users;
import com.monggopesen.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UsersServiceImpl implements UsersService {
    Logger LOGGER = LoggerFactory.getLogger(UsersServiceImpl.class);
    @Autowired
    private UsersRepository usersRepository;

    @PostConstruct()
    @Override
    public void create() {
        LOGGER.info("============  INIT =============");
        for (int i = 0; i < 6; i++) {
            Users users = Users.create("users" + i, 23 + i);
            LOGGER.info("INIT USERS  : " + users.toString());
            usersRepository.save(users);
        }
    }
}
