package cn.iocoder.yudao.module.system.api.logger;

import cn.iocoder.yudao.module.system.api.logger.dto.LoginLogCreateReqDTO;
import jakarta.validation.Valid;

import java.time.LocalDate;

/**
 * 登录日志的 API 接口
 *
 * @author 芋道源码
 */
public interface LoginLogApi {

    /**
     * 创建登录日志
     *
     * @param reqDTO 日志信息
     */
    void createLoginLog(@Valid LoginLogCreateReqDTO reqDTO);

    Long getUniqueAccessCount(LocalDate today);

}
