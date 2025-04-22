# 대학마켓 프론트엔드

## 대학생들을 위한 안전한 중고거래 플랫폼 '대학마켓'의 프론트엔드 프로젝트입니다.

---

### 기술 스택

##### React.js

##### TailWind CSS

---

### 시작하기

#### 사전 요구사항

Node.js v18.20.8(LTS)

#### 프로젝트 설치

```
npm install
```

#### 프로젝트 실행

```
npm start
```

### 초기 세팅(아직 미적용)

환경 변수 설정 (.env 파일)

.env 파일 작성

REACT_APP_API_URL=http://localhost:8080/api

URL 라우팅

- 프로젝트의 주요 URL 경로:
- - '/': 홈페이지
- - '/login': 로그인 페이지
- - '/oauth/callback': 소셜 로그인 콜백 처리
- - '/products': 상품 목록 페이지
- - '/products/search?keyword=검색어': 상품 검색 결과
- - '/products/categories/:categoryId': 카테고리별 상품 목록
- - '/products/:id': 상품 상세 페이지
- - '/products/new': 상품 등록 페이지 (로그인 필요)
- - '/chat?roomId=:roomId': 채팅 페이지 (로그인 필요)
- - '/my-page': 사용자 프로필 페이지 (로그인 필요)
- - '/verify-university': 대학교 인증 페이지 (로그인 필요)
