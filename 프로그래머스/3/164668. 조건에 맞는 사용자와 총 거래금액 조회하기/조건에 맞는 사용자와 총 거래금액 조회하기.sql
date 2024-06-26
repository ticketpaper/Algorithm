-- 코드를 입력하세요
SELECT USER_ID,
       NICKNAME, 
       SUM (a.PRICE) as TOTAL_SALES
FROM USED_GOODS_BOARD a JOIN USED_GOODS_USER b
on a.WRITER_ID = b.USER_ID
WHERE a.STATUS = 'DONE'
GROUP BY a.WRITER_ID
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES ASC;