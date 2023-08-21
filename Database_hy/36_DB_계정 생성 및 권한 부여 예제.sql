/*
계정 생성
create user '아이디'@'접근방벙' identified by '비번';
- 접근 방법: localhost와 %
	- localhost : 내부 IP에서만 접근 가능하도록 설정
    - % : 외부 IP 에서도 접근 가능하도록 설정
*/
create user 'test'@localhost identified by '1234';

/*
권한 부여: 계정에 DB 및 테이블에 접근할 수 있는 권한을 설정
- 어떤 db에 접근할 수 있게 할건지
- 어떤 테이블에 접근 할수 있게 할건지
- 어떤 작업을 수행 (insert, delete, update, select) 할 수 있게 할건지

모든 작업을 수행할 수 있는 권한을 부여하는 방법
grant all privileges on DB명.테이블명 to '아이디'@'접근방법';
*/
grant all privileges on test.* to 'test'@'localhost';