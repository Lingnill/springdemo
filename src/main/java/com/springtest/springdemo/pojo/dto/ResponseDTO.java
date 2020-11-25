package com.springtest.springdemo.pojo.dto;

import lombok.Data;

/**
 * @author lingnill
 */
@Data
public class ResponseDTO {

    private String msg;

    private Boolean res;

    private Object data;

    private Integer status;

    private Integer errorCode;

    public ResponseDTO(String msg, Boolean res, Object data, Integer status, Integer errorCode) {
        this.msg = msg;
        this.res = res;
        this.data = data;
        this.status = status;
        this.errorCode = errorCode;
    }

    public static ResponseDTO ok(String msg) {
        return new ResponseDTO(msg, true, null, 200, null);
    }

    public static ResponseDTO ok(String msg, Object data) {
        return new ResponseDTO(msg, true, data, 200, null);
    }

    public static ResponseDTO fail(String msg, Object data,Integer status,Integer errorCode) {
        return new ResponseDTO(msg, false, data, status, errorCode);
    }

    public static ResponseDTO fail(String msg) {
        return new ResponseDTO(msg, false, null, null, null);
    }
}