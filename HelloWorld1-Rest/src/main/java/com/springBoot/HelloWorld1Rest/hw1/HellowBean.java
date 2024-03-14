package com.springBoot.HelloWorld1Rest.hw1;

public class HellowBean {
    private String msg;

    public HellowBean(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "HellowBean{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
