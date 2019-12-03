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
    private int code = 200;
    //private static final int FAIL_CODE = 500;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
        httpResult.setCode(200);
        httpResult.setMsg("SUCCESS");
        return httpResult;
    }

    public static HttpResult success(Object data){
        HttpResult httpResult = new HttpResult();
        httpResult.setCode(200);
        httpResult.setMsg("SUCCESS");
        httpResult.setData(data);
        return httpResult;
    }

    public static HttpResult failed(){
        HttpResult httpResult = new HttpResult();
        httpResult.setCode(500);
        httpResult.setMsg("soething is wrong");
        return httpResult;
    }


}
