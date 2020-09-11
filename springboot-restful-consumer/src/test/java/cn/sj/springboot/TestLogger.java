package cn.sj.springboot;

import cn.sj.springboot.vo.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class TestLogger {
    @Resource
    private RestTemplate restTemplate;

    @Test
    public void testLevel(){
        //LogInfo logInfo = new LogInfo();
        //logInfo.setLevel("INFO");
        //通过远程的Rest服务中的信息将其自动转换为Member对象实例
       this.restTemplate.getForObject("http://8080/loggers/cn.sj.springboot.controller",Boolean.class);
    }
    
    
}
