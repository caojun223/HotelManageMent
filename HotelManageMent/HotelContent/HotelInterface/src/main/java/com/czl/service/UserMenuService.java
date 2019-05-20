package com.czl.service;

import com.czl.pojo.Employee_role;
import com.czl.pojo.Menu;
import com.czl.pojo.Role;
import com.czl.pojo.Role_Menu;
import com.czl.pojo.dto.EmployRole;

import java.util.List;

public interface UserMenuService {

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
