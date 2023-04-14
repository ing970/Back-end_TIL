SELECT date_format(t1.dt, '%Y%m') YM
		,sum(t1.vol) VOL
        ,sum(t1.vol * t1.c_prc) VOL_AMT 
FROM history_dt t1
WHERE t1.stk_cd LIKE '005380'
AND t1.dt >= STR_TO_DATE('20190101','%Y%m%d')and t1.dt < STR_TO_DATE('20200101', '%Y%m%d')
GROUP BY YM
ORDER BY VOL_AMT desc;