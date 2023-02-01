package work.caion.api.pixelapi.result;


import work.caion.api.pixelapi.type.EnumCode;

public class Results {

    public static Result fromCode(EnumCode code) {
        return new Result(code);
    }

    public static Result fromCode(EnumCode code, Object data) {
        return new Result(code, data);
    }

    public static Result success() {
        return new Result(EnumCode.SUCCESS);
    }

    public static Result success(Object data) {
        Result result = success();
        result.setData(data);
        return result;
    }

}
