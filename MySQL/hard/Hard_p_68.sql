SELECT t1.stk_cd, t1.stk_nm, ROUND(sum(t2.vol), 1) 거래량합, ROUND(sum(t2.vol * t2.c_prc) / 1e8, 1) 거래금액
FROM stock t1
	INNER JOIN history_dt t2
    on t1.stk_cd = t2.stk_cd
WHERE t1.stk_nm in ('삼성바이오로직스', '셀트리온')
AND t2.dt >= STR_TO_DATE('20190301', '%Y%m%d')
AND t2.dt < STR_TO_DATE('20190401', '%Y%m%d')
GROUP BY t1.stk_cd, t1.stk_nm;