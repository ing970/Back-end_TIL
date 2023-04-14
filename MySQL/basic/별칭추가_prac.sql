SELECT t1.stk_nm 종목명, t1.stk_cd 종목코드, t1.ex_cd 거래소코드, t1.sec_nm 섹터명
FROM stock t1
WHERE t1.stk_nm in ('NAVER', '넷마블', '넥슨지티', '카카오')
ORDER BY 거래소코드 ASC, 종목코드 ASC;

-- p.163