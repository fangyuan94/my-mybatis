package com.lagou.sqlSession;

/**
 * @ClassName: SqlSessionFactory
 * @Description:
 * @author: fangyuan
 * @date: 2020年03月28日
 */
public interface SqlSessionFactory {

    SqlSession openSession();
}
