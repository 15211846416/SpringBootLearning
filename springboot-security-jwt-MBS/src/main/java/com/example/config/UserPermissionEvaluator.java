package com.example.config;

import com.example.entity.SysAuth;
import com.example.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 用户权限注解处理类
 * 
 * @author CL
 *
 */
@Component
public class UserPermissionEvaluator implements PermissionEvaluator {

	@Autowired
	private SysUserService sysUserService;

	/**
	 * 判断是否拥有权限
	 * 
	 * @param authentication 用户身份
	 * @param targetUrl      目标路径
	 * @param permission     路径权限
	 * 
	 * @return 是否拥有权限
	 */
	@Override
	public boolean hasPermission(Authentication authentication, Object targetUrl, Object permission) {
		SysUserDetails sysUserDetails = (SysUserDetails) authentication.getPrincipal();

		Set<String> permissions = new HashSet<String>(); // 用户权限

		List<SysAuth> authList = sysUserService.findAuthByUserId(sysUserDetails.getId());
		authList.forEach(auth -> {
			permissions.add(auth.getPermission());
		});

		// 判断是否拥有权限
		if (permissions.contains(permission.toString())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType,
                                 Object permission) {
		return false;
	}

}
