package com.hdsx.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据响应对象
 *    {
 *      success ：是否成功
 *      code    ：返回码
 *      message ：返回信息
 *      //返回数据
 *      data：  ：{
 *
 *      }
 *    }
 */
@Data
@NoArgsConstructor
public class Result {

    /**
     * success ：是否成功
     */
    private boolean success;

    /**
     * code ：返回码
     */
    private Integer code;

    /**
     * message ： 返回信息
     */
    private String message;

    /**
     * data : 返回数据
     */
    private Object data;

    public Result(ResultCode code) {
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
    }

    public Result(ResultCode code, Object data) {
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
        this.data = data;
    }

    public Result(Integer code, String message, boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public static Result success(){
        return new Result(ResultCode.SUCCESS);
    }

    public static Result error(){
        return new Result(ResultCode.SERVER_ERROR);
    }

    public static Result fail(){
        return new Result(ResultCode.FAIL);
    }
}
