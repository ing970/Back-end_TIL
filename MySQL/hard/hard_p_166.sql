SELECT t3.*
FROM(SELECT t1.stk_cd
		, t1.stk_nm
        , t1.ex_cd EX_CD
        , t2.c_prc
        , t2.vol
        , ROUND(t2.c_prc * t2.vol / 1e8, 1) 거래금액
        , RANK() OVER(partition by t1.ex_cd ORDER BY ROUND(t2.c_prc * t2.vol / 1e8, 1) DESC) 거래소별거래금액순위 
FROM stock t1
	INNER JOIN history_dt t2
    ON t1.stk_cd = t2.stk_cd
WHERE t2.dt = STR_TO_DATE('20190404', '%Y%m%d')
) t3
WHERE t3.거래소별거래금액순위 <= 3
ORDER BY t3.EX_CD ASC, t3.거래소별거래금액순위 ASC;

-- p.166