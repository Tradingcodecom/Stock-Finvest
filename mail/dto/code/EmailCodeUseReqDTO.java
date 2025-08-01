package cn.iocoder.yudao.module.system.api.mail.dto.code;

import cn.iocoder.yudao.framework.common.validation.Mobile;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 邮箱验证码的使用 Request DTO
 *
 * @author 芋道源码
 */
@Data
public class EmailCodeUseReqDTO {

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
     * 验证码
     */
    @NotEmpty(message = "验证码")
    private String code;
    /**
     * 使用 IP
     */
    @NotEmpty(message = "使用 IP 不能为空")
    private String usedIp;

}
