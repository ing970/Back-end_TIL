SELECT t1.stk_cd, t1.stk_nm, t2.dt, t2.c_prc
FROM stock t1
	INNER JOIN history_dt t2
    ON t1.stk_cd = t2.stk_cd
WHERE t1.stk_nm = '삼성전자'
AND t2.dt = (SELECT max(a.dt)
			FROM history_dt a
            WHERE a.dt < STR_TO_DATE('20200101', '%Y%m%d'));
            
-- p.127