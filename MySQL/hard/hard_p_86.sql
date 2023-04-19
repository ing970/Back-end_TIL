SELECT t1.stk_cd, t1.stk_nm, t1.sec_nm, t2.chg_rt, t2.c_prc, t2.vol, ROUND(t2.vol * t2.c_prc, 1) VOL_AMT
FROM stock t1
	INNER JOIN history_dt t2
    ON t1.stk_cd = t2.stk_cd
WHERE t2.dt = STR_TO_DATE('20190304', '%Y%m%d')
HAVING t2.chg_rt >= 15
ORDER BY VOL_AMT DESC;

-- p.86