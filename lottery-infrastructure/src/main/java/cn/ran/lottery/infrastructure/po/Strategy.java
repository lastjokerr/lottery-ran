package cn.ran.lottery.infrastructure.po;

import java.util.Date;

/**
 * @param null
 * @author ran
 * @return 策略配置
 * @data 2023/10/4 15:29
 */
public class Strategy {

    // 自增ID
    private Long id ;

    // 策略ID
    private Long strategyId;

    // 策略描述
    private String strategyDesc;

    // 策略方式【1：单项概率，2：总体概率】
    private Integer strategyMode;

    // 发放奖品方式：[1，即时，2，定时(活动结束),3,人工发放]
    private Integer grantType ;

    // 发放奖品时间
    private Date grantTime;

    // 拓展信息
    private String extInfo;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public String getStrategyDesc() {
        return strategyDesc;
    }

    public void setStrategyDesc(String strategyDesc) {
        this.strategyDesc = strategyDesc;
    }

    public Integer getStrategyMode() {
        return strategyMode;
    }

    public void setStrategyMode(Integer strategyMode) {
        this.strategyMode = strategyMode;
    }

    public Integer getGrantType() {
        return grantType;
    }

    public void setGrantType(Integer grantType) {
        this.grantType = grantType;
    }

    public Date getGrantTime() {
        return grantTime;
    }

    public void setGrantTime(Date grantTime) {
        this.grantTime = grantTime;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
