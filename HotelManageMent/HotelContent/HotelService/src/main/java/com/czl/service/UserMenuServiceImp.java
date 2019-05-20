package com.czl.service;

import com.czl.mapper.UserMenuMapper;
import com.czl.pojo.Employee_role;
import com.czl.pojo.Menu;
import com.czl.pojo.Role;
import com.czl.pojo.Role_Menu;
import com.czl.pojo.dto.EmployRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserMenuServiceImp implements UserMenuService {
    @Autowired
    private UserMenuMapper userMenuMapper;
    @Override
    public List<Menu> getAllMenu(int employeeid) {
        return userMenuMapper.getAllMenu(employeeid);
    }

    @Override
    public List<Menu> getAllChildrenMenu(int parentid) {
        return userMenuMapper.getAllChildrenMenu(parentid);
    }

    @Override
    public List<EmployRole> getAllErole() {
        return userMenuMapper.getAllErole();
    }

    @Override
    public EmployRole getEmpRoleById(int employeeid) {
        return userMenuMapper.getEmpRoleById(employeeid);
    }

    @Override
    public List<Role> getAllRoles() {
        return userMenuMapper.getAllRoles();
    }

    @Override
    public int updateRole(Employee_role employee_role) {
        return userMenuMapper.updateRole(employee_role);
    }

    @Override
    public List<Menu> getAllMenus() {
        return userMenuMapper.getAllMenus();
    }

    @Override
    public int deleteMenu(int roleid) {
        return userMenuMapper.deleteMenu(roleid);
    }

    @Override
    public int addMenu(Role_Menu role_menu) {
        return userMenuMapper.addMenu(role_menu);
    }
}
