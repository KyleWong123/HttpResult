package http;

/**
 * <pre>
 *  ����:һ��http��Ӧ���ͨ����
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

    /**
     * ����ɹ�ʱ����Ӧ���
     * @return
     */
    public static HttpResult success(){
        HttpResult httpResult = new HttpResult();
        httpResult.setCode(httpResult.code);
        httpResult.setMsg("SUCCESS");
        return httpResult;
    }

    /**
     * ����ɹ�ʱ����Ӧ���
     * @param msg �Զ�����Ӧ����
     * @return
     */
    public static HttpResult success(String msg){
        HttpResult httpResult = new HttpResult();
        httpResult.setMsg(msg);
        httpResult.setCode(httpResult.code);
        return httpResult;
    }

    /**
     * ����ɹ�ʱ����Ӧ���
     * @param data Ҫ��Ӧ������
     * @return
     */
    public static HttpResult success(Object data){
        HttpResult httpResult = new HttpResult();
        httpResult.setCode(httpResult.code);
        httpResult.setMsg("SUCCESS");
        httpResult.setData(data);
        return httpResult;
    }

    /**
     * ����ɹ�ʱ����Ӧ���
     * @param msg �Զ�����Ӧ������
     * @param data �Զ�����Ӧ����
     * @return
     */
    public static HttpResult success(String msg, Object data){
        HttpResult httpResult = new HttpResult();
        httpResult.setCode(httpResult.code);
        httpResult.setMsg(msg);
        httpResult.setData(data);
        return httpResult;
    }

    /**
     * ����ʧ��ʱ����Ӧ����
     * @return
     */
    public static HttpResult failed(){
        HttpResult httpResult = new HttpResult();
        httpResult.setCode(500);
        httpResult.setMsg("soething is wrong");
        return httpResult;
    }

    /**
     * ����ʧ��ʱ����Ӧ����
     * @param msg �Զ�����Ӧ����
     * @return
     */
    public static HttpResult failed(String msg){
        HttpResult httpResult = new HttpResult();
        httpResult.setCode(500);
        httpResult.setMsg(msg);
        return httpResult;
    }


}
