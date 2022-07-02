package cc.ermo.springboot.swagger.entity.request;

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
@ApiModel("User")
public class UserRequest implements Serializable {

    @ApiModelProperty("username")
    private String username;

    @ApiModelProperty("age")
    private Integer age;

    @ApiModelProperty("roleList")
    private List<RoleRequest> roleList;
}
