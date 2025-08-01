package cn.iocoder.yudao.module.system.api.mail.dto.code;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 短邮箱验证码的发送 Request DTO
 *
 * @author 芋道源码
 */
@Data
public class EmailCodeSendReqDTO {

    /**
     * 邮箱
     */
    @Email
    @NotEmpty(message = "邮箱不能为空")
    private String email;
    /**
     * 模板代码
     */
    @NotNull(message = "模板代码不能为空")
    private String templateCode;
    /**
     * 发送 IP
     */
    @NotEmpty(message = "发送 IP 不能为空")
    private String createIp;

}
