package com.dfrz.controller;

import com.dfrz.pojo.User;
import com.dfrz.service.UserService;
import com.dfrz.utils.ResultResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 老王
 * @since 2023-02-15
 */
@RestController
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/doLogin")
    public Map<String,Object> doLogin(@RequestBody User user, HttpSession session){
        System.out.println(user);
        boolean flag = false;
        Map<String,Object> map = new HashMap<>();
        User loginer = userService.doLogin(user);
        if(loginer!=null){
            session.setAttribute("loginer",loginer);
            flag = true;
        }
        map.put("flag",flag);
        map.put("code",1);
        return map;
    }

    @RequestMapping("/doLoginMap")
    public ResultResponse doLoginBackMap(@RequestBody User user, HttpSession session){
        System.out.println(user);
        User loginer = userService.doLogin(user);
        if(loginer!=null){
            session.setAttribute("loginer",loginer);
            return ResultResponse.ok().data("itms",loginer).message("登录");
        }
        return ResultResponse.error().message("账号+密码错误了吧");
    }

    @RequestMapping("/getAllUser")
    public ResultResponse getAllUser(@RequestBody User user){
        System.out.println(user);
        List<User> userList = userService.getAllUser(user);
        Map<String,Object> map = new HashMap<>();
        if(userList!=null&&userList.size()!=0){
            return ResultResponse.ok().data("itms",userList).message("所有用户信息");
        }
        return ResultResponse.error().message("查无数据");
    }
}

