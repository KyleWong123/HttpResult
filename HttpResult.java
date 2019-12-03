package http;

/**
 * <pre>
 *  √Ë ˆ:
 * </pre>
 *
 * @author KyleWong(wangfan)
 * @version 1.0.0
 * @date 2019/12/3 9:28
 */
public class HttpResult {
    private static final int SUCCESS_CODE = 200;
    private static final int FAIL_CODE = 500;
    private String msg;
    private Object data;

    public static int getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static int getFailCode() {
        return FAIL_CODE;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static HttpResult success(){
        HttpResult httpResult = new HttpResult();
        httpResult.setMsg("SUCCESS");
        return httpResult;
    }
}
