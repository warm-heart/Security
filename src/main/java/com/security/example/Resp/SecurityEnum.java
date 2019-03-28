package com.security.example.Resp;

/**
 * @author wangqianlong
 * @create 2019-03-20 10:20
 */

public enum  SecurityEnum {
    SUCCESS(1,"成功"),
    END(0,"结束");

    private int state;

    private String stateInfo;

    SecurityEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static SecurityEnum stateOf(int index) {
        for (SecurityEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}

