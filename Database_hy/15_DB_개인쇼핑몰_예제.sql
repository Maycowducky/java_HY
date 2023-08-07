USE SHOPPINGMALL;

-- 회원아이디가 abc123, 비번이 1234, 번호가 011-1234-5678, 이름이 홍길동
-- 주소가 서울시 강남구 KH빌딩, 주소 상세가 6층 361반, 우편번호가 01234인 
-- 회원이 가입을 했을 때 쿼리 작성
-- 권한은 ADMIN, USER 중 하나

INSERT INTO MEMBER(ME_ID, ME_PW, ME_PHONE, ME_ADDR, ME_ADDR_DETAIL, ME_POST, ME_AUTHORITY, ME_NAME)
	VALUES('abc123','1234','011-1234-5678','서울시 강남구 KH빌딩', '6층 361반', '01234', 'USER', '홍길동');
INSERT INTO MEMBER(ME_ID, ME_PW, ME_PHONE, ME_ADDR, ME_ADDR_DETAIL, ME_POST, ME_AUTHORITY, ME_NAME)
	VALUES('ADMIN','ADMIN','011-1111-1111','서울시 강북구 KH빌딩', '3층 101호', '01231', 'ADMIN', '임꺽정');
INSERT INTO MEMBER(ME_ID, ME_PW, ME_PHONE, ME_ADDR, ME_ADDR_DETAIL, ME_POST, ME_AUTHORITY, ME_NAME)
	VALUES('qwe123','qwe1234','011-5678-5678','서울시 강남구 KH빌딩', '1층 161반', '01234', 'USER', '고길동');

-- 제품코드가 ABC001, 제품명이 KH무선마우스, 제품설명 KH무선마우스입니다., 가격이 KRW15000원
-- 종류가 무선 / 유선인 제품을 쿼리를 작성
INSERT INTO PRODUCT VALUES('ABC001', 'KH무선마우스','KH무선마우스입니다.',150000);
INSERT INTO `OPTION`(OP_NAME, OP_PR_CODE) VALUES ('무선', 'ABC001'),('유선','ABC001');

-- 제품코드가 ABC001인 제품의 제품정보와 옵션을 조회하는 쿼리
SELECT 
    *
FROM
    PRODUCT
        JOIN
    `OPTION` ON PR_CODE = OP_PR_CODE
WHERE
    PR_CODE = 'ABC001';
    
-- 제품 코드가 ABC001인 제품 중에서 유선 제품이 10개 들어오고, 무선 제품이 5개 들어 왔을 때 사용해야하는 쿼리
UPDATE `OPTION` 
SET 
    OP_AMOUNT = 10
WHERE
    OP_PR_CODE = 'ABC001' AND OP_NAME = '유선';
UPDATE `OPTION` 
SET 
    OP_AMOUNT = 5
WHERE
    OP_PR_CODE = 'ABC001' AND OP_NAME = '무선';
    
-- abc123 회원이 배송지를 다음과 같이 등록(배송지명 : 집, 주소: 서울시 강남구 123번지,
-- 상세 : KH아파트 101동 101호, 우편번호 : 12345) 하는 쿼리
INSERT INTO ADDRESS(AD_NAME, AD_ADDR, AD_ADDR_DETAIL, AD_POST, AD_ME_ID)
VALUES ('집','서울시 강남구 123번지', 'KH아파트 101동 101호', '12345', 'ABC123');

-- abc회원이 ABC001 제품 중 유선을 3개 장바구니에 담았을 때 쿼리
INSERT INTO SHOPPING_CART(SC_AMOUNT, SC_ME_ID, SC_OP_NUM)
-- VALUES(3, 'ABC123', 2);
SELECT 
	3, 'ABC123', OP_NUM 
FROM `OPTION` 
WHERE 
	OP_PR_CODE = 'ABC001' AND OP_NAME = '유선';
    
-- abc123회원이 ABC001 제품 중 유선을 1개 장바구니에 담았을 때 쿼리
UPDATE `SHOPPING_CART` 
SET 
    SC_AMOUNT = 1
    -- WHERE BA_NUM = 1;
WHERE
    SC_ME_ID = 'ABC123'
        AND SC_OP_NUM = (SELECT 
            OP_NUM
        FROM
            `OPTION`
        WHERE
            OP_PR_CODE = 'ABC001' AND OP_NAME = '유선');
-- abc123 회원이 ABC001 제품 중 무선을 2개 구매하고 배송지로 집을 선택했을 때
-- 실행해야 하는 모든 쿼리를 작성하세요.
/*  1. 주문 내역을 추가 => 주문 리스트에서 주문내역번호가 필요하기 때문에
	2. 주문 리스트에 구매 목록을 추가
    3. 제품 수량 수정
    4. 마일리지 (포인트) 적립
    4-1. 마일리지 내역 추가
    4-2. 회원 정보에 포인트 수정
*/
-- 1.
INSERT INTO `ORDER`(OR_TOTAL, OR_PRICE, OR_USE_POINT, OR_SAVE_POINT, OR_ME_ID, OR_AD_NUM)
VALUES(150000*2, 150000*2, 0, 3000, 'ABC123', 1);
SELECT * FROM PRODUCT;
-- 2.
INSERT INTO ORDER_LIST(OL_AMOUNT, OL_PRICE, OL_OR_NUM, OL_OP_NUM)
VALUES(2, 150000*2, 1, 1);
-- 3.
UPDATE `OPTION` SET OP_AMOUNT = OP_AMOUNT - 2 WHERE OP_NUM = 1;

