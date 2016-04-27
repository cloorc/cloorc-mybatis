package xyz.cloorc.mybatis.model

import lombok.Data

/**
 * Created by wittcnezh on 2016/04/26:14:52.
 * Title: Simple
 * Description: Example
 * Copyright: Copyright(c) 2016
 *
 * @author &lt;a href="mailto:wittcnezh@foxmail.com"/&gt;
 */
@Data
public class Model implements Serializable {
    private Long id
    private String name
    private Integer age
}
