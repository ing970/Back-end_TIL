WITH res1 as 
(SELECT t1.stk_cd
		, t1.stk_nm
        , t1.sec_nm
        , t2.dt
        , t2.c_prc C_PRC
        , t2.chg_rt CHG_RT
FROM stock t1
	INNER JOIN history_dt t2
    ON t1.stk_cd = t2.stk_cd
WHERE t1.sec_nm = '전기전자'
AND t2.dt = STR_TO_DATE('20190304', '%Y%m%d')),
res2 as 
(SELECT t3.*
FROM res1 t3
WHERE t3.C_PRC >= 10000)
SELECT t4.*
FROM res2 t4
ORDER BY CHG_RT DESC
limit 3;

-- p.152