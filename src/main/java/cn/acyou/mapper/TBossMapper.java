package cn.acyou.mapper;

import cn.acyou.pojo.TBoss;
import cn.acyou.pojo.TBossExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TBossMapper {
    int countByExample(TBossExample example);

    int deleteByExample(TBossExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBoss record);

    int insertSelective(TBoss record);

    List<TBoss> selectByExample(TBossExample example);

    TBoss selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBoss record, @Param("example") TBossExample example);

    int updateByExample(@Param("record") TBoss record, @Param("example") TBossExample example);

    int updateByPrimaryKeySelective(TBoss record);

    int updateByPrimaryKey(TBoss record);

    List<TBoss> getAll();
}