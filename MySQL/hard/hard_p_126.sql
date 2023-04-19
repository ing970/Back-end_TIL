SELECT t1.stk_cd, t1.stk_nm, t1.sec_nm
, (SELECT SUM(t2.vol) FROM history_dt t2 WHERE t2.stk_cd = t1.stk_cd
  AND t2.dt >= STR_TO_DATE ('20190401', '%Y%m%d')AND t2.dt < STR_TO_DATE('20190501', '%Y%m%d')) VOL_SUM
FROM stock t1
WHERE t1.stk_nm in ('NAVER', '카카오');

-- p.126