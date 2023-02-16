package com.dfrz.utils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ResultResponse {
    private Boolean success;
    private Integer code;
    private String message;
    private Map<String,Object> data = new HashMap<>();

    private ResultResponse(){}

    public static ResultResponse ok(){
        ResultResponse r = new ResultResponse();
        r.setSuccess(ResultCodeEnum.SUCCESS.isSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return r;
    }

    public static ResultResponse error(){
        ResultResponse r = new ResultResponse();
        r.setSuccess(ResultCodeEnum.UNKNOWN_ERROR.isSuccess());
        r.setCode(ResultCodeEnum.UNKNOWN_ERROR.getCode());
        r.setMessage(ResultCodeEnum.UNKNOWN_ERROR.getMessage());
        return r;
    }
    //自定义返回数据
    public ResultResponse data(Map<String,Object> map){
        this.setData(map);
        return this;
    }
    //设置通用data
    public ResultResponse data(String key,Object value){
        this.data.put(key,value);
        return this;
    }
    //自定义状态信息
    public ResultResponse message(String message){
        this.setMessage(message);
        return this;
    }
    //自定义状态码
    public ResultResponse code(Integer code){
        this.setCode(code);
        return this;
    }
    //自定义返回结果
    public ResultResponse success(Boolean success){
        this.setSuccess(success);
        return this;
    }
}
