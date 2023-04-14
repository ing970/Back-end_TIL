SELECT t1.stk_cd, t1.dt, t1.c_prc, t1.vol, (t1.vol * t1.c_prc) 거래금액
FROM history_dt t1
WHERE t1.dt = STR_TO_DATE('20191226', '%Y%m%d')
ORDER BY 거래금액 DESC;

-- p.177