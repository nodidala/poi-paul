package com.poipaul.service;

import com.poipaul.pojo.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author paul
 * @Description
 * @date 2019/7/31 15:51
 */
public interface UserService {

    List<User> selectUsers();
    boolean batchImport(String fileName, MultipartFile file) throws Exception;

}
