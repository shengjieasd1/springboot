package cn.sj.springboot;

import cn.sj.springboot.vo.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class TestMemberRestful {
    @Resource
    private RestTemplate restTemplate;
    
    @Test
    public void testAdd(){
        Boolean flag = this.restTemplate.getForObject("http://localhost:8080/member/add?mid=110&name=SMITH&age=10", Boolean.class);
        System.out.println("【ConsumerTest.add()】"+flag);
    }
    
    @Test
    public void testGet(){
        //通过远程的Rest服务中的信息将其自动转换为Member对象实例
        Member member = this.restTemplate.getForObject("http://localhost:8080//member/get?mid=110", Member.class);
        System.out.println("【ConsumerTest.get()】"+member);
    }
    
    
}
