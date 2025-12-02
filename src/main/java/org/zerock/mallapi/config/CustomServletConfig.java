 package org.zerock.mallapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.lang.NonNull;

@Configuration
public class CustomServletConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(@NonNull FormatterRegistry registry) {
        registry.addFormatter(new org.zerock.mallapi.controller.formatter.LocalDateFormatter());
    }

    // @Override
    // public void addCorsMappings(@NonNull CorsRegistry registry) {
    //     registry.addMapping("/**")  // 모든 경로에 대해 CORS 설정 적용
    //             .allowedOrigins("*") // 모든 출처 허용
    //             .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // 허용할 HTTP 메서드 설정
    //             .maxAge(3600)   // preflight 요청 캐시 시간 설정
    //             .allowedHeaders("Authorization", "Cache-Control", "Content-Type"); // 허용할 헤더 설정
    // }
} 
