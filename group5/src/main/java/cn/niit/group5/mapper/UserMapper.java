package cn.niit.group5.mapper;

import cn.niit.group5.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

    //根据手机号码查询用户
    User getUserByPhoneNumber(String phoneNumber);
//    注册
    int signUp(User user);
//    更新我的资料
    int updateMyMsg(User user);
//
}