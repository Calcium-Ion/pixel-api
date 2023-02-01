package work.caion.api.pixelapi.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import work.caion.api.pixelapi.type.EnumCode;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {

    int code;
    String msg;
    Object data;

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(EnumCode code) {
        this(code.getCode(), code.getDesc());
    }

    public Result(EnumCode code, Object data) {
        this(code.getCode(), code.getDesc(), data);
    }
}
