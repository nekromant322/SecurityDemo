package com.override.security.dao;

import com.override.security.model.User;

public interface UserDao {
    User getUserByName(String name);
}
