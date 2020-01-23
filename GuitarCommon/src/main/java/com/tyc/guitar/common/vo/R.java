package com.tyc.guitar.common.vo;

import com.tyc.guitar.common.result.ResultCode;
import lombok.Data;

@Data
public class R {
    private int code;//结果码
    private String msg;//字符串
    private Object data;//携带数据

    public static R setResult(boolean issucc,String data){
        if(issucc){
            return R.ok(data);
        }else {
            return R.fail(data);
        }
    }

    public static R setR(int code,String msg,Object data){
        R r=new R();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
    public static R ok(Object data){
        return setR(ResultCode.OK.getVal(),"OK",data);
    }
    public static R ok(){
        return setR(ResultCode.OK.getVal(),"OK",null);
    }
    public static R ok(String msg){
        return setR(ResultCode.OK.getVal(),msg,null);
    }
    public static R fail(){
        return setR(ResultCode.ERROR.getVal(),"Error",null);
    }
    public static R fail(String msg){
        return setR(ResultCode.ERROR.getVal(),msg,null);
    }

}
