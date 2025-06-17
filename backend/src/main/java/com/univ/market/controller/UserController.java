package com.univ.market.controller;

import com.univ.market.dto.request.UnivVerificationRequest;
import com.univ.market.dto.response.UserResponse;
import com.univ.market.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

/**
 * 사용자 관련 API 엔드포인트를 제공하는 컨트롤러
 * 사용자 정보 조회, 대학교 인증 등의 기능을 처리합니다.
 */
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;
    
    /**
     * 현재 로그인한 사용자 정보 조회 API
     * 
     * @param userId 현재 인증된 사용자 ID
     * @return 사용자 정보
     */
    @GetMapping("/me")
    public ResponseEntity<UserResponse> getCurrentUser(@AuthenticationPrincipal Long userId) {
        UserResponse response = userService.getUserById(userId);
        return ResponseEntity.ok(response);
    }
    
    /**
     * 대학교 인증 이메일 전송 API
     * 
     * @param userId 현재 인증된 사용자 ID
     * @param univEmail 대학교 이메일
     * @return 응답 없음 (200 OK)
     */
    @PostMapping("/verify/send")
    public ResponseEntity<Void> sendVerificationEmail(
            @AuthenticationPrincipal Long userId,
            @RequestParam String univEmail) {
        userService.sendUnivVerificationEmail(userId, univEmail);
        return ResponseEntity.ok().build();
    }
    
    /**
     * 대학교 인증 코드 확인 API
     * 
     * @param request 인증 확인 요청 데이터
     * @return 인증 결과
     */
    @PostMapping("/verify/confirm")
    public ResponseEntity<Boolean> verifyUnivEmail(
            @RequestBody UnivVerificationRequest request) {
        boolean isVerified = userService.verifyUnivEmail(request);
        return ResponseEntity.ok(isVerified);
    }
}