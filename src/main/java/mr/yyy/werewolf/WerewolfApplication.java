package mr.yyy.werewolf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yanyuyu
 * @Description
 * @Date 创建于 2022/6/10 7:07 下午
 */
@Slf4j
@SpringBootApplication
public class WerewolfApplication {
    public static void main(String[] args) {
        SpringApplication.run(WerewolfApplication.class, args);
        log.info("------------WerewolfApplication start up successfully------------");
    }
}