INSERT INTO POINT(PO_CONTENT, PO_AMOUNT, PO_ME_ID)
VALUES('제품 구매에 의한 적립', 3000, 'ABC123');

UPDATE MEMBER SET ME_POINT = ME_POINT + 3000 WHERE ME_ID = 'ABC123';
-- 주문 리스트에 구매 목록을 작성

-- 제품 코드가 ABC002, 제품명 KH키보드, 제품상세가 혁신적인 KH키보드, 제품 가격이 30000원
-- 제품 종류가 '기계식', '일반'인 제품을 등록하는 쿼리 

INSERT INTO PRODUCT VALUES('ABC002', 'KH키보드', '혁신적인 KH키보드', 30000);
INSERT INTO `OPTION` (OP_NAME, OP_PR_CODE) VALUES ('기계식','ABC002'),('일반','ABC002');

-- 제품코드가 ABC002, 종류가 기계식인 제품이 100개,
-- 제품 코드가 ABC002, 종류가 일반인 제품이 50개 입고 됐을 때 쿼리

UPDATE `OPTION` 
SET 
    OP_AMOUNT = OP_AMOUNT + 100
WHERE
    OP_PR_CODE = 'ABC002'
        AND OP_NAME = '기계식';
UPDATE `OPTION` 
SET 
    OP_AMOUNT = OP_AMOUNT + 50
WHERE
    OP_PR_CODE = 'ABC002' AND OP_NAME = '일반';
    
-- QWE123회원이 ABC001 제품 중 무선을 2개 장바구니에 담고,
-- 이어서 ABC002 제품 중 기계식을 3개 장바구니에 담았을 때 쿼리
INSERT INTO SHOPPING_CART(SC_AMOUNT, SC_ME_ID, SC_OP_NUM)
SELECT 
	2, 'QWE123', OP_NUM 
FROM `OPTION` 
WHERE 
	OP_PR_CODE = 'ABC001' AND OP_NAME = '무선';
    SELECT 
	3, 'QWE123', OP_NUM 
FROM `OPTION` 
WHERE 
	OP_PR_CODE = 'ABC002' AND OP_NAME = '기계식';
-- QWE123 회원이 장바구니에 담긴 모든 제품을 구매했을 때 쿼리 (구매시 포인트 사용은 X)
-- 배송지를 집으로, 경기도 안산시 안산구 123번지, 상세는 없음, 우편번호는 12312를 등록 후 구매
INSERT INTO ADDRESS(AD_NAME, AD_ADDR, AD_ADDR_DETAIL, AD_POST, AD_ME_ID)
VALUES ('집','경기도 안산시 안산구 123번지', '', '12312', 'QWE123');

INSERT INTO `ORDER`(OR_TOTAL, OR_PRICE, OR_USE_POINT, OR_SAVE_POINT, OR_ME_ID, OR_AD_NUM)
SELECT 150000 * 2 + 30000 * 3, 150000 * 2 + 30000 * 3, 0, (150000 * 2 + 30000 * 3)/10, 'QWE123', AD_NUM 
FROM ADDRESS
WHERE AD_ME_ID = 'QWE123' AND AD_NAME = '집';

INSERT INTO ORDER_LIST(OL_AMOUNT, OL_PRICE, OL_OR_NUM, OL_OP_NUM)
SELECT 2, PR_PRICE*2, 2, OP_NUM
FROM `OPTION`
JOIN PRODUCT
ON OP_PR_CODE = PR_CODE
WHERE
	OP_PR_CODE = 'ABC001' AND OP_NAME = '무선';
INSERT INTO ORDER_LIST(OL_AMOUNT, OL_PRICE, OL_OR_NUM, OL_OP_NUM)
SELECT 3, PR_PRICE*3, 2, OP_NUM
FROM `OPTION`
JOIN PRODUCT
ON OP_PR_CODE = PR_CODE
WHERE
	OP_PR_CODE = 'ABC002' AND OP_NAME = '기계식';

UPDATE `OPTION` 
SET 
    OP_AMOUNT = OP_AMOUNT - 2
WHERE
    OP_PR_CODE = 'ABC001' AND OP_NAME = '무선';
UPDATE `OPTION` 
SET 
    OP_AMOUNT = OP_AMOUNT - 3
WHERE
    OP_PR_CODE = 'ABC002' AND OP_NAME = '기계식';

-- ABC123 회원이 제품을 받고 구매 확정을 눌렀을 때 쿼리
-- 주문에 구매 확정으로 수정
UPDATE `ORDER` SET OR_STATE = '구매 확정' WHERE OR_NUM = 1;
-- 포인트 내역에 적립 내용을 추가
INSERT INTO POINT(PO_CONTENT, PO_AMOUNT, PO_ME_ID)
VALUES('제품 구매에 의한 적립', 3000, 'ABC123');
-- 회원 정보에 포인트를 누적
UPDATE MEMBER SET ME_POINT = ME_POINT + 3000 WHERE ME_ID = 'ABC123';

-- ABC123회원이 구매 확정한 ABC001제품 중 무선인 제품에 '좋은 마우스입니다.' 라고 리뷰를 등록했을 때 쿼리
INSERT INTO REVIEW(RE_CONTENT, RE_THUMB, RE_OP_NUM, RE_ME_ID)
VALUES('좋은 마우스입니다.', NULL, 1, 'ABC123');