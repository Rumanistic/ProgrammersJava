-- 코드를 입력하세요
-- SELECT * 
-- FROM REST_INFO
-- WHERE ADDRESS LIKE '서울%';

SELECT REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS, T.SCORE
FROM REST_INFO I
INNER JOIN (
    SELECT REST_ID AS RID, ROUND(SUM(REVIEW_SCORE) / COUNT(REVIEW_SCORE), 2) AS SCORE
    FROM REST_REVIEW
    WHERE REST_ID IN (
        SELECT REST_ID 
        FROM REST_INFO
        WHERE ADDRESS LIKE '서울%')
    GROUP BY REST_ID) T
ON T.RID = I.REST_ID
WHERE ADDRESS LIKE '서울%'
ORDER BY SCORE DESC, FAVORITES DESC;