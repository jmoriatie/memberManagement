
### createDate 생김새
> 년도(2자리) 월(2자리) 일(2자리) 시(두자리) 분(두자리)
---            
#### 월별 조회
```
SELECT CONCAT('22','-','02') YYYYMM, COUNT(userID) cnt_month
FROM  statistc.requestInfo
WHERE LEFT(createDate, 4) = CONCAT('22','02');
```
---
#### 일별 조회  
```                                                      
SELECT CONCAT('22','-', '02', '-', '01') YYYYMM, COUNT(userID) cnt_day
FROM statistc.requestInfo 
WHERE LEFT(createDate, 6) = CONCAT('22','02','01');
```
---
#### 전체 요일 조회
```
SELECT LEFT(createDate, 6) login_Day, 
case WEEKDAY(LEFT(createDate, 6)) 
WHEN '0' then '월요일'
WHEN '1' then '화요일'
WHEN '2' then '수요일'
WHEN '3' then '목요일'
WHEN '4' then '금요일'
WHEN '5' then '토요일'
WHEN '6' then '일요일'
end week_of_day
FROM statistc.requestInfo;
```
---
#### 휴일을 제외한 로그인 수
```
SELECT COUNT(userID) cnt_Expt_Weeknd
FROM statistc.requestInfo
WHERE WEEKDAY( LEFT(createDate, 6)  ) NOT IN ('5', '6');
```
---
#### 부서별 월별 로그인 수
```
SELECT CONCAT('22','-', '02') YYYYMM, requestCode, COUNT(userID) cnt_mon_dept
FROM statistc.requestInfo
WHERE LEFT(createDate, 4)= CONCAT('22','02')
GROUP BY requestCode;
```