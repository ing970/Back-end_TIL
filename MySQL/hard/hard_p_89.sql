SELECT t1.stk_cd, t1.stk_nm
		,t_buy.dt BUY_DT
        ,t_buy.c_prc BUY_PRC
        ,t_sell.dt SELL_DT
        ,t_sell.c_prc SELL_PRC
        ,((t_sell.c_prc - t_buy.c_prc) / t_buy.c_prc * 100) 수익FROM stock t1
	INNER JOIN history_dt t_buy
    ON t_buy.stk_cd = t1.stk_cd
    INNER JOIN history_dt t_sell
    ON t_sell.stk_cd = t_buy.stk_cd
WHERE t1.stk_nm in ('삼성전자', 'SK하이닉스', '현대차')
AND t_buy.dt = STR_TO_DATE('20190102', '%Y%m%d')
AND t_sell.dt = STR_TO_DATE('20191227', '%Y%m%d')
