-- 코드를 입력하세요
SELECT cast(DATE_FORMAT(DATETIME,'%H')as unsigned)as HOUR,
       count(*) as COUNT
FROM ANIMAL_OUTS
WHERE DATE_FORMAT(DATETIME,'%H:%i') BETWEEN '09:00' AND '19:59'
group by HOUR
order by HOUR;