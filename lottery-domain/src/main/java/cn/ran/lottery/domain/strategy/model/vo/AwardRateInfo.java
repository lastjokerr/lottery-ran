package cn.ran.lottery.domain.strategy.model.vo;

import java.math.BigDecimal;

/**
 * @param null
 * @author ran
 * @return null
 * @data 2023/10/6 12:38
 */
public class AwardRateInfo {

    private String awardId;

    private BigDecimal awardRate;

    public AwardRateInfo() {
    }

    public AwardRateInfo(String awardId, BigDecimal awardRate) {
        this.awardId = awardId;
        this.awardRate = awardRate;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public BigDecimal getAwardRate() {
        return awardRate;
    }

    public void setAwardRate(BigDecimal awardRate) {
        this.awardRate = awardRate;
    }
}
