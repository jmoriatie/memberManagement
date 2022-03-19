package com.study.commento_.member.dateInterface;

import java.time.LocalDateTime;


public class DateSetImpl implements DateSet{

    @Override
    public LocalDateTime setCreatedAt() {
        return LocalDateTime.now();
    }
}
