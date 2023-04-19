SELECT t4.*
FROM (SELECT t1.stk_cd
		, t1.stk_nm
        , t1.ex_cd EX_CD
        , t2.dt FROM_DT
        , t2.c_prc FROM_PRC
        , t3.dt TO_DT
        , t3.c_prc TO_PRC
        , ROUND((t3.c_prc - t2.c_prc) / t2.c_prc * 100, 2) CHG_RT
        , RANK() OVER(partition by t1.ex_cd ORDER BY (t3.c_prc - t2.c_prc) / t2.c_prc * 100 ASC) 거래소별하락순위
FROM stock t1
	INNER JOIN history_dt t2
    ON t1.stk_cd = t2.stk_cd
    INNER JOIN history_dt t3
    ON t2.stk_cd = t3.stk_cd
WHERE t2.dt = STR_TO_DATE('20190102', '%Y%m%d')
AND t3.dt = STR_TO_DATE('20191227', '%Y%m%d')) t4
WHERE t4.거래소별하락순위 <= 2
ORDER BY t4.EX_CD ASC, t4.거래소별하락순위 ASC;

-- p.167