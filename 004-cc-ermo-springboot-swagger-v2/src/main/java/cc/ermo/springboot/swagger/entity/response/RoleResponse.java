package cc.ermo.springboot.swagger.entity.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created on 2022/7/2.
 *
 * @author ermo
 * @since 1.0
 */
@Data
@ApiModel("Role response")
public class RoleResponse implements Serializable {

    @ApiModelProperty("roleId")
    private Long id;

    @ApiModelProperty("roleName")
    private String name;
}
