package com.czl.controller;

import com.czl.pojo.Employee_role;
import com.czl.pojo.Menu;
import com.czl.pojo.Role;
import com.czl.pojo.Role_Menu;
import com.czl.pojo.dto.EmployRole;
import com.czl.pojo.vo.Role_menuVo;
import com.czl.service.UserMenuService;
import com.czl.util.LayuiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/HotelProject")
public class UserMenuController {
    @Autowired(required = false)
    private UserMenuService userMenuService;
    /*@RequestMapping("getAllMenus")
    @ResponseBody
    public LayuiUtil<Menu> getAllMenus(@RequestParam int employeeid){
        System.out.println(employeeid);
        List<Menu> allMenu = userMenuService.getAllMenu(employeeid);
        LayuiUtil<Menu> ly = new LayuiUtil<>();
        ly.setCode(0);
        ly.setCount(allMenu.size());
        ly.setMsg("");
        ly.setData(allMenu);

       return ly;
    }*/

    @RequestMapping("getAllChildrenMenus")
    @ResponseBody
    public List<Menu> getAllChildrenMenus(@RequestParam int parentid){
        return userMenuService.getAllChildrenMenu(parentid);
    }

    @RequestMapping("employeeLogin")
    @ResponseBody
    public Menu employeeLogin(@RequestParam String username,@RequestParam String password){
        return null;
    }

    @RequestMapping("getAllMenus")
    @ResponseBody
    public List<Menu> getAllMenus(@RequestParam int employeeid){

        List<Menu> allMenu = userMenuService.getAllMenu(employeeid);
        for (Menu m:
                allMenu) {
            int parentid = m.getMenuid();
            m.setMenuList(userMenuService.getAllChildrenMenu(parentid));
        }
        System.out.println(allMenu);
        return allMenu;
    }
    @RequestMapping("getAllEmpRole")
    @ResponseBody
    public List<EmployRole> getAllEmpRole(){
        List<EmployRole> allErole = userMenuService.getAllErole();
        return allErole;
    }

    @RequestMapping("getOneEmpRoleById")
    @ResponseBody
    public EmployRole getOneEmpRoleById(@RequestParam int employeeid){
        EmployRole empRole = userMenuService.getEmpRoleById(employeeid);
        System.out.println(empRole);
        return empRole;
    }
    @RequestMapping("getAllRole")
    @ResponseBody
    public List<Role> getAllRole(){
        List<Role> roles = userMenuService.getAllRoles();
        System.out.println(roles);
        return roles;
    }

    @RequestMapping(value = "saveRole",method = RequestMethod.POST)
    @ResponseBody
    public int saveRole(@RequestBody Employee_role employee_role){
        int i = userMenuService.updateRole(employee_role);
        System.out.println(i);
        return i;
    }

    @RequestMapping("selectAllMenu")
    @ResponseBody
    public List<Menu> selectAllMenu(){
        return userMenuService.getAllMenus();
    }
    @RequestMapping(value = "addRoleMenu",method = RequestMethod.POST)
    @ResponseBody
    public int addRoleMenu(@RequestParam Integer roleid,@RequestParam List<Integer> arr){
        System.out.println(arr);
        for (Integer t:
                arr) {
            System.out.println(t);
        }
        userMenuService.deleteMenu(roleid);
        int flag = 0;
        for (Integer i: arr) {
            Role_Menu role_menu = new Role_Menu();
            role_menu.setRoleid(roleid);
            role_menu.setMnid(i);
            flag = userMenuService.addMenu(role_menu);
        }

        return flag;
    }
}
