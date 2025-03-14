package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 角色权限关系
 * 
 * @author CL
 *
 */
@Data
@TableName("sys_role_auth")
public class SysRoleAuth implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;

	/**
	 * 角色ID
	 */
	private Long roleId;

	/**
	 * 权限ID
	 */
	private Long menuId;

}
