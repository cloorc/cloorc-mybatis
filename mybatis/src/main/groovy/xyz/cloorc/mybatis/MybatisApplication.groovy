package xyz.cloorc.mybatis

import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import xyz.cloorc.mybatis.model.Model
import xyz.cloorc.mybatis.service.Service

/**
 * Created by wittcnezh on 2016/04/26:16:48.
 * Title: Simple
 * Description: Example
 * Copyright: Copyright(c) 2016
 *
 * @author &lt;a href="mailto:wittcnezh@foxmail.com"/&gt;
 */
@SpringBootApplication
class MybatisApplication {
    final Logger log = LoggerFactory.getLogger(MybatisApplication.class)
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args)
    }

    @Autowired
    @Bean
    public ApplicationRunner getRunner (Service service) {
        return new ApplicationRunner() {
            @Override
            void run(ApplicationArguments args) throws Exception {
                final Model model = service.get(1l)
                log.info("{}", model)
            }
        }
    }
}
