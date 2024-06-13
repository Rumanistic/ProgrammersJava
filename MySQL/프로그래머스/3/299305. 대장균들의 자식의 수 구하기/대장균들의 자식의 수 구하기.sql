-- 코드를 작성해주세요
SELECT ID,
    CASE
        WHEN ID IN (SELECT PARENT_ID
                    FROM ECOLI_DATA
                    WHERE PARENT_ID IS NOT NULL) THEN (SELECT COUNT(*) 
                                                        FROM ECOLI_DATA ED
                                                        WHERE ED.PARENT_ID = E.ID)
        ELSE 0
    END AS CHILD_COUNT
FROM ECOLI_DATA E
ORDER BY ID;