package cc.ermo.springboot.swagger.entity.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2022/7/2.
 *
 * @author ermo
 * @since 1.0
 */
@Data
@ApiModel("User response")
public class UserResponse implements Serializable {

    @ApiModelProperty("userId")
    private Long id;

    @ApiModelProperty("username")
    private String username;

    @ApiModelProperty("age")
    private Integer age;

    @ApiModelProperty("roleList")
    private List<RoleResponse> roleList;
}
