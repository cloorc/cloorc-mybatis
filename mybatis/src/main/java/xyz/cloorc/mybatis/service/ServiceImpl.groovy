package xyz.cloorc.mybatis.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import xyz.cloorc.mybatis.mapper.Mapper
import xyz.cloorc.mybatis.model.Model

/**
 * Created by wittcnezh on 2016/04/26:15:45.
 * Title: Simple
 * Description: Example
 * Copyright: Copyright(c) 2016
 *
 * @author &lt;a href="mailto:wittcnezh@foxmail.com"/&gt;
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    private Mapper dao;

    @Transactional
    public Model get(Object id) {
        return dao.get(id);
    }
}
