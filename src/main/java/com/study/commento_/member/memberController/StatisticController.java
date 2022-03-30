package com.study.commento_.member.memberController;

import com.study.commento_.member.memberService.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatisticController {

    @Autowired
    private StatisticService service;

    @GetMapping("/sqlyearStatistic/year={year}")
    public Map<String, Object> sqlTest(@PathVariable String year) throws Exception{
        return service.yearloginNum(year);
    }

}
