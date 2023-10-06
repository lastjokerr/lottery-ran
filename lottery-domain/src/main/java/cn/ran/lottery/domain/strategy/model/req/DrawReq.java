package cn.ran.lottery.domain.strategy.model.req;

/**
 * @param null
 * @author ran
 * @return null
 * @data 2023/10/6 12:30
 */
public class DrawReq {

    // 用户id
    private String uId;

    // 策略id
    private Long strategyId;


    public DrawReq() {
    }

    public DrawReq(String uId, Long strategyId) {
        this.uId = uId;
        this.strategyId = strategyId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}
