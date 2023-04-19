SELECT t1.stk_Cd
		, t1.stk_nm
        , t2.dt
        , t2.c_prc
        , ROUND(t2.c_prc * t2.vol / 1e8, 1) 거래금액
        , RANK() OVER(ORDER BY ROUND(t2.c_prc * t2.vol / 1e8, 1) DESC) 거래금액_순위 
FROM stock t1
		INNER JOIN history_dt t2
        ON t1.stk_cd = t2.stk_cd
WHERE t2.dt = STR_TO_DATE('20190410', '%Y%m%d')
ORDER BY 거래금액_순위 ASC
LIMIT 5;

-- p.160
