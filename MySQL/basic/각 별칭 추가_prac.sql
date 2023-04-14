SELECT t1.stk_cd, t1.stk_nm 종목명, t1.ex_cd, t1.sec_nm 섹터명
FROM stock t1
WHERE t1.stk_nm LIKE '%동양%'
AND t1.sec_nm NOT LIKE '%금속%'
ORDER BY t1.ex_cd DESC, t1.stk_nm ASC;

-- p.162
 
 
 
 
 
 
 
 
 
 t1.stk_cd 종목코드, t1.stk_nm 종목
FROM stock t1 # or FROM stock as t1
WHERE t1.stk_nm = '삼성전자'
ORDER BY t1.stk_cd ASC;
