/*
INNER JOIN : 두 테이블이 외래키로 연결 되었을 때, 양쪽 다 데이터가 있는 경우
OUTER JOIN : 두 테이블이 외래키로 연결 되었을 때, 한쪽을 기준으로 연결할 때 사용

- 상품별 리뷰수를 조회하는 경우, 리뷰가 등록이 안된 상품들은 INNER JOIN을 이용하여 리뷰수를 알수가 없음

- OUTER JOIN 문법 : 기준 테이블이 매우 중요. 
- INNER JOIN은 A JOIN B, B JOIN A 가 같지만
  OUTER JOIN A OUTER JOIN B와 B OUTER JOIN A는 결과가 다름
- 종류 : LEFT, RIGHT
- LEFT JOIN : 기준 테이블을 기준으로 연결
- RIGHT JOIN : 참조 테이블을 기준으로 연결

A LEFT JOIN B == B RIGHT JOIN A 

SELECT * FROM 기준테이블 
	JOIN 참조테이블
    ON 기준테이벌.외래키 = 참조테이블.기본키;
[WHERE 절]
[GROUP BY 절]
[HAVING 절]
[ORDER BY 절]
[LIMIT 절]

*/
-- 제품별 리뷰 개수를 조회하는 쿼리(리뷰가 등록된 제품만 조회)
SELECT 
	OP_PR_CODE AS 제품코드,
    COUNT(RE_NUM) AS 리뷰수
FROM
    REVIEW
		RIGHT JOIN
    `OPTION` ON OP_NUM = RE_OP_NUM
GROUP BY OP_PR_CODE;

-- 제품별 옵션의 개수를 조회하는 쿼리(제품명, 옵션수)
SELECT 
	PR_NAME AS 제품명, 
	COUNT(*) AS 옵션수 
FROM PRODUCT 
		JOIN 
	`OPTION` ON PR_CODE = OP_PR_CODE 
GROUP BY OP_PR_CODE;