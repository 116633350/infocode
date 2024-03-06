package com.info.cop.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sm_users_tb")
@ApiModel(description = "用户信息")
public class UsersTbDo implements Serializable {
    private static final long serialVersionUID = 1L;

    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    //指定自增策略   @TableId(value = "user_id", type = IdType.AUTO)

    @ApiModelProperty(value = "用户号")
    @TableField("user_no")
    private String user_no;

    @ApiModelProperty(value = "用户密码")
    private String user_password;

    @ApiModelProperty(value = "所属地区")
    private String organ_no;

    @ApiModelProperty(value = "用户名称")
    private String user_name;

    @ApiModelProperty(value = "用户英文名")
    private String user_name_en;

    @ApiModelProperty(value = "操作员级别")
    private String tellerlvl;

    @ApiModelProperty(value = "登录模式")
    private String login_mode;

    @ApiModelProperty(value = "用户状态")
    private String user_status;

    @ApiModelProperty(value = "登陆状态")
    private String login_state;

    @ApiModelProperty(value = "上次登录时间")
    private String last_login_time;

    @ApiModelProperty(value = "上次登出时间")
    private String last_logout_time;

    @ApiModelProperty(value = "系统标识")
    private String system_no;
}
