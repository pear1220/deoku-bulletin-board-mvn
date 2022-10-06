package com.easyoops.bulletinboard.service.user;

import com.easyoops.bulletinboard.dto.user.UserDTO;
import com.easyoops.bulletinboard.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

/**
 * packageName     : com.easyoops.bulletinboard.service.user
 * fileName        : UserService
 * author          : jungwon.lee
 * date            : 2022-10-06
 * version         : v0.1
 */
@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserMapper userMapper;

    public List<UserDTO> selectUserList(String id) {
        return userMapper.selectUserList(id);
    }
}
