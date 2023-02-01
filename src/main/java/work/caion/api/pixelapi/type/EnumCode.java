package work.caion.api.pixelapi.type;

import lombok.Getter;

@Getter
public enum EnumCode {

    SUCCESS(200, "OK"),
    UNKNOWN(900, "未知错误"),
    CANNOT_CONNECT(901, "无法连接到服务器");

    int code;
    String desc;

    EnumCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
