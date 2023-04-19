WITH res3 as (WITH res1 as 
(SELECT t1.stk_cd
		, t1.stk_nm
        , t1.sec_nm
        , t2.dt
        , t2.c_prc C_PRC
        , t2.chg_rt CHG_RT
        , t3.dt SELL_DT
        , t3.c_prc SELL_PRC
        , ROUND((t3.c_prc - t2.c_prc) / t2.c_prc * 100, 2) 수익률 
FROM stock t1
	INNER JOIN history_dt t2
    ON t1.stk_cd = t2.stk_cd
    INNER JOIN history_dt t3
    ON t2.stk_cd = t3.stk_cd
WHERE t1.sec_nm = '전기전자'
AND t2.dt = STR_TO_DATE('20190304', '%Y%m%d')
AND t3.dt = STR_TO_DATE('20190408', '%Y%m%d'))

, res2 as 
(SELECT t4.*
FROM res1 t4
WHERE t4.C_PRC >= 10000)

SELECT t5.*
FROM res2 t5
ORDER BY CHG_RT DESC
limit 3)
SELECT t6.*
FROM res3 t6
ORDER BY 수익률 DESC;

-- p.153