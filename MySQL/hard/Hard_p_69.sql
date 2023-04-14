SELECT DATE_FORMAT(t2.dt, '%Y%m') YM, t1.stk_cd, t1.stk_nm, ROUND(sum(t2.vol * t2.c_prc) / 1e8, 1) 거래금액
FROM stock t1
	INNER JOIN history_dt t2
    ON t1.stk_cd = t2.stk_cd
WHERE t1.stk_nm in ('삼성전자', 'SK하이닉스')
AND t2.dt >= STR_TO_DATE('20190101', '%Y%m%d')
AND t2.dt < STR_TO_DATE('20200101', '%Y%m%d')
GROUP BY YM, t1.stk_cd, t1.stk_nm
ORDER BY YM ASC, t1.stk_cd ASC;