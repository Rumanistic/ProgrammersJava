-- 코드를 입력하세요
# SELECT ai.ANIMAL_ID, ai.NAME 
# FROM ANIMAL_INS ai
# WHERE ai.ANIMAL_ID NOT IN (
#     SELECT ao.ANIMAL_ID
#     FROM ANIMAL_OUTS ao
#     LEFT JOIN ANIMAL_INS ai
#     on ai.ANIMAL_ID = ao.ANIMAL_ID)
# ORDER BY ai.ANIMAL_ID asc;

# select * from ANIMAL_INS;
# select * from ANIMAL_OUTS;

select ANIMAL_ID, NAME from ANIMAL_OUTS
where ANIMAL_ID not in (
    select ANIMAL_ID from ANIMAL_INS
) order by ANIMAL_ID asc