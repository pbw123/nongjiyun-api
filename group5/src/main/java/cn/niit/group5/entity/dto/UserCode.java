package cn.niit.group5.entity.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class UserCode {
    @NotNull
    @Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$",
            message = "请输入正确的手机号")
    private String phoneNumber;
    @NotNull(message = "验证码不能为空")
    private String code;
}
