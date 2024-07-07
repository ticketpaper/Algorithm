-- 코드를 입력하세요
SELECT 상반기.FLAVOR
FROM FIRST_HALF as 상반기
JOIN JULY as 7월
ON 상반기.FLAVOR = 7월.FLAVOR
GROUP BY 7월.FLAVOR
ORDER BY (상반기.TOTAL_ORDER + SUM(7월.TOTAL_ORDER)) DESC
LIMIT 3