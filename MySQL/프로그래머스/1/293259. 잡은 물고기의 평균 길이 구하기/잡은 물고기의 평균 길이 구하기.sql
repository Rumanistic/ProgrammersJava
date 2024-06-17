-- 코드를 작성해주세요
SELECT ROUND(SUM(CASE 
                WHEN LENGTH IS NULL THEN 10
                ELSE LENGTH
          END) / COUNT(*), 2) AVERAGE_LENGTH
FROM FISH_INFO