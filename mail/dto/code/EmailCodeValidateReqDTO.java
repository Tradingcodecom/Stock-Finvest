package cn.iocoder.yudao.module.system.api.mail.dto.code;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 邮箱验证码的校验 Request DTO
 *
 * @author 芋道源码
 */
@Data
public class EmailCodeValidateReqDTO {

    /**
     * 邮箱
     */
    @Email
    @NotEmpty(message = "邮箱不能为空")
    private String email;
    /**
     * 发送场景
     */
    @NotNull(message = "模板代码不能为空")
    private String templateCode;
    /**
     * 验证码
     */
    @NotEmpty(message = "验证码")
    private String code;

}
