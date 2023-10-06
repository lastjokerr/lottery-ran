package cn.ran.lottery.domain.strategy.repository.impl;

import cn.ran.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.ran.lottery.domain.strategy.repository.IStrategyRepository;
import cn.ran.lottery.infrastructure.dao.IAwardDao;
import cn.ran.lottery.infrastructure.dao.IStrategyDao;
import cn.ran.lottery.infrastructure.dao.IStrategyDetailDao;
import cn.ran.lottery.infrastructure.po.Award;
import cn.ran.lottery.infrastructure.po.Strategy;
import cn.ran.lottery.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @param null
 * @author ran
 * @return null
 * @data 2023/10/6 8:03
 */
@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;



    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId,strategy,strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return null;
    }
}
