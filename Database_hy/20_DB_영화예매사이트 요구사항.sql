/*
	영화 예매 사이트를 구축하기 위한 요구사항(CGV)
- 회원만 예매할 수 있다.
- 영화를 예매하기 위해서는 영화 선택, 극장 선택, 스케줄(시간대) 선택, 좌석 선택(여러좌석)을 해서 예매

- 관리자는 새로 개봉하는 영화를 등록한다.
- 영화 등록시, 영화제목, 개봉일, 장르, 감독과 배우, 기본정보(연령제한,런닝타임,제작국가), 메인포스터,줄거리, 트레일러(여러개), 스틸컷(여러개)를 입력하여 등록한다.
- 영화 제목은 한국어 제목과 영어 제목을 입력한다.
- 개봉일은 yyyy.MM.dd 형태로 입력하고, 오래된 영화이어서 개봉일을 알 수 없는 경우 생략 가능하다.
- 장르는 최소 1개이상 입력한다.
- 감독과 배우 이외의 다른 역할은 표기를 생략한다.
- 감독은 등록된 감독 중 선택하고, 여러명 선택할 수 있다. 신규 감독인 경우 새로 감독을 등록하고 선택한다.
- 배우는 등록된 배우 중 선택하고, 여러명 선택할 수 있다. 신규 배우인 경우 새로 배우를 등록하고 선택한다.
- 감독과 배우 선택은 제한이 없다.
- 감독과 배우는 동명이인의 경우 생일로 구분한다.
- 연령제한은 전체관람가, 12세 관람가, 15세 관람가, 청소년 관람불가, 제한상영가 중 하나를 선택한다.
- 런닝 타임은 분 단위로 입력한다.
- 제작국가는 등록된 국가 중 선택한다. 여러국가를 선택할 수 있다.
- 메인 포스터는 이미지이며, 반드시 선택해야 하며 최대 1장이다
- 트레일러는 영상이며, 여러개 선택할 수 있다.
- 스틸컷은 이미지이며, 여러개 선택할 수 있다.

- 제작 국가는 전 세계 모든 국가를 미리 등록한다.

- 감독/배우 등록은 같은 인물이어도 역할이 다르면 각각 등록해야 한다.
- 감독/배우 등록시 이름, 생년월일, 사진은 필수이며, 소속사, 최종 학력, 국적은 선택사항이다.
- 국적은 최대 1개만 선택할 수 있다.

- 관리자는 영화를 선택하고, 상영종료를 클릭하여 해당 영화를 상영 종료 할 수 있다
- 상영 종료된 영화는 예매할 수 없다.

- 관리자는 영화관을 등록 시, 지역을 선택하고, 영화관명, 주소, 전체 관수, 전체 좌석 수, 각 관을 입력하여 등록한다.
- 각 관은 관명을 입력하고, 해당관의 전체좌석수, 좌석을 등록한다. 
- 관에서 좌석 등록시 행은 영어로, 열은 숫자로 표기하여 형과열로된 좌석 이름, 좌석의 특징을 등록한다. 
예: A1 일반,A2 일반,..., B1 커플,B2 커플,...

- 관리자는 영화를 등록한 후, 곧 개봉예정이거나 개봉중인 영화의 스케줄을 등록한다.
- 스케줄은 영화시작시간, 종료시간, 극장, 관을 선택하여 등록한다.
- 영화 시작시간을 입력하면 런닝타임에 광고시간 10분을 추가하여 종료시간이 자동으로 계산이 된다.

- 회원 가입 시, 아이디, 비번, 이름, 전화번호, 생년월일은 입력하고, 모든 항목은 필수 항목이다.
- 아이디는 중복되면 안되고, 6~15자리 영문, 숫자만 가능하다.
- 비번은 8~20자리 영문, 숫자, !@#$%만 가능하다.

- 영화 상세 정보는 영화 정보와 예매율, 리뷰를 보여준다.
- 리뷰는 최신순과 추천수순으로 조회할 수 있다.
- 예매율은 현재 전체 예매수에서 해당 영화 예매수를 비율로 표시한다.

- 영화 가격은 모든 관이 동일하다
- 성인은 14000, 청소년은 11000원이다
- 조조영화는 12시 이전에 개봉하는 영화를 말하며, 2000원 할인이 적용된다.





*/