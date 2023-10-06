package cn.ran.lottery.rpc.req;

import java.io.Serializable;

/**
 * @param null
 * @author ran
 * @return null
 * @data 2023/9/19 1:32
 */
public class ActivityReq implements Serializable {

    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
