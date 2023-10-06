package cn.ran.lottery.rpc;

import cn.ran.lottery.rpc.req.ActivityReq;
import cn.ran.lottery.rpc.res.ActivityRes;

/**
 * <p>
 *  活动展台
 *  1，创建活动
 *  2，更新活动
 *  3，查询活动
 * </p>
 *
 * @param null
 * @return null
 * @author: ran
 * @since: 2023/9/19 1:35
 */

public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
