WITH res1 as (SELECT t1.stk_cd
		, t1.stk_nm
        , t2.dt FROM_DT
        , t2.c_prc FROM_PRC
        , t3.dt TO_DT
        , t3.c_prc TO_PRC
        , ROUND((t3.c_prc - t2.c_prc) / t2.c_prc * 100, 2) CHG_RT 
FROM stock t1
	INNER JOIN history_dt t2
    on t1.stk_cd = t2.stk_cd
    INNER JOIN history_dt t3
    ON t2.stk_cd = t3.stk_cd
WHERE t2.dt = STR_TO_DATE('20190102', '%Y%m%d')
AND t3.dt = STR_TO_DATE('20190408', '%Y%m%d')
) 
SELECT t4.*
FROM res1 t4
ORDER BY CHG_RT ASC
limit 3

-- p.151