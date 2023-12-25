-- 코드를 입력하세요
# SELECT O.ANIMAL_ID as ANIMAL_ID,
#        O.NAME as NAME
# from ANIMAL_OUTS O left join ANIMAL_INS I
# ON O.ANIMAL_ID = I.ANIMAL_ID
# where I.ANIMAL_ID is null;

-- inner 
select ANIMAL_ID, NAME
from ANIMAL_OUTS
where ANIMAL_ID not in(
    SELECT O.ANIMAL_ID 
    from ANIMAL_OUTS O inner join ANIMAL_INS I
    ON O.ANIMAL_ID = I.ANIMAL_ID
);