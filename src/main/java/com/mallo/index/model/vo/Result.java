package com.mallo.index.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * rest标准返回对象
 * @author 北京拓尔思信息技术股份有限公司
 * @since slzs @ 2017年3月27日 上午9:12:55
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL) // 属性为null时不输出
public class Result {

    /**
     * 响应码 @see ERRORCODE 0:正常,-1:默认失败,100:未登录,101:状态异常,102:权限不够,自定义 <-1
     * 其它常见HTTP错误码:404/503/500等
     */
    private int status = 0;
    private String message;                     // 常用作错误或异常详情描述
    private Object data;                        // 结果数据

    /**
     * 创建结果对象
     * @param data 结果数据
     */
    public Result(Object data) {
        this.data = data;
    }
}
