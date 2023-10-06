package cn.ran.lottery;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @param null
 * @author ran
 * @return null
 * @data 2023/9/19 1:44
 */
@SpringBootApplication
@Configurable
@EnableDubbo
public class LotteryRanApplication {
    public static void main(String[] args) {
        SpringApplication.run(LotteryRanApplication.class,args);
    }
}
