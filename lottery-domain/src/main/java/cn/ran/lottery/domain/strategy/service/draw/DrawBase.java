package cn.ran.lottery.domain.strategy.service.draw;

import cn.ran.lottery.domain.strategy.model.vo.AwardRateInfo;
import cn.ran.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import cn.ran.lottery.infrastructure.po.StrategyDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * @param 排除信息
 * @author ran
 * @return null
 * @data 2023/10/6 12:49
 */
public class DrawBase extends DrawConfig {

    public void checkAndInitRateData(Long strategyId, Integer strategyMode, List<StrategyDetail> strategyDetailList) {
        if (1 != strategyMode) return;
        IDrawAlgorithm drawAlgorithm = drawAlgorithmMap.get(strategyMode);

        boolean existRateTuple = drawAlgorithm.isExistRateTuple(strategyId);
        if (existRateTuple) return;

        List<AwardRateInfo> awardRateInfoList = new ArrayList<>(strategyDetailList.size());
        for (StrategyDetail strategyDetail : strategyDetailList) {
            awardRateInfoList.add(new AwardRateInfo(strategyDetail.getAwardId(), strategyDetail.getAwardRate()));
        }

        drawAlgorithm.initRateTuple(strategyId, awardRateInfoList);

    }

}
