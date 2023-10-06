package cn.ran.lottery.rpc.res;

import cn.ran.lottery.common.Result;
import cn.ran.lottery.rpc.dto.ActivityDto;

import java.io.Serializable;

/**
 * @param null
 * @author ran
 * @return null
 * @data 2023/9/19 1:33
 */
public class ActivityRes implements Serializable {

    private Result result;
    private ActivityDto activity;

    public ActivityRes() {
    }

    public ActivityRes(Result result) {
        this.result = result;
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }

}
