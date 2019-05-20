package com.czl.mapper;

import com.czl.pojo.*;
import com.czl.pojo.dto.EmployRole;
import com.czl.pojo.Employee_role;

import java.util.List;

public interface UserMenuMapper {

    public List<Menu> getAllMenu(int employeeid);

    public List<Menu> getAllChildrenMenu(int parentid);

    public List<EmployRole> getAllErole();

    public EmployRole getEmpRoleById(int employeeid);

    public List<Role> getAllRoles();

    public int updateRole(Employee_role employee_role);

    public List<Menu> getAllMenus();

    public int deleteMenu(int roleid);

    public int addMenu(Role_Menu role_menu);
}
