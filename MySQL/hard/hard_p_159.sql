SELECT t3.*
FROM (SELECT t1.stk_cd
		, t1.stk_nm
        , t2.dt DT
        , t2.c_prc C_PRC
        , t2.chg_rt
        , RANK() OVER(ORDER BY t2.chg_rt DESC) CHG_RT_RANK
FROM stock t1
	INNER JOIN history_dt t2
    ON t1.stk_cd = t2.stk_cd
WHERE t2.dt = STR_TO_DATE('20190410', '%Y%m%d')
AND t2.c_prc >= 10000
AND t1.ex_cd = 'KP') t3
ORDER BY t3.CHG_RT_RANK ASC
LIMIT 5;

-- p.159