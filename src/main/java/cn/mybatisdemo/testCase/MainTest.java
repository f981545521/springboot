package cn.mybatisdemo.testCase;

import cn.mybatisdemo.TBoss;
import cn.mybatisdemo.TBossMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;


import java.io.InputStream;
import java.util.List;

/**
 * @author youfang
 * @date 2017-12-06 14:22
 **/
public class MainTest {

    @Test
    public void test1() throws Exception {
        String resource = "mybatisdemo/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        TBoss tBoss = session.selectOne("cn.mybatisdemo.TBossMapper.selectTBoss",5);
        System.out.println(tBoss);
        session.close();
    }

    @Test
    public void test2() throws Exception {
        String resource = "mybatisdemo/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        TBossMapper tBossMapper = session.getMapper(TBossMapper.class);
        TBoss tBoss = tBossMapper.selectTBossByResultMap(7);
        System.out.println(tBoss);
        session.close();
    }

    @Test
    public void test3() throws Exception {
        String resource = "mybatisdemo/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        TBossMapper tBossMapper = session.getMapper(TBossMapper.class);
        tBossMapper.updateTBossOld(8,"dasd");
        session.commit();
        session.close();
    }

    @Test
    public void test4() throws Exception {
        String resource = "mybatisdemo/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        TBossMapper tBossMapper = session.getMapper(TBossMapper.class);
        TBoss tboss = new TBoss();
        tboss.setId(7);
        tboss.setName("dsf");
        tBossMapper.updateTBossByPo(tboss);
        System.out.println(tboss);
        session.commit();
        session.close();
    }

    @Test
    public void test5() throws Exception {
        String resource = "mybatisdemo/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        TBossMapper tBossMapper = session.getMapper(TBossMapper.class);
        TBoss tboss = new TBoss();
        tboss.setName("小飞");
        tboss.setAge(34);
        System.out.println(tboss);
        tBossMapper.addTBoss(tboss);
        System.out.println(tboss);
        session.commit();
        session.close();
    }

    @Test
    public void test6() throws Exception {
        String resource = "mybatisdemo/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        TBossMapper tBossMapper = session.getMapper(TBossMapper.class);
        List<String> list = tBossMapper.getNames();
        System.out.println(list);
        session.commit();
        session.close();
    }

    @Test
    public void test7() throws Exception {
        String resource = "mybatisdemo/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        TBossMapper tBossMapper = session.getMapper(TBossMapper.class);
        List<TBoss> list = tBossMapper.getTBossListWithResultMap();
        System.out.println(list);
        session.commit();
        session.close();
    }

    /**
     * 测试MyBatis缓存
     * @throws Exception
     */
    @Test
    public void test8() throws Exception {
        String resource = "mybatisdemo/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        TBossMapper tBossMapper = session.getMapper(TBossMapper.class);
        TBoss tBoss = tBossMapper.selectTBoss(1);
        System.out.println(tBoss);
        tBoss.setName("王二小");
        tBoss.setAge(666);
        tBossMapper.addTBoss(tBoss);
        session.commit();
        session.close();
    }
}
