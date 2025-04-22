# 대학마켓

## 대학생들을 위한 안전한 중고거래 플랫폼 '대학마켓' 프로젝트입니다.


---

### git clone

```
git clone https://github.com/JeongwooAn/univ-market.git
```

```
cd univ-market
```

---

### 기술 스택

#### 백엔드

- Java 17 (JDK 17.0.14)

- Spring Boot

- Spring Data JPA

- Spring Security

- MySQL 8.0.41

- OAuth 2.0 (카카오 로그인)

- WebSocket (STOMP)

- AWS S3 (이미지 저장)

- JWT (인증)


#### 프론트엔드

- React.js

- TailWind CSS

---

### 주요 기능

#### 사용자 관리

1. 카카오 소셜 로그인
2. 대학교 이메일을 통한 인증
3. JWT 기반 인증

#### 상품 거래

1. 상품 등록/조회/수정/삭제
2. 이미지 업로드 (AWS S3)
3. 상품 검색 및 카테고리별 필터링
4. 거래 상태 관리 (판매중 → 예약중 → 판매완료)

#### 실시간 채팅

1. WebSocket을 활용한 실시간 메시지 교환
2. 채팅방 생성 및 관리
3. 메시지 영구 저장

#### 알림 기능

1. 상품 등록, 예약, 거래 완료 시 이메일 알림

---
