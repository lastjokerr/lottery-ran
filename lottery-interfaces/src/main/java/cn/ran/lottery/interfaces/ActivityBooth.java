package cn.ran.lottery.interfaces;


import cn.ran.lottery.common.Constants;
import cn.ran.lottery.common.Result;
import cn.ran.lottery.infrastructure.dao.IActivityDao;
import cn.ran.lottery.infrastructure.po.Activity;
import cn.ran.lottery.rpc.IActivityBooth;
import cn.ran.lottery.rpc.dto.ActivityDto;
import cn.ran.lottery.rpc.req.ActivityReq;
import cn.ran.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  活动展台
 * </p>
 *
 * @param null
 * @return null
 * @author: tangyuan
 * @since: 2023/9/19 1:50
 */
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;


    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);

    }
}
