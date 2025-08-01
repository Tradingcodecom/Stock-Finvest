package cn.iocoder.yudao.module.system.api.mail;

import cn.iocoder.yudao.framework.common.exception.ServiceException;
import cn.iocoder.yudao.module.system.api.mail.dto.code.EmailCodeSendReqDTO;
import cn.iocoder.yudao.module.system.api.mail.dto.code.EmailCodeUseReqDTO;
import cn.iocoder.yudao.module.system.api.mail.dto.code.EmailCodeValidateReqDTO;
import jakarta.validation.Valid;

/**
 * 邮箱验证码 API 接口
 *
 */
public interface MailCodeApi {

    /**
     /**
     * 创建邮箱验证码，并进行发送
     *
     * @param reqDTO 发送请求
     */
    void sendMailCode(@Valid EmailCodeSendReqDTO reqDTO);

    /**
     * 验证邮箱验证码，并进行使用
     * 如果正确，则将验证码标记成已使用
     * 如果错误，则抛出 {@link ServiceException} 异常
     *
     * @param reqDTO 使用请求
     */
    void useMailCode(@Valid EmailCodeUseReqDTO reqDTO);

    /**
     * 检查验证码是否有效
     *
     * @param reqDTO 校验请求
     */
    void validateMailCode(@Valid EmailCodeValidateReqDTO reqDTO);

}
