package cn.ran.lottery.infrastructure.dao;

import cn.ran.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyDetailDao{
    List<StrategyDetail> queryStrategyDetailList(Long strategyId);
}
