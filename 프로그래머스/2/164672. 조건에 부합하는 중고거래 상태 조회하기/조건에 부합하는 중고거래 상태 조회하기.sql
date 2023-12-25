-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, 
CASE STATUS
    when 'SALE' then '판매중'
    when 'RESERVED' then '예약중'
    else '거래완료'
END as STATUS
from USED_GOODS_BOARD
where CREATED_DATE = '2022-10-05'
order by BOARD_ID DESC;