package cn.sj.springboot.controller;

import cn.sj.springboot.vo.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private Logger logger = LoggerFactory.getLogger(MessageController.class);
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public Object add(@RequestBody Member member){
        this.logger.info("【***INFO***】日志输出");
        this.logger.error("【***ERROR***】");
        return true;
    }
    
}
