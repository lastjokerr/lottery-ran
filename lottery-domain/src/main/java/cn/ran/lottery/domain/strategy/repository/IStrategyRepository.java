package cn.ran.lottery.domain.strategy.repository;

import cn.ran.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.ran.lottery.infrastructure.po.Award;

public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

}
