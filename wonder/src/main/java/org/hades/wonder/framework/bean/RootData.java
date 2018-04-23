package org.hades.wonder.framework.bean;

/**
 * Created by Hades on 2017/10/30.
 */

public class RootData<T> {
    public int status;         //1=成功 0=失败 -1=错误
    public String message;  //成功、错误msg
    public T data;          //成功返回的数据
}
