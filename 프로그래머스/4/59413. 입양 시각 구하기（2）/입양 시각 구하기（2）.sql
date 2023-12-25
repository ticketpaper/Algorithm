WITH RECURSIVE number_sqeunce(HOUR) AS(
    SELECT 0
    UNION ALL
    SELECT HOUR + 1 FROM number_sqeunce WHERE HOUR<23
)select HOUR, 0 as COUNT from number_sqeunce
where HOUR not in (
    select HOUR(DATETIME) 
    from ANIMAL_OUTS
)
union
select HOUR(DATETIME) as HOUR, count(*) as COUNT
from ANIMAL_OUTS
group by HOUR
order by HOUR;