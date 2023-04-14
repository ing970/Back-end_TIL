SELECT t1.stk_cd, t1.dt, t1.c_prc, t1.vol
FROM history_dt t1
WHERE t1.stk_cd = '005930' 
AND t1.dt >= STR_TO_DATE('20190201', '%Y%m%d')
AND t1.dt <= STR_TO_DATE('20190228', '%Y%m%d')
ORDER BY t1.dt DESC;

-- p.175
