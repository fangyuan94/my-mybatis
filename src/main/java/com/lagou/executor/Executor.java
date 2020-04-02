package com.lagou.executor;

import com.lagou.pojo.Configuration;
import com.lagou.pojo.MappedStatement;

/**
 * @ClassName: Executor
 * @Description:
 * @author: fangyuan
 * @date: 2020年03月28日
 */
public interface Executor {

    <T> T query(Configuration configuration, MappedStatement mappedStatement, Object... params);
}
