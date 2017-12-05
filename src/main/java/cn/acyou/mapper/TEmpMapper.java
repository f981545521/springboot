package cn.acyou.mapper;

import cn.acyou.pojo.TEmp;
import cn.acyou.pojo.TEmpExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TEmpMapper {
    int countByExample(TEmpExample example);

    int deleteByExample(TEmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TEmp record);

    int insertSelective(TEmp record);

    List<TEmp> selectByExample(TEmpExample example);

    TEmp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TEmp record, @Param("example") TEmpExample example);

    int updateByExample(@Param("record") TEmp record, @Param("example") TEmpExample example);

    int updateByPrimaryKeySelective(TEmp record);

    int updateByPrimaryKey(TEmp record);
}