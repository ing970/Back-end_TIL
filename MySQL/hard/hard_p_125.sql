SELECT t1.stk_cd, t1.stk_nm
		, t1.ex_cd
        ,(SELECT a.bas_cd_nm FROM basecode a WHERE a.bas_cd = t1.ex_cd) EX_CD_NM
        , t2.c_prc C_PRC_0404
		,(SELECT b.c_prc FROM history_dt b WHERE b.stk_cd = t1.stk_cd 
        AND b.dt = STR_TO_DATE('20190403', '%Y%m%d')) c_prc_0403
FROM stock t1
	INNER JOIN history_dt t2
    ON t1.stk_cd = t2.stk_cd
WHERE t1.stk_nm in ('삼성전자', '현대차')
AND t2.dt = STR_TO_DATE('20190404', '%Y%m%d');

-- p.125