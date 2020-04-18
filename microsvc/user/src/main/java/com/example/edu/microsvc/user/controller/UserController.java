package com.example.edu.microsvc.user.controller;

import com.example.edu.microsvc.user.entity.UserEntity;
import com.example.edu.microsvc.user.repository.UserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "v1")
public class UserController {
   public UserController(){

   }
    @Autowired
    private UserRepository userRepository;

    /**
     * 查
     * @return
     */
    @GetMapping(value = "/users")
    @ApiOperation(value = "获取用户列表", notes = "获取当前用户列表",produces = "application/json")
    public List<UserEntity> getUserList(){
        return userRepository.findAll();
    }

    /**
     * 增
     * @param username
     * @param password
     * @return
     */
    @PostMapping(value = "/users")
    @ApiOperation(value = "添加用户记录", notes = "添加一条用户记录，用户名，密码必填",produces = "application/json")
    public UserEntity addUser(@RequestParam("username") String username,
                              @RequestParam("password") String password){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(username);
        userEntity.setPassWord(password);
        return userRepository.save(userEntity);
    }

    /**
     * 改
     * @param id
     * @param username
     * @param password
     * @return
     */
    @PutMapping(value = "users/{id}")
    @ApiOperation(value = "修改用户记录", notes = "修改一条用户记录",produces = "application/json")
    public UserEntity updUser(@PathVariable("id") Integer id,
                              @RequestParam("username") String username,
                              @RequestParam("password") String password){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setUserName(username);
        userEntity.setPassWord(password);
        return userRepository.save(userEntity);

    }

    /**
     * 删除用户
     * @param 用户Id
     */
    @DeleteMapping(value = "users/{id}")
    //@ApiOperation(value = "删除用户记录", notes = "获取当前用户列表",produces = "application/json")
    public void delUser(@PathVariable("id") Integer id){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userRepository.delete(userEntity);
    }
}
