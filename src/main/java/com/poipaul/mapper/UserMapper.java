package com.poipaul.mapper;

import com.poipaul.pojo.User;

import java.util.List;

/**
 * @author paul
 * @date 2019/7/31 15:50
 */
public interface UserMapper {

    List<User> selectUsers();

    void updateUserByName(User user);

    void addUser(User user);

    int selectByName(String username);

}
