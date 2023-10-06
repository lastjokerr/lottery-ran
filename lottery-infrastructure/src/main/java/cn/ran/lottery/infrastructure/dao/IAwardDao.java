package cn.ran.lottery.infrastructure.dao;

import cn.ran.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAwardDao {
    Award queryAwardInfo(String awardId);
}
