package cn.sj.springboot.controller;



import cn.sj.springboot.vo.Member;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MemberController {
    
    @RequestMapping(value = "/member/add")
    public Object add(Member member){
        System.err.println("【***MemberController.add()接收对象***】"+member);
        return true;
    }
    
    @RequestMapping(value = "/member/get")
    public Member get(long mid){
        Member vo = new Member();
        vo.setMid(mid);
        vo.setName("sjjava -"+mid);
        vo.setBirthday(new Date());
        vo.setSalary(99999.99);
        vo.setAge(16);
        return vo;
    }
}
