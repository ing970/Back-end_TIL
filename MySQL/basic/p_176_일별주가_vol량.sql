SELECT t1.stk_cd, t1.dt, t1.c_prc, t1.vol
FROM history_dt t1
WHERE t1.stk_cd = '005380'
AND t1.dt >= STR_TO_DATE('20191201', '%Y%m%d')
AND t1.dt < STR_TO_DATE('20200101', '%Y%m%d')
ORDER BY t1.vol DESC;

-- p.176