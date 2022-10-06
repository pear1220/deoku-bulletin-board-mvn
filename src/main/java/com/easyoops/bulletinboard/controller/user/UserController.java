package com.easyoops.bulletinboard.controller.user;

import com.easyoops.bulletinboard.dto.user.UserDTO;
import com.easyoops.bulletinboard.service.user.UserService;
import com.easyoops.common.dto.ResponseDTO;
import com.easyoops.common.enums.ResponseCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName     : com.easyoops.bulletinboard.controller.user
 * fileName        : UserController
 * author          : jungwon.lee
 * date            : 2022-10-06
 * version         : v0.1
 */
@RestController
@RequestMapping( value = "/api/v1/session" )
@Api( tags = "사용자", consumes = "application/json" )
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping( value = "/list" )
    @ApiOperation(value = "사용자 조회")
    public ResponseDTO<List<UserDTO>> selectUserList(@RequestParam( value = "id" ) String id) {
        return new ResponseDTO<>(ResponseCode.OK, userService.selectUserList(id));
    }
}
