package cn.ran.lottery.domain.strategy.service.draw;

import cn.ran.lottery.domain.strategy.model.req.DrawReq;
import cn.ran.lottery.domain.strategy.model.res.DrawResult;

public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);

}
