SELECT t1.sec_nm, count(*) 종목수
FROM stock t1
WHERE t1.stk_nm LIKE '삼성%'
AND sec_nm is not null
GROUP BY t1.sec_nm
ORDER BY count(*) desc, sec_nm desc;


-- p.32