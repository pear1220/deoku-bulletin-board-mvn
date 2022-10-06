package com.easyoops.bulletinboard.dto.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * packageName     : com.easyoops.bulletinboard.dto.user
 * fileName        : UserDTO
 * author          : jungwon.lee
 * date            : 2022-10-06
 * version         : v0.1
 */
@Data
public class UserDTO {
    @ApiModelProperty(required = true, value = "ID")
    private String id;

    @ApiModelProperty(required = true, value = "Password")
    private String password;

    @ApiModelProperty(value = "email")
    private String email;

    @ApiModelProperty(value = "전화번호")
    private String phone;

}