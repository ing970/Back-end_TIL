SELECT t1.stk_cd, sum(t1.vol), sum(t1.vol * t1.c_prc) VOL_AMT
FROM history_dt t1
WHERE t1.stk_cd in ('005930', '005380')
AND t1.dt >= STR_TO_DATE('20190301', '%Y%m%d')
AND t1.dt < STR_TO_DATE('20190401', '%Y%m%d')
GROUP BY t1.stk_cd
ORDER BY VOL_AMT DESC;