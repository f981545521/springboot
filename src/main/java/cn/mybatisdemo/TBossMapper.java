package cn.mybatisdemo;

import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author youfang
 * @date 2017-12-06 14:19
 **/
@CacheNamespaceRef(TBossMapper.class)
public interface TBossMapper {

    TBoss selectTBoss(Integer id);

    TBoss selectTBossByResultMap(Integer id);

    @Select("SELECT * FROM t_boss WHERE id = #{id}")
    TBoss selectTBoss2(Integer id);

    void updateTBoss(@Param("id") Integer id, @Param("name") String name);

    void updateTBossOld(Integer id, String name);

    void updateTBossByPo(TBoss tBoss);

    void addTBoss(TBoss tBoss);

    List<String> getNames();

    List<TBoss> getTBossListWithResultType();

    List<TBoss> getTBossListWithResultMap();
}
