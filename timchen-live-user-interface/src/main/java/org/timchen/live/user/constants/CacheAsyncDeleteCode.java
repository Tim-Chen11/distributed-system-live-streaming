package org.timchen.live.user.constants;

/**
 * @Author: Tim Chen
 * @Date: 17:16 2024-07-22
 * @Description:
 */
public enum CacheAsyncDeleteCode {
    USER_INFO_DELETE(0, "用户基础信息删除"),
    USER_TAG_DELETE(1, "用户标签删除");
    int code;
    String desc;

    CacheAsyncDeleteCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
