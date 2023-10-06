package cn.ran.lottery.domain.strategy.service.draw;

import cn.ran.lottery.domain.strategy.model.req.DrawReq;
import cn.ran.lottery.domain.strategy.model.res.DrawResult;

/**
 * <p>
 * 执行 抽奖策略模板
 * </p>
 *
 * @param null
 * @return null
 * @author: tangyuan
 * @since: 2023/10/6 14:00
 */

public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);

}
