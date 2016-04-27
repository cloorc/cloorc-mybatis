package xyz.cloorc.mybatis.mapper

import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import xyz.cloorc.mybatis.model.Model

/**
 * Created by wittcnezh on 2016/04/26:15:42.
 * Title: Simple
 * Description: Example
 * Copyright: Copyright(c) 2016
 *
 * @author &lt;a href="mailto:wittcnezh@foxmail.com"/&gt;
 */
@org.apache.ibatis.annotations.Mapper
public interface Mapper {
    @Select(value = "select * from model_t where id = #{id}")
    Model get (@Param("id") Object id);
}
