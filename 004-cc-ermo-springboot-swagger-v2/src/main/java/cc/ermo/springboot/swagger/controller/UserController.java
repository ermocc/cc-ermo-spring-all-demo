package cc.ermo.springboot.swagger.controller;

import cc.ermo.springboot.swagger.entity.request.RoleRequest;
import cc.ermo.springboot.swagger.entity.request.UserRequest;
import cc.ermo.springboot.swagger.entity.response.RoleResponse;
import cc.ermo.springboot.swagger.entity.response.UserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2022/7/2.
 *
 * @author tao.lv
 * @since 1.0
 */
@Api(value = "User API", tags = "User API")
@RestController
public class UserController {

    /**
     * Save user
     *
     * @param request request
     * @return user response
     */
    @ApiOperation("Save user")
    @PostMapping("/user/save")
    public UserResponse saveUser(@RequestBody UserRequest request) {
        final UserResponse userResponse = new UserResponse();
        userResponse.setAge(request.getAge());
        userResponse.setId(1L);
        userResponse.setUsername("Tom");

        List<RoleResponse> roleResponseList = new ArrayList<>();
        userResponse.setRoleList(roleResponseList);
        for (RoleRequest role : request.getRoleList()) {
            RoleResponse roleResponse = new RoleResponse();
            roleResponse.setId(role.getId());
            roleResponse.setName(role.getName());
            roleResponseList.add(roleResponse);
        }
        return userResponse;
    }
}
