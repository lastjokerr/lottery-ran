package cn.ran.lottery.common;

/**
 * <p>
 *  枚举信息定义
 * </p>
 *
 * @param 异常信息
 * @return 异常信息处理
 * @author: ran
 * @since: 2023/9/18 11:18
 */


public class Constants {
    public enum ResponseCode {
        SUCCESS("0000", "成功"),
        UN_ERROR("0001","未知失败"),
        ILLEGAL_PARAMETER("0002","非法参数"),
        INDEX_DUP("0003","主键冲突");

        private String code;
        private String info;

        ResponseCode(String code, String info) {
            this.code = code;
            this.info = info;
        }

        public String getCode() {
            return code;
        }

        public String getInfo() {
            return info;
        }

    }
}