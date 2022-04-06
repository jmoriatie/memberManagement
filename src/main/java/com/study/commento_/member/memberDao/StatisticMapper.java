package com.study.commento_.member.memberDao;

import java.util.HashMap;

public interface StatisticMapper {
    HashMap<String, Object> selectYearLogin(String year);
}
