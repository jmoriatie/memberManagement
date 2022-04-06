package com.study.commento_.config;

import com.study.commento_.member.memberDao.StatisticMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.study.commento_.member.memberDao")
public class MybatisConfig {

        @Bean
        public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
            SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();

            sqlSessionFactory.setDataSource(dataSource);
            sqlSessionFactory.setTypeAliasesPackage("com.study.commento_.member.memberDto"); // 없음

            return sqlSessionFactory.getObject();
        }

        @Bean
        public SqlSessionTemplate sqlSession (SqlSessionFactory sqlSessionFactory) {
            return new SqlSessionTemplate(sqlSessionFactory);
        }

    }

